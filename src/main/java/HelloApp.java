public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // name from command line argument
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // default message if no argument
            System.out.println("Hello, World!");
        }
    }
}
