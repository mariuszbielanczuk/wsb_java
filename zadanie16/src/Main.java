public class Main {


    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(i + ": " + fib(i)+ "\n");
        }
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
