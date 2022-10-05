import java.util.*;

public class count {
    public static void counter(int n) {

        Scanner sc = new Scanner(System.in);
        int posi = 0, nega = 0, zero = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (a > 0) {
                posi++;
            } else if (a < 0) {
                nega++;
            } else {
                zero++;
            }
        }
        System.out.println(posi);
        System.out.println(nega);
        System.out.println(zero);
        sc.close();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        counter(n);
        sc.close();
        return;
    }
}
