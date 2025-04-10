public class Main {
    static int x = 10; // global variable

    public static void main(String[] args) {
        int y = 20; // local variable
        System.out.println(x);
        // System.out.println(z); // error
    }

    public static void tuWas() {
        int z = 30; // local variable
        System.out.println(x);
        // System.out.println(y); // error
    }
}