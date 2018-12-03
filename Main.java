package random;
import java.util.Scanner;
//This is a recusive way to find the amount of ways to
//go up a stairwell (uses Fib seq)
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of steps in a stairwell: ");
        int steps = in.nextInt();
        System.out.println("Ways = " + countWays(steps));

    }
    public static int countWays(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return countWays(n - 2) + countWays(n - 1);
    }
}
