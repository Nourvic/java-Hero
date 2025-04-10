import java.util.Random;

public class Loesung2 {
    public static void main(String[] args) {

        int[] randomArray = aufgabe4A();
        printArray(randomArray);
        aufgabe4B(randomArray);
        aufgabe4C(randomArray);


        String[] stringArray = aufgabe5();
        printArray(stringArray);
        aufgabe6(stringArray, 1, 2);
        printArray(stringArray);
        aufgabe7(stringArray);
        printArray(stringArray);

        System.out.println(aufgabe8(new int[]{2, 2, 4, 4, 6}));

        System.out.println(aufgabe9(new String[]{"Jamil", "Ahmad", "Hassan", "Adnan", "Emad", "Nour", "Shahd"}));

    }


    private static int[] aufgabe4A() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(50) + 1;
        }
        return array;
    }

    private static void aufgabe4B(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum ist " + min);
    }

    private static void aufgabe4C(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum ist " + max);
    }

    private static String[] aufgabe5() {
        return new String[]{"Mrs.Smith", "Mr.Lowe", "Mr.Wiesmann", "Stark", "Jörges", "Mrs.Kunau"};
    }

    private static void aufgabe6(String[] array, int index1, int index2) {
        if ((index1 >= 0 && index1 < array.length) &&
                (index2 >= 0 && index2 < array.length)) {
            String replace = array[index1];
            array[index1] = array[index2];
            array[index2] = replace;
        } else {
            System.out.println("Index ist nicht valid!");
        }
    }

    private static void aufgabe7(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith("Mr.")) {
                array[i] = array[i].replace("Mr.", "");
            }
            if (array[i].startsWith("Mrs.")) {
                array[i] = array[i].substring(4);
            }
        }
    }

    // {2, 2, 3, 4, 5}
    private static boolean aufgabe8(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int aufgabe9(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == 'a' ||
                    array[i].startsWith("A") ||
                    array[i].startsWith("e") ||
                    array[i].startsWith("E") ||
                    array[i].startsWith("i") ||
                    array[i].startsWith("I") ||
                    array[i].startsWith("o") ||
                    array[i].startsWith("O") ||
                    array[i].startsWith("u") ||
                    array[i].startsWith("U")) {
                counter++;
            }
        }
        return counter;
    }
}
