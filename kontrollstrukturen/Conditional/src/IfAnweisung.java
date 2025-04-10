public class IfAnweisung {
    public static void main(String[] args) {
        int x = 10;
        if (x > 2) {
            System.out.println("Ja");
        }
        System.out.println(".................");

        int y = 10;
        if (y > 20) {
            System.out.println("Ja");
        } else {
            System.out.println("Nein");
        }
        System.out.println(".................");

        int z = -100;
        if (z > 0) {
            System.out.println("Positive");
        } else if (z == 0) {
            System.out.println(" = 0 ");
        } else {
            System.out.println("Negative");
        }
        System.out.println(".................");

        float gesamteBachelorNote = 1.0f;

        if(gesamteBachelorNote <= 1.3){
            System.out.println("sehr gut");
        }
        else if(gesamteBachelorNote <= 2.5){
            System.out.println("gut");
        }
        else if(gesamteBachelorNote <= 3.5){
            System.out.println("befriedigend");
        }
        else if(gesamteBachelorNote <= 4.0){
            System.out.println("ausreichend");
        }
        else{
            System.out.println("nicht bestanden");
        }
    }
}
