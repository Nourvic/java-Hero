public class Switch {

    public static void main(String[] args) {

        String student = "Yasmin";

        switch (student) {
            case "Ahmad":
                System.out.println("He is good in java");
                break;
            case "Ramy":
                System.out.println("he is not so good in java");
                break;
            case "Ali":
                System.out.println("he is bad in java");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
