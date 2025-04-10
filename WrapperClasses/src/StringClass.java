public class StringClass {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(n + 1);
        String numberAsString = String.valueOf(n);
        System.out.println(numberAsString + 1); // 421

        String name1 = "nour";
        System.out.println(name1.toUpperCase());
        String name2 = "HANNA";
        System.out.println(name2.toLowerCase());

        int resultOfCompare = name1.compareTo(name2); //0, 1

        if (resultOfCompare == 0) {
            System.out.println(name1 + " is equal to " + name2);
        } else {
            System.out.println(name1 + " is equal to " + name2);
        }

        char[] name1AsArray = name1.toCharArray();
        System.out.println(name1AsArray[0]);
        for (int i = 0; i < name1AsArray.length; i++) {
            System.out.print(name1AsArray[i] + " ");
        }
        System.out.println();

        System.out.println(name2.charAt(0));
        for (int i = 0; i < name2.length(); i++) {
            System.out.print(name2.charAt(i) + " ");
        }
    }
}
