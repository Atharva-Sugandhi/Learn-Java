import java.util.*;

public class fibonacci {
    public static void printFibonacci(int n) {
        int fi = 0, sc = 1;
        if (n == 0) {
            return;
        } else if (n == 1) {
            System.out.println("0");
            return;
        }
        System.out.print(fi + " " + sc);
        for (int i = 3; i <= n; i++) {
            int th = fi + sc;
            fi = sc;
            sc = th;
            System.out.print(" " + th);
        }
        return;
    }

    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }

}
