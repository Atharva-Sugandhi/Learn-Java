import java.util.*;

public class printodd {
    public static void Odd(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Odd(n);

        sc.close();
        return;
    }
}
