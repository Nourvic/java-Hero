public class Spieler {

    private String name;
    private int punkte;
    private int augenzahl;
    private boolean ausgeschieden;


    public Spieler(String name) {
        this.name = name;
        this.punkte = 0;
        this.augenzahl = 0;
        this.ausgeschieden = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPunkte() {
        this.punkte += 1;
    }

    public int getPunkte() {
        return punkte;
    }

    public int getAugenzahl() {
        return augenzahl;
    }

    public void setAugenzahl(int augenzahl) {
        this.augenzahl += augenzahl;
    }

    public boolean isAusgeschieden() {
        return ausgeschieden;
    }

    public void setAusgeschieden(boolean ausgeschieden) {
        this.ausgeschieden = ausgeschieden;
    }


}
