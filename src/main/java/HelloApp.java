public class helloapp {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default message
            System.out.println("Hello");
        } else {
            // Build a string with delimiter (say, comma or space)
            StringBuilder sb = new StringBuilder();
            for (String arg : args) {
                sb.append(arg).append(",");  // add delimiter after each argument
            }

            // Remove the trailing delimiter using substring
            String result = sb.substring(0, sb.length() - 1);

            // Display the final string
            System.out.println("Arguments: " + result);
        }
    }
}