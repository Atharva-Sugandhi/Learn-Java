import java.util.*;

public class greatestCommonDivisor {
    public static int gcd(int a, int b) {
        int small;
        if (a < b) {
            small = a;
        } else {
            small = b;
        }
        for (int i = small - 1; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int ans = gcd(a, b);
        System.out.println(ans);
        sc.close();
    }
}
