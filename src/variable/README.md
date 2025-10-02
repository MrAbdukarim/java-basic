## O‘zgaruvchi (Variable) nima?

O‘zgaruvchi — kompyuter xotirasida ma’lum turdagi qiymat saqlaydigan nomlangan joy. Java’da o‘zgaruvchilar qiymat turiga (type) bog‘langan — ya’ni har bir o‘zgaruvchining tipi oldindan aniqlanadi.

### Java’da turlari — ikki katta guruh

**Primitive** (oddiy) turlar — to‘g‘ridan-to‘g‘ri qiymatni saqlaydi:
byte, short, int, long, float, double, char, boolean

**Reference** (ma’lumotga havola) turlar — obyektlar: String, Array, class tiplar va boshqalar. Reference o‘zgaruvchi xotirada obyektga ko‘rsatkich (havola)ni saqlaydi; obyekt esa heap’da joylanadi.

### Primitive turlarning umumiy xususiyatlari (qisqacha)

```byte — 8-bit butun son

short — 16-bit butun son

int — 32-bit butun son (eng ko‘p ishlatiladi)

long — 64-bit butun son (oxiriga L qo‘yiladi)

float — 32-bit haqiqiy son (oxiriga f)

double — 64-bit haqiqiy son (default haqiqiy)

char — 16-bit Unicode xarakter (masalan 'A')

boolean — true yoki false (o‘lchami til spetsifikatsiyasida aniq berilmagan)
```

### E’lon qilish va qiymat berish (declaration va initialization)
``` int age;             // e'lon (declaration) — hozircha qiymat yo'q (locallarda ishlatilmaydi)
age = 25;            // qiymat berish (initialization)

int year = 2025;     // declaration + initialization birga
```

### Type va syntax misollar
```double salary = 1250.50;
char letter = 'A';
boolean isActive = true;
String name = "Abdukarim"; // String — reference type
long bigNumber = 123456789L;
float percent = 12.5f;
```
### O‘zgartirish (reassignment) va final
``` int x = 10;
x = 20; // ruxsat — qayta tayinlash mumkin

final int MAX_USERS = 100; // final — o'zgarmas (constant)
```

**final** bilan e’lon qilingan o‘zgaruvchiga faqat bir marta qiymat beriladi — keyin o‘zgartirish mumkin emas. Constants odatda static final va katta harflarda yoziladi: public static final double PI = 3.14159;

### Scope - ko‘rinish doirasi (local, instance, class)

- Local variable — metod ichida e’lon qilingan; faqat o‘sha metod ichida ko‘rinadi. (locallar avtomatik default qiymatga ega emas — dasturchi boshlang‘ich qiymat berishi shart).

- Instance (field) — class ichida lekin static bo‘lmagan; obyekt bilan bog‘liq.

- Static (class) variable — static bilan e’lon qilingan; class darajasida yagona nusxa.

Misol:

```
public class Person {
public static int population = 0; // static field
private String name;              // instance field

    public Person(String name) {
        this.name = name;             // local variable 'name' metod parametr
        population++;
    }

    public void greet() {
        String msg = "Salom";         // local variable
        System.out.println(msg + ", " + this.name);
    }
}
```
### Default qiymatlar

- Field (instance/static) uchun default: int→0, double→0.0, boolean→false, char→'\u0000', reference→null.

- Local variablelar default qiymatga ega emas — ishlatishdan oldin qiymat berilishi shart (yo‘q bo‘lsa kompilyatsiya xatosi).

### Type casting — kengaytirish va qisqartirish

- Widening (implicit, xavfsiz): int → long → float → double. Misol: int a = 5; double d = a;

- Narrowing (explicit, ehtiyotkorlik): double → int — bu holda ma’lumot (o‘nlik qismi) yo‘qotilishi mumkin: int i = (int) 3.99; // 3

Misol:
```
double d = 9.7;
int i = (int) d; // i = 9
```
### Boxing / Unboxing (Wrapper classes)

Primitive turlarni object sifatida ishlatish uchun wrapper mavjud: Integer, Double, Boolean, Character va hokazo.
```
int a = 5;
Integer boxed = a;      // autoboxing
int b = boxed;          // unboxing
```
### String va == vs equals()

- String immutable (o‘zgarmas).

- Ob’ektlarni taqqoslashda == — reference tengligini tekshiradi (bir xil xotira manzili), equals() esa kontentni solishtiradi. String uchun matnni tekshashda equals() ishlatiladi.
```
String a = new String("salom");
String b = new String("salom");
System.out.println(a == b);        // false
System.out.println(a.equals(b));   // true
```

### Oddiy misollar — bir nechta kodlar

1. Deklaratsiya va print:
```
public class VarsDemo {
public static void main(String[] args) {
int age = 20;
double gpa = 3.75;
boolean passed = true;
System.out.println("Age: " + age + ", GPA: " + gpa + ", Passed: " + passed);
    }
}
``` 
2. Final constant:
```
public class Circle {
public static final double PI = 3.141592653589793;
public static void main(String[] args) {
double r = 5.0;
double area = PI * r * r;
System.out.println("Area: " + area);
    }
}
```
3. Type casting:
```
public class CastDemo {
public static void main(String[] args) {
double d = 9.99;
int i = (int) d; // 9
System.out.println(i);
    }
}
```

4. Scanner bilan kirish:
```
import java.util.Scanner;

public class SumInput {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Birinchi son: ");
int a = sc.nextInt();
System.out.print("Ikkinchi son: ");
int b = sc.nextInt();
System.out.println("Yig‘indi: " + (a + b));
sc.close();
}
}
```
### Umumiy xatolar (common pitfalls)

- Local variableni qiymatsiz ishlatish → kompilyatsiya xatosi.
== bilan String solishtirish → noto‘g‘ri natija.
- Integer division: 5 / 2 = 2 (agar int/int) — agar haqiqiy natija kerak bo‘lsa 5.0 / 2 yoki (double)5 / 2.
- Narrowing cast qilinganda qiymat yo‘qotilishi.