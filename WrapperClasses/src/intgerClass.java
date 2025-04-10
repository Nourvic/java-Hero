public class intgerClass {
    public static void main(String[] args) {
        String number1AsString = "123452";
        String number2AsString = "2";

        int number1AsInteger = Integer.parseInt(number1AsString);
        int number2AsInteger = Integer.parseInt(number2AsString);

        String ergString = number1AsString + number2AsString; // concatenate // cat
        int ergInteger = number1AsInteger + number2AsInteger; // concatenate // cat
        System.out.println("erg as String  = " + ergString); // 123452
        System.out.println("erg as Integer = " + ergInteger); // 12347


        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Integer: " + Integer.MIN_VALUE);
        System.out.println("Min of 10 and 5 is " + Integer.min(10, 5));
        System.out.println("Max of 10 and 5 is " + Integer.max(10, 5));
        System.out.println("Sum of 10 and 5 is " + Integer.sum(10, 5));

    }
}
