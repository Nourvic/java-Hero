public class Main {
    public static void main(String[] args) {

        Smartphone iphone = new Smartphone(1, "123124123", 1024);
        Smartphone galaxy = new Smartphone(2, "128971923", 512);

        iphone.addSMS(1, "Hallo  How are you?");
        iphone.addSMS(2, "I Am fine thanks");

        System.out.println(iphone);
        System.out.println("Anzahl SMSs: " + iphone.getAnzahlSMS());
        System.out.println("Aktuelle Uhrzeit: " + iphone.getUhrzeit().getHour() + ":" + iphone.getUhrzeit().getMinute());
        iphone.ausgebenSMS();

    }
}