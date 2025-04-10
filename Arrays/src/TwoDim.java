public class TwoDim {
    public static void main(String[] args) {
        // bekannte daten
        int[][] array = {
                {10, 20, 30},
                {40, 50},
                {70, 80, 90},
                {70},
                {70, 80, 90, 10, 20},
        };

        System.out.println(array.length); // 5
        System.out.println(array[0].length); // 3
        System.out.println(array[3].length); // 1
        System.out.println(array[array.length - 1].length); // 5

        print2dArray(array);
        System.out.println();

        // get
        System.out.print(array[0][0] + " ");
        System.out.print(array[1][1] + " ");
        System.out.print(array[2][1] + " ");
        System.out.println();
        // set
        array[1][0] = 400;
        array[1][1] = 500;

        System.out.print(array[1][0] + " ");
        System.out.print(array[1][1] + " ");

        System.out.println();

        int[][] array2 = new int[3][3];
        fillArrayWithOne(array2);
        print2dArray(array2);

    }

    public static void fillArrayWithOne(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1;
            }
        }
    }

    public static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

