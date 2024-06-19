public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide two positive integers as command-line arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a <= 0 || b <= 0) {
            System.out.println("Error: Both numbers must be positive integers.");
            return;
        }

        if (a + b > 100) {
            System.out.println("Sum: " + (a + b));
        } else if (a + b == 100) {
            System.out.println("Product: " + (a * b));
        } else {
            System.out.println("Difference: " + (Math.max(a, b) - Math.min(a, b)));
        }
    }
}
