import java.util.Scanner;

public class LeetcodeSytle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* ------------------------------------------------------------------------------- */

        /* Masala 6: Palindrome son

        Foydalanuvchi bitta butun son kiritadi.
        Agar son teskari yozilganda ham o‘sha son bo‘lsa,
        "Palindrome" deb chiqaring, aks holda "Palindrome emas".

         */

        /*
        int num, a, b;
        System.out.print("Son kiriting: ");
        num = sc.nextInt();

        a = num / 100;
        b = num % 10;


        if (a == b) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
        */

        /* ------------------------------------------------------------------------------- */

        /*
        Masala 7: FizzBuzz

        Foydalanuvchi bitta son kiritadi (n). Siz 1 dan n gacha bo‘lgan sonlarni ekranga chiqaring:

        Agar son 3 ga bo‘linsa → "Fizz"

        Agar son 5 ga bo‘linsa → "Buzz"

        Agar son 3 va 5 ga bo‘linsa → "FizzBuzz"

        Aks holda → o‘zini chiqarish
         */

        /*
        int num, counter;
        System.out.print("Son kiriting: ");
        num = sc.nextInt();
        counter = 0;

        while (counter <= num) {
            if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(counter);
            }
            counter += 1;
        }

         */
    }
}
