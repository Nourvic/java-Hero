import java.util.Random;
import java.util.Scanner;

public class Spielfeld {
    private Spieler[] spielers;
    private int maxzahl;
    private int runden;
    private int anzsp;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public Spielfeld() {
        maxzahl = 20;
    }


    public boolean spieleristvalid(Spieler sp) {
        if (!sp.isAusgeschieden()) {
            return true;
        }
        return false;
    }

    public void wurfeln(Spieler sp) {

        int rd1, rd2, rd3;
        int sum = sp.getAugenzahl();

        rd1 = rand.nextInt(6) + 1;
        rd2 = rand.nextInt(6) + 1;
        rd3 = rand.nextInt(6) + 1;
        System.out.println("Gewuerfelt wurden " + rd1 + " und " + rd2 + " und " + rd3);
        sum += rd1 + rd2 + rd3;

        System.out.print("Ihre Augenzahl betraegt :" + sum);
        if (sum > maxzahl) {
            System.out.println("Sie haben leider nicht gewonnen : Ihre Augenzah; (" + sum + ") ist zu hoch");
            sp.setAusgeschieden(true);
        } else if (sum <= maxzahl) {
            sp.setAugenzahl(sum);

            System.out.println("das zu erchnende Maximum ist " + maxzahl);
            System.out.println("Wollen Sie noch einmal wuerfeln ? (J/N)");



        }
        char ch = sc.next().charAt(0);
        if (ch == 'j') {
            wurfeln(sp);
        } else if (ch == 'n') {
            return;
        }


    }

    public void play() {
        System.out.println("Wie Viel Spieler moechten spielen");
        anzsp = sc.nextInt();
        spielers = new Spieler[anzsp];
        for (int i = 0; i < spielers.length; i++) {
            System.out.println("Geben Sie den" + (i + 1) + "en Namen des spielers ein :");
            String namen = sc.next();
            spielers[i] = new Spieler(namen);
        }
        System.out.println("Wie viel Runden moechten Sie maximal spielen");
        runden = sc.nextInt();
        int runnumber = 1;

        do {
            for (int i = 0; i < spielers.length; i++) {
                if (spieleristvalid(spielers[i]) == true) {

                    System.out.println("Runde:" + runnumber + "\n" + spielers[i].getName() + ": \n Ihre augenzahl ist " + spielers[i].getAugenzahl() + "\n" + "Das zu erreichnde Maximum ist : " + maxzahl + "\n");
                    System.out.println("Wollen Sie noch einmal wuerfeln ? (J/N)");
                    char c = sc.next().charAt(0);
                    if (c == 'j') {
                        wurfeln(spielers[i]);
                    }
                    if (c == 'n') {
                        continue;
                    }


                }


            }
            runnumber++;

            for (int i = 0; i < spielers.length; i++) {
                if (spieleristvalid(spielers[i]) == true) {
                    spielers[i].setPunkte();
                }
            }
            runden--;
            maxzahl += 5;

        } while (runden > 0);

        checkwin();
    }

    public void checkwin() {
        int highestPoints = -1;
        for (Spieler sp : spielers) {
            if (sp.getPunkte() > highestPoints) {
                highestPoints = sp.getPunkte();
            }
        }

        System.out.println("Die Gewinner sind:");
        for (Spieler sp : spielers) {
            if (sp.getPunkte() == highestPoints) {
                System.out.println(sp.getName() + " mit " + sp.getPunkte() + " Punkten");
            }
        }
    }


}
