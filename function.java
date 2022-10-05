import java.util.*;

class Function {
    public static int Factorial(int a) {
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        int ans = Factorial(a);
        System.out.println("Answer = " + ans);

        sc.close();
    }
}