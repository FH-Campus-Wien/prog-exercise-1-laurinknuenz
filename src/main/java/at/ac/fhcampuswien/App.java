package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals() {
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int sum = a + b + c + (int) d + (int) e + (int) f + (int) g + (int) h;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int zahl1 = scanner.nextInt();
        int zahl2 = scanner.nextInt();
        System.out.println(zahl1 + zahl2);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();

        x += y;
        y = x - y;
        x -= y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        int n1;
        int n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        Scanner scanner = new Scanner(System.in);
        int revenue;
        System.out.print("Enter annual Revenue: ");
        revenue = scanner.nextInt();
        if (revenue >= 0 && revenue < 20000) System.out.println("Poor Sales Revenue");
        else if (revenue >= 20000 && revenue < 50000) System.out.println("Average Sales Revenue");
        else if (revenue >= 50000 && revenue < 80000) System.out.println("Good Sales Revenue");
        else if (revenue >= 80000 && revenue < 100000) System.out.println("Excellent Sales Revenue");
        else System.out.println("Invalid Revenue");
    }

    //todo Task 8
    public void getCommissionRate() {
        Scanner scanner = new Scanner(System.in);
        int rate;
        System.out.print("Enter CommissionClass: ");
        rate = scanner.nextInt();

        switch (rate) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }

    }

    //todo Task 9
    public void leapyear() {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Year: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    System.out.println("Not a Leapyear");
                } else System.out.println("Leapyear");
            } else System.out.println("Leapyear");
        } else System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int hundred;
        int ten;
        int one;
        System.out.print("Number: ");
        number = scanner.nextInt();

        ten = number % 100;
        hundred = (number - ten) / 100;
        one = ten % 10;

        System.out.println(one * 100 + (ten - one) + hundred);
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}