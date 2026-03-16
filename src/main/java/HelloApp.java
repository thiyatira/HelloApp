public class HelloApp {
    public static void main(String[] args) {
        // default name
        String name = "World";
        // check if a name is provided
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello, " + name + "!");
    }
}
