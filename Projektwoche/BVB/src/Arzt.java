public class Arzt extends Mitglieder {

    private String fachrichtung;

    public Arzt(String vorname, String nachname, String fachrichtung) {
        super(vorname, nachname);
        this.fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    @Override
    public double berechneJahresgehalt() {
        return 10000 * 12;
    }

    @Override
    public String spezifischeEingenschaften() {
        return "Fachrichtung: " + fachrichtung;
    }

    @Override
    public String type() {
        return "Arzt";
    }

    @Override
    public String toString() {
        return super.toString() + " " + fachrichtung;
    }
}
