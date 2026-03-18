public class HelloApp {
    public static void main(String[] args) {
        // Print "Hello" first
        System.out.println("Hello");

        // Print all command-line arguments
        System.out.println("Command-line arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}