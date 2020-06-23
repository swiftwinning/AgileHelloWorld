public class AgileHelloWorld {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello You");
        } else {
            System.out.println("Hello " + args[0]);
        }
    }
}
