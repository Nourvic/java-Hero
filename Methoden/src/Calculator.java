import java.util.Scanner;

public class Calculator {
    // globale Variablen
    static int number1;
    static int number2;
    static String operation;

    public static void main(String[] args) {
        startCalculator();
    }

    public static void startCalculator() {
        Scanner scanner = new Scanner(System.in);

        String answer;
        System.out.println("Willkommen im Taschenrechner");
        do {
            System.out.println("--------------------------------------------------------");
            eingabe();
            calculate();
            System.out.println("--------------------------------------------------------");

            System.out.print("Möchten Sie eine weitere Berechnung durchführen? (ja/nein): ");
            answer = scanner.next();
        } while (answer.equals("ja"));
    }

    public static void eingabe() {
        Scanner s = new Scanner(System.in);

        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        number1 = s.nextInt();

        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        number2 = s.nextInt();

        System.out.print("Bitte geben Sie die Operation ein (+, -, *, /): ");
        operation = s.next();
    }

    public static void calculate() {
        switch (operation) {
            case "+":
                add(number1, number2);
                break;
            case "-":
                sub(number1, number2);
                break;
            case "*":
                mul(number1, number2);
                break;
            case "/":
                div(number1, number2);
                break;
            default:
                System.out.println("Bitte eine gültige Operation eingeben");
        }
    }

    public static void add(int x, int y) {
        int z = x + y;
        System.out.println("Die Summe von x(" + x + ") und y(" + y + ") ist = " + z);
    }

    public static void sub(int x, int y) {
        int z = x - y;
        System.out.println("Die Sub von x(" + x + ") und y(" + y + ") ist = " + z);
    }

    public static void mul(int x, int y) {
        int z = x * y;
        System.out.println("Die Multiplikation von x(" + x + ") und y(" + y + ") ist = " + z);
    }

    public static void div(int x, int y) {
        int z = x / y;
        System.out.println("Die Division von x(" + x + ") und y(" + y + ") ist = " + z);
    }
}
