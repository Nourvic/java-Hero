public class Swap {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int temp = x;
        x = y; // x = 20
        y = temp; // y = 10

        System.out.println(x); // 20
        System.out.println(y); // 10
    }

    public static void swap(int[] feld, int a, int b) {
        int temp = feld[a];
        feld[a] = feld[b];
        feld[b] = temp;
    }
}
