public class Typkonvertierung {
    public static void main(String[] args) {

        byte x = 10;
        int y = x; // implizite Konvertierung (Wertebereich von byte ist kleiner als der von int)

        int x2 = 10;
        byte y2 = (byte) x2; // explizite Konvertierung (Wertebereich von int ist größer als der von byte)

   //     System.out.println(x2);
        System.out.println(y2);
    }
}
