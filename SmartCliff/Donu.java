package SmartCliff;
import java.util.Arrays;

public class Donu {

    // Terminal size
    static final int SCREEN_WIDTH = 80;
    static final int SCREEN_HEIGHT = 24;

    // Increase these values to reduce gaps
    static final double THETA_SPACING = 0.03;
    static final double PHI_SPACING = 0.02;

    // Smaller donut
    static final double R1 = 0.8;   // Tube radius
    static final double R2 = 1.6;   // Distance from center

    // Move donut farther away
    static final double K2 = 7;

    // Projection constant (smaller = smaller donut)
    static final double K1 = 18;

    static final String LUMINANCE = ".,-~:;=!*#$@";

    public static void main(String[] args) throws Exception {

        double A = 0;
        double B = 0;

        char[] output = new char[SCREEN_WIDTH * SCREEN_HEIGHT];
        double[] zBuffer = new double[SCREEN_WIDTH * SCREEN_HEIGHT];

        // Clear screen once
        System.out.print("\033[2J");

        while (true) {

            Arrays.fill(output, ' ');
            Arrays.fill(zBuffer, 0);

            double cosA = Math.cos(A);
            double sinA = Math.sin(A);
            double cosB = Math.cos(B);
            double sinB = Math.sin(B);

            for (double theta = 0; theta < 2 * Math.PI; theta += THETA_SPACING) {

                double costheta = Math.cos(theta);
                double sintheta = Math.sin(theta);

                for (double phi = 0; phi < 2 * Math.PI; phi += PHI_SPACING) {

                    double cosphi = Math.cos(phi);
                    double sinphi = Math.sin(phi);

                    // Circle before revolution
                    double circlex = R2 + R1 * costheta;
                    double circley = R1 * sintheta;

                    // Rotate in 3D
                    double x =
                            circlex * (cosB * cosphi + sinA * sinB * sinphi)
                                    - circley * cosA * sinB;

                    double y =
                            circlex * (sinB * cosphi - sinA * cosB * sinphi)
                                    + circley * cosA * cosB;

                    double z =
                            K2
                                    + cosA * circlex * sinphi
                                    + circley * sinA;

                    double ooz = 1.0 / z;

                    int xp = (int) (SCREEN_WIDTH / 2 + K1 * ooz * x);
                    int yp = (int) (SCREEN_HEIGHT / 2 - K1 * ooz * y);

                    if (xp < 0 || xp >= SCREEN_WIDTH ||
                        yp < 0 || yp >= SCREEN_HEIGHT)
                        continue;

                    double L =
                            cosphi * costheta * sinB
                                    - cosA * costheta * sinphi
                                    - sinA * sintheta
                                    + cosB * (cosA * sintheta
                                    - costheta * sinA * sinphi);

                    if (L <= 0)
                        continue;

                    int idx = xp + yp * SCREEN_WIDTH;

                    if (ooz > zBuffer[idx]) {

                        zBuffer[idx] = ooz;

                        int luminanceIndex = (int) (L * 8);

                        if (luminanceIndex < 0)
                            luminanceIndex = 0;

                        if (luminanceIndex >= LUMINANCE.length())
                            luminanceIndex = LUMINANCE.length() - 1;

                        output[idx] = LUMINANCE.charAt(luminanceIndex);
                    }
                }
            }

            // Move cursor to top-left (no flicker)
            System.out.print("\033[H");

            StringBuilder frame = new StringBuilder();

            for (int y = 0; y < SCREEN_HEIGHT; y++) {
                frame.append(output, y * SCREEN_WIDTH, SCREEN_WIDTH);
                frame.append('\n');
            }

            System.out.print(frame);

            // Rotate
            A += 0.04;
            B += 0.02;

            // ~60 FPS
            Thread.sleep(16);
        }
    }
}