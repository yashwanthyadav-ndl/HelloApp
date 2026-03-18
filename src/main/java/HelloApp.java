public class HelloApp{
    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length == 0) {
            // Default message
            System.out.println("Hello");
        } else {
            // Display all arguments using enhanced for loop
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}