public class CallBY {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before edit x= " + x);
        editX(x);
        System.out.println("After  edit x= " + x);

        int[] array = {1, 2, 3};
        System.out.println("Before edit array[0]= " + array[0]);
        editX2(array);
        System.out.println("After  edit array[0]= " + array[0]);
    }

    public static void editX(int x) {
        x++;
    }

    public static void editX2(int[] array) {
        array[0]++;
    }
}
