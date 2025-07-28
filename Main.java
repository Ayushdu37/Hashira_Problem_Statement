import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        // Define the directory to scan for test case files — current directory (project root)
        File folder = new File(".");

        // List all files ending with '.json' in the folder
        File[] jsonFiles = folder.listFiles((dir, name) -> name.endsWith(".json"));

        // If no JSON test case files are found, exit with a message
        if (jsonFiles == null || jsonFiles.length == 0) {
            System.out.println("No test case files found.");
            return;
        }

        // Iterate through each JSON file found
        for (File file : jsonFiles) {
            // Only process files that begin with 'testcase' (e.g., testcase1.json)
            if (file.getName().toLowerCase().startsWith("testcase")) {
                // Create a new SecretSolver instance with the file name
                SecretSolver solver = new SecretSolver(file.getName());

                // Call the solve method to compute the secret from the test case
                String secret = solver.solve();

                // Print the secret associated with the current test case file
                System.out.println("Secret for " + file.getName() + ": " + secret);
            }
        }
    }
}
