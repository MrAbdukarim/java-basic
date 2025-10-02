import java.util.Scanner;

public class variableSwap {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Birinchi sonni kirit: ");
        a = sc.nextInt();

        System.out.print("Ikkinchi sonni kirit: ");
        b = sc.nextInt();

        System.out.println("Qiymatlar (avval):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Qiymatlar (almashgandan keyin):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
