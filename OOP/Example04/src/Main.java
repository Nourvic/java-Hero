public class Main {
    public static void main(String[] args) {

        Bruch bruch = new Bruch(2, 5);
        int n = 10, m = 20;
        int[] a = bruch.getTeiler(n);
        int[] b = bruch.getTeiler(m);

        printArray(a);
        printArray(b);

        int[] gemeinsams = bruch.getGemeinsams(a, b);
        printArray(gemeinsams);

        int ggt = gemeinsams[gemeinsams.length - 1];

        System.out.println("GGT von " + n + " und " + m + " : " + ggt);

        System.out.println("GGT von " + n + " und " + m + " : " + bruch.findeGGT(n, m));

        System.out.println("\nBRUCH TEST: ");
        System.out.println(bruch); // 2/5

        bruch.multi(5);
        System.out.println(bruch); // 10/5
        bruch.multi(new Bruch(2, 4));
        System.out.println(bruch); // 20/20;
        bruch.div(new Bruch(1, 3));
        System.out.println(bruch); // 60/20

        bruch.kürze();
        System.out.println(bruch);


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}