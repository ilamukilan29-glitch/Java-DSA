package SmartCliff;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NetworkCommands {

    public static void main(String[] args) {

        String[] commands = {
            "ipconfig",
            "ping 127.0.0.1",
            "nslookup google.com"
        };

        for (String command : commands) {
            System.out.println("\n================================");
            System.out.println("Executing: " + command);
            System.out.println("================================");

            try {
                Process process = Runtime.getRuntime().exec(command);

                BufferedReader reader =
                    new BufferedReader(
                        new InputStreamReader(process.getInputStream())
                    );

                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                process.waitFor();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}