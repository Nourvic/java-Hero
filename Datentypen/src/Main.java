public class Main {
    public static void main(String[] args) {

        System.out.println("+------------+--------+----------------------+------------------------+---------------+");
        System.out.println("| Data Type  | Size   | Minimum Value        | Maximum Value          | Default Value |");
        System.out.println("+------------+--------+----------------------+------------------------+---------------+");
        System.out.printf("| %-10s | %-6d | %-20d | %-22d | %-13d |%n", "byte", Byte.SIZE / 8, Byte.MIN_VALUE, Byte.MAX_VALUE, (int) 0);
        System.out.printf("| %-10s | %-6d | %-20d | %-22d | %-13d |%n", "short", Short.SIZE / 8, Short.MIN_VALUE, Short.MAX_VALUE, (int) 0);
        System.out.printf("| %-10s | %-6d | %-20d | %-22d | %-13d |%n", "int", Integer.SIZE / 8, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        System.out.printf("| %-10s | %-6d | %-20d | %-22d | %-13d |%n", "long", Long.SIZE / 8, Long.MIN_VALUE, Long.MAX_VALUE, 0L);
        System.out.printf("| %-10s | %-6d | %-20.7e | %-22.7e | %-13f |%n", "float", Float.SIZE / 8, Float.MIN_VALUE, Float.MAX_VALUE, 0.0f);
        System.out.printf("| %-10s | %-6d | %-20.7e | %-22.7e | %-13f |%n", "double", Double.SIZE / 8, Double.MIN_VALUE, Double.MAX_VALUE, 0.0);
        System.out.printf("| %-10s | %-6d | %-20d | %-22d | %-13c |%n", "char", Character.SIZE / 8, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE, '\u0000');
        System.out.printf("| %-10s | %-6d | %-20s | %-22s | %-13s |%n", "boolean", 1, "false", "true", false);
        System.out.println("+------------+--------+----------------------+------------------------+---------------+");
    }
}
