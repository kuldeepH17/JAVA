import java.util.Scanner;
public class exercise01 {
    public static int avarage(int a, int b, int c) {
        int sum = (a + b + c) / 3;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The avarage three no. = "+avarage(a, b, c));
        sc.close();
    }
}   





