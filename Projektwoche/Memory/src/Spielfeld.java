import java.util.Scanner;
import java.util.Random;

public class Spielfeld {
    Spieler[] spieler;
    char[][] abgedeckt;
    char[][] aufgedeckt;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int zeile;
    int spalte;
    Spieler spieler1;
    Spieler spieler2;

    public Spielfeld(int zeile, int spalte) {
        this.zeile = zeile;
        this.spalte = spalte;
        abgedeckt = new char[zeile][spalte];
        aufgedeckt = new char[zeile][spalte];
        // printfeld(fuelleFeld());
        initfeld();
    }

    public char[][] initfeld() {
        for (int i = 0; i < abgedeckt.length; i++) {
            for (int j = 0; j < abgedeckt[0].length; j++) {
                abgedeckt[i][j] = '-';
                aufgedeckt[i][j] = '-';
            }
        }
        return abgedeckt;
    }

    public char[][] fuelleFeld() {
        int c = 65;
        int b = 97;
        for (int i = 0; i < aufgedeckt.length; i++) {
            for (int j = 0; j < aufgedeckt[0].length; j++) {
                if (i <= 1) {
                    aufgedeckt[i][j] = (char) c++;
                } else if (i > 1) {
                    aufgedeckt[i][j] = (char) b++;
                }
            }
        }
        return aufgedeckt;
    }

    public void printfeld(char[][] feld) {
        for (int i = 0; i < feld[0].length; i++) {
            System.out.print("\t" + i);
        }

        System.out.println();
        for (int i = 0; i < feld.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < feld[0].length; j++) {
                System.out.print(feld[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public void startgame(Spieler sp) {
        Spieler currentspieler = sp;
        printfeld(abgedeckt);
        printfeld(aufgedeckt);
        int z1, s1, z2, s2;
        char c, d;
        System.out.println("Zeile 1:");
        z1 = sc.nextInt();
        System.out.println("Spalte 1:");
        s1 = sc.nextInt();
        c = aufgedeckt[z1][s1];
        System.out.println("An dieser Stelle befindet sich ein " + c);
        System.out.println("Zeile 2:");
        z2 = sc.nextInt();
        System.out.println("Spalte 2:");
        s2 = sc.nextInt();
        d = aufgedeckt[z2][s2];
        System.out.println("An dieser Stelle befindet sich ein " + d);
        if (c >= 'a' && c <= 'l') {// Abfrage a >>>>l
            c -= 32;
        } else if (d >= 'a' && d <= 'l') {
            d -= 32;
        }
        if (c == d) {
            sp.setPunkte(1);
            abgedeckt[z1][s1] = aufgedeckt[z1][s1];
            abgedeckt[z2][s2] = aufgedeckt[z2][s2];
            startgame(currentspieler);
        }


    }

    public void game() {
        fuelleFeld();
        swapbetweenLetters();
        String name1;
        String name2;
        System.out.println("Geben Sie den Namen von Spieler 1 ein : ");
        name1 = sc.nextLine();
        spieler1 = new Spieler(name1);
        System.out.println("Geben Sie den Namen von Spieler 2 ein : ");
        name2 = sc.nextLine();
        spieler2 = new Spieler(name2);
        Spieler currentSpieler = spieler1;

        do {
            System.out.println(currentSpieler.getName() + " ist an der Reihe");
            startgame(currentSpieler);

            currentSpieler = currentSpieler == spieler1 ? spieler2 : spieler1;
            if (checkwin()) {
                System.out.println("Das Spiel ist zu Ende!");
                System.out.println(spieler1.getName() + " hat " + spieler1.getPunkte() + " Punkte.");
                System.out.println(spieler2.getName() + " hat " + spieler2.getPunkte() + " Punkte.");

                if (spieler1.getPunkte() > spieler2.getPunkte()) {
                    System.out.println(spieler1.getName() + " hat gewonnen!");
                    return;
                } else if (spieler1.getPunkte() < spieler2.getPunkte()) {
                    System.out.println(spieler2.getName() + " hat gewonnen!");
                    return;
                } else {
                    System.out.println("Es ist ein Unentschieden!");

                }
                System.exit(0);
            }
        } while (true);
        //spieler1.getPunkte()+spieler2.getPunkte()<12

    }

    public void swapbetweenLetters() {
        for (int i = 0; i < abgedeckt.length; i++) {
            for (int j = 0; j < abgedeckt[0].length; j++) {
                int rd1 = rand.nextInt(zeile);
                int rd2 = rand.nextInt(spalte);
                //   tauschen(i, j, rd1, rd2);
                char temp = aufgedeckt[i][j];
                aufgedeckt[i][j] = aufgedeckt[rd1][rd2];
                aufgedeckt[rd1][rd2] = temp;
            }
        }
    }

    public void tauschen(int i, int j, int rd1, int rd2) {
        char tausch = aufgedeckt[i][j];
        aufgedeckt[i][j] = aufgedeckt[rd1][rd2];
        aufgedeckt[rd1][rd2] = tausch;
    }


    private boolean checkwin() {
        for (int i = 0; i < abgedeckt.length; i++) {
            for (int j = 0; j < abgedeckt[0].length; j++) {
                if (abgedeckt[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }


    public void endgame() {
        System.out.println("Das Spiel ist zu Ende!");
        System.out.println(spieler1.getName() + " hat " + spieler1.getPunkte() + " Punkte.");
        System.out.println(spieler2.getName() + " hat " + spieler2.getPunkte() + " Punkte.");

        if (spieler1.getPunkte() > spieler2.getPunkte()) {
            System.out.println(spieler1.getName() + " hat gewonnen!");
            return;
        } else if (spieler1.getPunkte() < spieler2.getPunkte()) {
            System.out.println(spieler2.getName() + " hat gewonnen!");
            return;
        } else {
            System.out.println("Es ist ein Unentschieden!");

        }
        System.exit(0);
    }

}
