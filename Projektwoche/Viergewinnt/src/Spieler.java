public class Spieler {
    private String name;
    private int spnummer;
    private static int idn = 1;

    public Spieler(String name) {
        this.name = name;
        spnummer = idn++;
    }

    public String getName() {
        return name;
    }

    public int getSpnummer() {
        return spnummer;
    }

}
