public class Spieler extends Mitglieder{
    private String spielPosition;
    private int spielEinsätze;

    private int number;

    public Spieler(String vorname, String nachname, String spielPosition, int spielEinsätze , int number) {
        super(vorname, nachname);
        this.spielPosition = spielPosition;
        this.spielEinsätze = spielEinsätze;
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSpielPosition() {
        return spielPosition;
    }

    public void setSpielPosition(String spielPosition) {
        this.spielPosition = spielPosition;
    }

    public int getSpielEinsätze() {
        return spielEinsätze;
    }

    public void setSpielEinsätze(int spielEinsätze) {
        this.spielEinsätze = spielEinsätze;
    }

    @Override
    public double berechneJahresgehalt() {
        return 180000 * 12 + (spielEinsätze * 5000);
    }

    @Override
    public String spezifischeEingenschaften() {
        return "Position: " + spielPosition + " / Spieleinsätze: " + +spielEinsätze;
    }

    @Override
    public String type() {
        return "Spieler";
    }

    @Override
    public String toString() {
        return super.toString() + " " + spielPosition + " " + spielEinsätze;
    }
}
