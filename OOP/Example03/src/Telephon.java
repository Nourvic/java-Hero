public class Telephon {

    private int id;
    private String rufnummer;

    public Telephon(int id, String rufnummer) {
        this.id = id;
        this.rufnummer = rufnummer;
    }

    public int getId() {
        return id;
    }

    public String getRufnummer() {
        return rufnummer;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Rufnummer: " + rufnummer;
    }

}
