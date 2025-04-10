public class Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("searching for 5 --> " + linearSearch(array, 5));
        System.out.println("searching for 3 --> " + linearSearch(array, 3));
        System.out.println("searching for 10 --> " + linearSearch(array, 10));
    }

    private static boolean linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

}
