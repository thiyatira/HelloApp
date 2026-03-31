public class HelloApp {
    public static void main(String[] args) {
        String names = "World";
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            // Append all names with ,
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            // Remove last ,
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }
        System.out.println("Hello, " + names + "!");
    }
}
