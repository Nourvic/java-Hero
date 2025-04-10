import java.util.Random;
import java.util.Scanner;

public class Loesung1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        zahlenVon1Bis10();
        doFakultat();
        System.out.println("\nPrimzahl ist oder nicht:");
        System.out.print("Bitte geben Sie ein Zahl: ");
        int n = scanner.nextInt();
        boolean isPrime = prime(n);
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        System.out.println("\nFibo until bound");
        System.out.print("Bitte geben Sie ein Zahl: ");
        int bound = scanner.nextInt();
        fibo(bound);
        erratenVon1Bis100();

        System.out.println("\n\nSumme gerade Zahlen in einem Bereich");
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        int start = scanner.nextInt();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        int end = scanner.nextInt();
        int summe = summeGeradeZahlen(start, end);
        System.out.println("\nSummer gerade Zahlen zwischen " + start + " und " + end + " = " + summe);


        listeVonZahlen();

        System.out.println("\n\nVokalen");
        System.out.print("Bitte geben Sie ein Text ein: ");
        String text = scanner.nextLine();
        vokalen(text);


        System.out.println("\n\nGGT");
        System.out.print("Bitte geben die erste Zahl ein: ");
        int nr1 = scanner.nextInt();
        System.out.print("Bitte geben die zweite Zahl ein: ");
        int nr2 = scanner.nextInt();

        int resultOfGgt = ggt(nr1, nr2);
        System.out.println("GGT von " + nr1 + " und " + nr2 + " ist " + resultOfGgt);

        System.out.println("\n\nUmkehren von String Zahl");
        System.out.print("Bitte geben eine Zahl ein: ");
        String number = scanner.next();
        int reservedNumber = umkehren(number);
        System.out.println("Backward: " + reservedNumber);
    }

    public static void zahlenVon1Bis10() {
        System.out.println("Zahlen von 1 bis 10 mithilfe einer for-Schleife: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
    }

    public static int fakultät(int n) {
        int fak = 1;
        for (int i = 1; i <= n; i++) {
            fak *= i;
        }
        return fak;
    }

    public static void doFakultat() {
        System.out.println("\n\nFakultät einer eingegebenen Zahl: ");
        System.out.print("Bitte geben Sie ein Zahl: ");
        int n = scanner.nextInt();
        int fak = fakultät(n);
        System.out.println("Fakultät von " + n + " = " + fak);
    }

    public static boolean prime(int n) {
        int anzahlTeiler = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                anzahlTeiler++;
            }
        }
        if (anzahlTeiler == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void fibo(int bound) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int i = 0; i < bound - 2; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void erratenVon1Bis100() {
        System.out.println("\n\nNummer Erraten");
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        int counter = 0;
        do {
            counter++;
            System.out.print("Geben Sie eine Zahl zwischen 1 und 100 ein: ");
            userGuess = scanner.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("Zu hoch!");
            } else if (userGuess < numberToGuess) {
                System.out.println("Zu niedrig!");
            } else {
                System.out.println("Richtig! Die Zahl war " + userGuess + " die wurde nach " + counter + " Versuche gefunden!");
            }
        } while (userGuess != numberToGuess);
    }

    public static int summeGeradeZahlen(int start, int end) {
        int summe = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                summe += i;
                if (i == end) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " + ");
                }
            }
        }
        return summe;
    }

    public static void listeVonZahlen() {

        System.out.println("\n\nListe von Zahlen:");
        System.out.print("Bitte geben Sie die Anzahl von Zahlen ein: ");
        int anzahlNummern = scanner.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= anzahlNummern; i++) {
            System.out.print("Bitte geben Sie Zahl " + i + " ein: ");
            int nr = scanner.nextInt();
            if (nr > 0) {
                positiveCount++;
            } else if (nr < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Anzahl der positiven Zahlen: " + positiveCount);
        System.out.println("Anzahl der negative Zahlen: " + negativeCount);
        System.out.println("Anzahl der null Zahlen: " + zeroCount);
    }

    public static void vokalen(String text) {
        int vocalCounter = 0;
        int constantCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'o' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'O' || text.charAt(i) == 'u' || text.charAt(i) == 'i' || text.charAt(i) == 'ö' || text.charAt(i) == 'U' || text.charAt(i) == 'I' || text.charAt(i) == 'Ö' || text.charAt(i) == 'ü' || text.charAt(i) == 'ä' || text.charAt(i) == 'Ü' || text.charAt(i) == 'Ä') {
                vocalCounter++;
            } else {
                constantCounter++;
            }
        }
        System.out.println("Anzahl der Vokalen: " + vocalCounter);
        System.out.println("Anzahl der Konstanten: " + constantCounter);


    }


    public static int ggt(int nr1, int nr2) {
        int ggt = 1;
        for (int i = 1; i <= nr1 && i <= nr2; i++) {
            if (nr1 % i == 0 && nr2 % i == 0) {
                ggt = i;
            }
        }
        return ggt;
    }


    public static int umkehren(String number) {
        System.out.println("Forward: " + number);
        System.out.print("Backward: ");
        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i));
        }

        System.out.println("\n\nUmkehren von int Zahl");
        System.out.print("Bitte geben eine Zahl ein: ");
        int number1 = scanner.nextInt();
        System.out.println("Forward:  " + number1);
        int reservedNumber = 0;
        while (number1 != 0) {
            reservedNumber = reservedNumber * 10 + number1 % 10;
            number1 = number1 / 10;
        }
        return reservedNumber;
    }
}
