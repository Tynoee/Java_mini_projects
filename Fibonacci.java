import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Fibonacci numbers: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");

        if (n >= 1) {
            System.out.print(first + " ");
        }

        if (n >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}

