import java.util.Scanner;

public class Tilgung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double darsum;
        double jahreszin;
        double anunirate;

        int jahr;
        double restschuld;
        System.out.println("Darlehnsnumme (Euro) : ");
        darsum = sc.nextDouble();
        System.out.println("Jahreszinsatz in prozent : ");
        jahreszin = sc.nextDouble();
        System.out.println("Annuitaetsrate (Euro pro Jahr) :");
        anunirate = sc.nextDouble();
        restschuld = darsum;
        jahr = 0;

        //teil B
        double jährlicheZinsen = restschuld * (jahreszin / 100);
        if (anunirate <= jährlicheZinsen) {
            System.out.println("Fehler: Das Darlehen ist nicht abzahlbar. Die Annuitätsrate ist zu niedrig.");
            return;
        }

        System.out.println("Jahr\t\tZinsen\t\tTilgung\t\tRestschuld");
        System.out.println("====================================================");
        System.out.println("Jahr\t\t Zinsen\t\t Tilgung\t\t Restschuld");
        System.out.println("====================================================");
        double zinsen;
        double tilgun;
        double sumzins = 0;
        double sumtil = 0;
        double test = darsum / anunirate;


        while (true) {
            while (jahr < test) {


                zinsen = restschuld * (jahreszin / 100);//480
                sumzins += zinsen;
                tilgun = anunirate - zinsen;
                sumtil += tilgun;
                restschuld -= tilgun;
                jahr++;
                System.out.println(jahr + "\t\t\t" + String.format("%.2f", zinsen) + "\t\t\t" + String.format("%.2f", tilgun) + "\t\t\t" + String.format("%.2f", restschuld));

            }
            System.out.println("Schlussrate : " + sumzins);
            System.out.println("Gesamtzahlung : " + (darsum + sumzins));
            System.out.println("Anzahl der Raten " + jahr);
            System.out.println(" noch einmal ? j/n");
            String scx = sc.next();
            if (scx.equals("n")) {
                break;
            }
        }

    }

}