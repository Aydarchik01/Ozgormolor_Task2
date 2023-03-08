import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        int a = scanner.nextShort();
        System.out.print(" b = ");
        int b = scanner.nextShort();
        System.out.print(" a = ");
        int c = scanner.nextShort();
        int sum = a + b + c;
        int sum1 = a * b * c;
        double sum2 = a + b + c;
        System.out.println(a + "+" + b + "+" + c + "= " + sum);
        System.out.println(a + "*" + b + "*" + c + "= " + sum1);
        System.out.println("(" + a + "+" + b + "+" + c + ")" + "/3" + "= " + sum2 / 3);
    }
}