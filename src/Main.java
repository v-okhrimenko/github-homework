public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        switch (args.length) {
            case 1:
                print(args[0]);
                break;
            case 2:
                try {
                    print(args[0], Integer.parseInt(args[1]));
                } catch (NumberFormatException e) {
                    System.out.println("Enter correct second parameter - it must be digit(integer)");
                }
                break;
            default:
                System.out.println("Invalid number of arguments. Enter 2 arguments: first - text, second -integer. Its set how many " +
                        "times text output to the console ");
        }
    }

    static void print(String txt) {
        System.out.println(txt);
    }

    static void print(String txt, int iteration) {
        for (int i = 0; i < iteration; i++) {
            System.out.println(txt);
        }
    }
}