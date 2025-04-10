import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        // Overloading oder Überladen von Methoden
        test(10); // 0
        test(10, 2.5f); //  1
        test(2.5f, 10); //  2
        test(10, 2, 5); // 3

    }

    public static void test(int a) {
        System.out.println(0);
    }

    public static void test(int x, float y) {
        System.out.println(1);
    }

    public static void test(float x, int y) {
        System.out.println(2);
    }

    public static void test(int x, int y, int z) {
        System.out.println(3);
    }

}
