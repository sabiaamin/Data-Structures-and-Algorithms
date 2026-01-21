import java.util.Scanner;

public class _04_Gcd_optimized_GG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int result = gcd(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + result);

        sc.close();
    }

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b,a%b);
    }
}
