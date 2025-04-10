public class Mannschaft {

    private Mitglieder[] mitglieder;
    private String name;


    public Mannschaft(String name) {
        this.mitglieder = new Mitglieder[30];
        this.name = name;
    }

    private double berechneJahresgehälter() {
        double summe = 0;
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                summe += mitglieder[i].berechneJahresgehalt();
            }
        }
        return summe;
    }

    // Polymorphy
    public void addMitglieder(Mitglieder m) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = m;
                break;
            }
        }
    }

    public void printInfo() {
        System.out.println("\nMannschaft: " + name + "\n");
        System.out.printf("%-15s%-25s%-25s%-25s%-25s\n", "Type", "Name", "Nummer", "Vorname", "Jahresgehalt", "Spezifische Eigenschaften");
        for (int i = 0; i < 140; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                System.out.printf("%-15s%-25s%-25s%-25.2f%-25s\n", mitglieder[i].type().charAt(0), mitglieder[i].getNachname(), mitglieder[i].getVorname(), mitglieder[i].berechneJahresgehalt(), mitglieder[i].spezifischeEingenschaften());
            }
        }
        System.out.printf("\nSummer der jahresgehälter: %.2f", berechneJahresgehälter());
    }

    public int getAnzahlMitSpieler() {
        int counter = 0;
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null && mitglieder[i].type().equals(("Spieler"))) {
                counter++;
            }
        }
        return counter;
    }

    public Spieler[] getAlleSpieler() {
        Spieler[] spielers = new Spieler[mitglieder.length];
        for (int i = 0, j = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null && mitglieder[i].type().equals(("Spieler"))) {
                spielers[j] = (Spieler) mitglieder[i];
                j++;
            }
        }
        return spielers;
    }
}