package SmartCliff;
import java.util.Arrays;

public class Donut {

    public static void main(String[] args) throws InterruptedException {

        double A = 0, B = 0;

        final int screenWidth = 80;
        final int screenHeight = 30;

        final double thetaSpacing = 0.02;
        final double phiSpacing = 0.02;

        final double R1 = 1;
        final double R2 = 2;
        final double K2 = 5;
        final double K1 = 30;

        char[] output = new char[screenWidth * screenHeight];
        double[] zBuffer = new double[screenWidth * screenHeight];

        String luminance = ".,-~:;=!*#$@";

        while (true) {

            Arrays.fill(output, ' ');
            Arrays.fill(zBuffer, 0);

            double cosA = Math.cos(A);
            double sinA = Math.sin(A);
            double cosB = Math.cos(B);
            double sinB = Math.sin(B);

            for (double theta = 0; theta < 2 * Math.PI; theta += thetaSpacing) {

                double costheta = Math.cos(theta);
                double sintheta = Math.sin(theta);

                for (double phi = 0; phi < 2 * Math.PI; phi += phiSpacing) {

                    double cosphi = Math.cos(phi);
                    double sinphi = Math.sin(phi);

                    // Circle before revolving
                    double circlex = R2 + R1 * costheta;
                    double circley = R1 * sintheta;

                    // 3D coordinates after rotation
                    double x = circlex * (cosB * cosphi + sinA * sinB * sinphi)
                            - circley * cosA * sinB;

                    double y = circlex * (sinB * cosphi - sinA * cosB * sinphi)
                            + circley * cosA * cosB;

                    double z = K2
                            + cosA * circlex * sinphi
                            + circley * sinA;

                    double ooz = 1 / z;

                    int xp = (int) (screenWidth / 2 + K1 * ooz * x);
                    int yp = (int) (screenHeight / 2 - K1 * ooz * y);

                    double L =
                            cosphi * costheta * sinB
                                    - cosA * costheta * sinphi
                                    - sinA * sintheta
                                    + cosB * (cosA * sintheta
                                    - costheta * sinA * sinphi);

                    if (L > 0) {

                        if (xp >= 0 && xp < screenWidth &&
                                yp >= 0 && yp < screenHeight) {

                            int idx = xp + screenWidth * yp;

                            if (ooz > zBuffer[idx]) {

                                zBuffer[idx] = ooz;

                                int luminanceIndex = (int) (L * 8);

                                if (luminanceIndex < 0)
                                    luminanceIndex = 0;

                                if (luminanceIndex >= luminance.length())
                                    luminanceIndex = luminance.length() - 1;

                                output[idx] = luminance.charAt(luminanceIndex);
                            }
                        }
                    }
                }
            }

            // ANSI escape sequence to clear screen
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int y = 0; y < screenHeight; y++) {
                for (int x = 0; x < screenWidth; x++) {
                    System.out.print(output[x + screenWidth * y]);
                }
                System.out.println();
            }

            A += 0.04;
            B += 0.02;

            Thread.sleep(30);
        }
    }
}