public class Main {
    public static void main(String[] args) {
        // Operatoren in Java
        // Arithmetische Operatoren (+, -, *, /, %)
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;
        System.out.println("Summe: " + sum);
        System.out.println("Differenz: " + diff);
        System.out.println("Produkt: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Rest: " + rem);


        // Inkrement- und Dekrementoperatoren (++, --) +1, -1
        int x = 10; // x in speicher = 10

        System.out.println(x++); // post inkrement, x ist 10 auf der konsole, x in speicher = 11
        System.out.println(--x); // pre dekrement, x ist 10 auf der konsole, x in speicher = 10

        // Zuweisungsoperatoren (=, +=, -=, *=, /=, %=)
        int y = 10;
        y = y + 5; // y = 15
        y += 5; // y = 20
        y -= 5; // y = 15
        y *= 5; // y = 75
        y /= 5; // y = 15
        y %= 5; // y = 0


        // Vergleichsoperatoren (==, !=, <, >, <=, >=)
        int w = 10;
        int z = 20;

        boolean isEqual = (w == z); // ja, nein --> true, false
        boolean isNotEqual = (w != z); // ja, nein --> true, false (! --> negieren)
        boolean isLessThan = (w < z); // ja, nein --> true, false
        boolean isGreaterThan = (w > z); // ja, nein --> true, false
        boolean isLessOrEqual = (w <= z); // ja, nein --> true, false
        boolean isGreaterOrEqual = (w >= z); // ja, nein --> true, false

        System.out.println("w ist gleich z: " + isEqual);
        System.out.println("w nicht gleich z: " + isNotEqual);
        System.out.println("w kleiner z: " + isLessThan);
        System.out.println("w großer z: " + isGreaterThan);
        System.out.println("w kleiner gleich z: " + isLessOrEqual);
        System.out.println("w großer gleich z: " + isGreaterOrEqual);


        // Logische Operatoren (&&, ||, !)
        int f = -5;

        boolean frage1 = (f > 0) && (f < 10); // true
        System.out.println("frage1: " + frage1);
        boolean frage2 = (f > 0) || (f < 10); // true
        System.out.println("frage2: " + frage2);

        System.out.println(!frage1); //true


        // beispiel für konkatination
        System.out.println("Text " + "Text2 " + (1+2) + x + frage1 + " end!"); // concatenation, concat, cat

    }
}

