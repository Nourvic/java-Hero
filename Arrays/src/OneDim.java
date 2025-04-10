public class OneDim {
    public static void main(String[] args) {
        // Array erstelle, wenn die werte schon bekannt sind
        int[] array1 = {50, 60, 70};
        System.out.println("Array 1");
        System.out.println("Länge des Arrays: " + array1.length);

        // get
        System.out.print(array1[0] + " ");
        System.out.print(array1[1] + " ");
        System.out.print(array1[2] + " ");
        System.out.println();
        // set
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        System.out.print(array1[0] + " ");
        System.out.print(array1[1] + " ");
        System.out.print(array1[2] + " ");

        System.out.println();


        // unbekannte daten
        int[] array2 = new int[3]; // {0, 0, 0}
        System.out.print(array2[0] + " ");
        System.out.print(array2[1] + " ");
        System.out.print(array2[2] + " ");
        System.out.println();
        // set
        array2[0] = 10;
        array2[1] = 20;
        array2[2] = 30;
        System.out.print(array2[0] + " ");
        System.out.print(array2[1] + " ");
        System.out.print(array2[2] + " ");
        System.out.println();
        int[] array3 = new int[5];// {0, 0, 0, 0, 0}
        fillArrayWithOne(array3); // {1, 1, 1, 1, 1}

        System.out.println(array3[2]);


        int[] array4 = new int[10];
        fillArray(array4, 0, 10);
        printArray(array4);


        int[] array5 = new int[10];
        fillArrayVielfachenVonNAndPrintIt(array5, 5);


        char[] array6 = new char[26];
        fillCharArrayWithAlphabet(array6);
        printArray(array6);
        System.out.println("Search a in array --> " + search('a', array6));
        System.out.println("Search k in array --> " + search('k', array6));
        System.out.println("Search a in array --> " + search('#', array6));
    }

    public static void fillCharArrayWithAlphabet(char[] array) {
        char a = 'a';
        for (int i = 0; i < array.length; i++) {
            array[i] = a++;
        }
    }


    public static boolean search(char letter, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letter) {
                return true;
            }
        }
        return false;
    }

    public static void fillArrayWithOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
    }

    public static void fillArray(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            array[i] = ((i + 1) * 10);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillArrayVielfachenVonNAndPrintIt(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (n * (i + 1));
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
