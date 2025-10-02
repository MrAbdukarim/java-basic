import java.util.Scanner;

public class PracticeVariable {
    public static void main(String[] args) {

        // Ex1
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Ismingizni kiriting: ");
        String name = sc.next();

        System.out.print("Yoshingizni kiriting: ");
        int age = sc.nextInt();

        System.out.println("Salom " + name + ", siz " + age + " yoshdasiz.");

        sc.close();
        */

        // Ex 2
        /*
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Uchburchak a burchakkini kiriting: ");
        a = sc.nextInt();
        System.out.print("Uchburchak b burchakkini kiriting: ");
        b = sc.nextInt();
        System.out.print("Uchburchak c burchakkini kiriting: ");
        c = sc.nextInt();

        System.out.println("Uchburchak parametri: " + (a + b + c));
         */

        // Ex 3
        /*
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinchi soni kiriting: ");
        a = sc.nextInt();
        System.out.print("Ikkinchi soni kiriting: ");
        b = sc.nextInt();

        a += b;
        b = a - b;
        a -= b;
        System.out.println("Siz kiritgan sonlar almashtirilganda:");
        System.out.println("a= " + a + ", " + "b= " + b);
         */

        //Ex4
        // If/else
        /*
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tenglamadagi a soni kiriting: ");
        a = scanner.nextInt();
        System.out.print("Tenglamadagi b soni kiriting: ");
        b = scanner.nextInt();
        System.out.print("Tenglamadagi c soni kiriting: ");
        c = scanner.nextInt();

        int D = b * b - 4 * (a * c);
        if (D > 0) {
            System.out.println("2 ta ildiz mavjud.");
        } else if (D == 0) {
            System.out.println("1ta ildiz mavjud.");
        } else {
            System.out.println("haqiqiy ildiz yo'q.");
        }*/

        //Ex5
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Siz kiritgan son MUSBAT!");
        } else if (a < 0) {
            System.out.println("Siz kiritgan son MANFIY!");
        } else {
            System.out.println("Siz 0 kiritdingiz!");
        }
         */
    }
}
