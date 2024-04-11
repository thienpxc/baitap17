

import java.util.Scanner;

public class Exercise9 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0, fib2 = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương n: ");
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập số nguyên dương.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Số bạn nhập không hợp lệ. Vui lòng nhập số nguyên dương.");
                scanner.nextLine();
            }
        }
        System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacci(n));
        scanner.close();
    }
}
