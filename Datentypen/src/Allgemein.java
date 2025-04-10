public class Allgemein {
    public static void main(String[] args) {
        // Datentypen in java

        // Zahlen:
        // Ganzzahlen, wie z.B. 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // byte, short, int, long
        byte b = 127; // 8 bit = 1 byte
        short s = 32000; // 16 bit = 2 byte
        int i = 2000000000; // 32 bit = 4 byte
        long l = 2000000000000000000L; // 64 bit = 8 byte

        // Fließkommazahlen
        // float, double
        float f = 1.23456789f; // 32 bit = 4 byte
        double d = 1.23456789; // 64 bit = 8 byte

        // Charaktere
        char c = 'A'; // 16 bit = 2 byte

        // Booleans (logische Werte)
        boolean isCorrect = true; // 1 bit = 1/8 byte

        // Strings (Zeichenketten)
        String str = "Hello, World!"; // (16 bit = 2 byte) pro Zeichen --> = 26 byte
    }
}
