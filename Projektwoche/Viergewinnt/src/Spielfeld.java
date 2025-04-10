import java.util.Scanner;

public class Spielfeld {

    Spieler spieler;
    int zeile, spalte;
    int[][] feld;
    Scanner sc = new Scanner(System.in);

    public Spielfeld(int zeile, int spalte) {
        this.zeile = zeile;
        this.spalte = spalte;
        feld = new int[zeile][spalte];
        inint();
    }

    public void inint() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                feld[i][j] = 0;
            }
        }
    }

    public void druckefeld() {
        System.out.println();
        for (int i = 0; i < feld.length; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        System.out.print("  |");
        for (int i = 0; i < feld[0].length; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }

    public boolean setzeStein(Spieler sp, int spalte) {
        if (spalte >= 0 && spalte < feld[0].length) {
            for (int i = feld.length - 1; i >= 0; i--) {
                for (int j = 0; j < feld[i].length; j++) {
                    if (feld[i][spalte] == 0) {
                        feld[i][spalte] = sp.getSpnummer();
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void startgame() {
        int in1, in2;

        System.out.println("Willkommen zu \"Vier gewinn!\" ");
        System.out.println("gib den Namen des ersten Spielers ein : ");
        String name1 = sc.next();
        System.out.println("gib den Namen des zweiten Spielers ein : ");
        String name2 = sc.next();
        Spieler sp1 = new Spieler(name1);
        Spieler sp2 = new Spieler(name2);
        druckefeld();

        do {

            do {
                System.out.println(sp1.getName() + " an der Reihe ");
                System.out.println("Wohin Moechtest du werfen ? ");
                in1 = sc.nextInt();

            } while (!setzeStein(sp1, in1));
            druckefeld();
            if (gewonnen(sp1)) {
                druckefeld();
                return;
            }

            do {
                System.out.println(sp2.getName() + " an der Reihe ");
                System.out.println("Wohin Moechtest du werfen ? ");
                in2 = sc.nextInt();

            } while (!setzeStein(sp2, in2));
            druckefeld();
            if (gewonnen(sp2)) {
                druckefeld();
                return;
            }


        } while (true);


    }

    public boolean gewonnen(Spieler sp) {

        return hori(sp) || verti(sp) || diago(sp);
    }

    public boolean hori(Spieler sp) {
        int half = (feld[0].length / 2) + 1;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < half; j++) {
                if (feld[i][j] == sp.getSpnummer() && feld[i][j + 1] == sp.getSpnummer() && feld[i][j + 2] == sp.getSpnummer() &&
                        feld[i][j + 3] == sp.getSpnummer()) {
                    System.out.println(sp.getName() + " Du hast gewonnen");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verti(Spieler sp) {
        int half = (feld.length / 2) + 1; //4
        for (int i = feld.length - 1; i >= 0; i--) {
            for (int j = 0; j < half; j++) {
                if (feld[i][j] == sp.getSpnummer() && feld[i - 1][j] == sp.getSpnummer() && feld[i - 2][j] == sp.getSpnummer() &&
                        feld[i - 3][j] == sp.getSpnummer()) {
                    System.out.println(sp.getName() + " Du hast gewonnen");
                    return true;
                }
            }
        }

        return false;
    }

    public boolean diago(Spieler sp) {
//        int half = (feld.length / 2) + 1;
//        for (int i = feld.length - 1; i >= 0; i--) {
//            for (int j = 0; j < half; j++) {
//
//                if (feld[i][j] == sp.getSpnummer() || feld[i - 1][j + 1] == sp.getSpnummer() || feld[i - 2][j + 2] == sp.getSpnummer() ||
//                        feld[i - 3][j + 3] == sp.getSpnummer()) {
//                    System.out.println(sp.getName() + " Du hast gewonnen");
//                    return true;
//                }
//            }
//        }
        for (int i = 0; i <= feld.length - 4; i++) {
            for (int j = 0; j <= feld[i].length - 4; j++) {
                if (feld[i][j] == sp.getSpnummer() && feld[i + 1][j + 1] == sp.getSpnummer() &&
                        feld[i + 2][j + 2] == sp.getSpnummer() && feld[i + 3][j + 3] == sp.getSpnummer()) {
                    System.out.println(sp.getName() + " hat gewonnen!");
                    return true;
                }
            }
        }
        return false;
    }
}
