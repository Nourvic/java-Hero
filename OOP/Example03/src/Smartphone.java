import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Smartphone extends Telephon {

    private double displaygröße;
    private SMS[] messages = new SMS[1000];

    public Smartphone(int id, String rufnummer, double displaygröße) {
        super(id, rufnummer);
        this.displaygröße = displaygröße;
    }

    public double getDisplaygröße() {
        return displaygröße;
    }

    public int getAnzahlSMS() {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public int addSMS(int empfängerID, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                SMS sms = new SMS(empfängerID, text);
                messages[i] = sms;
                return i;
            }
        }
        return -1;
    }

    public void ausgebenSMS() {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                System.out.println("EmpfängerID: " + messages[i].getEmpfängerID() + ", Text: " + messages[i].getText());
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Displaygröße: " + displaygröße;
    }

    public LocalTime getUhrzeit() {
        return LocalTime.now();
    }

}