public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        if (args.length == 1) {
            print(args[0]);
        } else {
            System.out.println("Invalid number of arguments. Enter 2 arguments: first - text, second - how many " +
                    "times text output to the console ");
        }
    }

    static void print(String txt) {
        System.out.println(txt);
    }
}