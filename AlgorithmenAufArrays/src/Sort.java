public class Sort {
    public static void main(String[] args) {
        int[] array = {100, 40, 46, 25, 12, 37,75};
        System.out.print("Before: ");
        printarray(array);
        bubbleSort2(array);
        System.out.print("After:  ");
        printarray(array);
    }

    public static void printarray(int feld[]) {
        for (int i = 0; i < feld.length; i++) {
            System.out.print(feld[i] + " ");
        }
        System.out.println();
    }


    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Swap.swap(array, j, j + 1);
                }
            }
        }
    }
}
