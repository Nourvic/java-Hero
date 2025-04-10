public abstract class Mitglieder {
    private String nachname, vorname;

    public Mitglieder(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public abstract double berechneJahresgehalt();

    public abstract String spezifischeEingenschaften();

    public abstract String type();


    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
}
