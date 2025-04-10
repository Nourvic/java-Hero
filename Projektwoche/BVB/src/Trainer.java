public class Trainer extends Mitglieder {

    private Spieler lieblingsSpieler;

    public Trainer(String vorname, String nachname) {
        super(vorname, nachname);
    }

    @Override
    public double berechneJahresgehalt() {
        return 165000 * 12;
    }

    @Override
    public String spezifischeEingenschaften() {
        String erg = "LieblingsSpieler: ";
        if (this.lieblingsSpieler != null) {
            return erg + this.lieblingsSpieler.getVorname() + " " + this.lieblingsSpieler.getNachname();
        }
        return erg + "-";
    }

    @Override
    public String type() {
        return "Trainer";
    }


    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    public Spieler getLieblingsSpieler() {
        return lieblingsSpieler;
    }

    @Override
    public String toString() {
        return super.toString() + lieblingsSpieler;
    }

}