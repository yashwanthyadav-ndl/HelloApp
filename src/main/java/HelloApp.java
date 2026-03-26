class HelloApp {
    public static void main(String[] args) {
        // If arguments are passed, join them with spaces
        if (args.length > 0) {
            String message = String.join(" ", args);
            System.out.println(message);
        } else {
            // Default message
            System.out.println("Hello");
        }
    }
}