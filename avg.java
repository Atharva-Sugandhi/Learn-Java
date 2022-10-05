import java.util.*;

public class avg {

    public static void printAvg(int a, int b, int c) {
        float avg = (float) ((a + b + c)) / 3;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        printAvg(a, b, c);

        sc.close();
    }
}
