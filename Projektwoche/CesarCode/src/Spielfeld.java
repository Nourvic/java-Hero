import java.util.Scanner;

public class Spielfeld {

    Scanner sc = new Scanner(System.in);

    public Spielfeld(){
        startGame();
    }
    public String verschluesseln(int n, String s) {
        String text = ""; // Verwendung eines einfachen Strings
        n %= 26; // Um sicherzustellen, dass n im Bereich des Alphabets bleibt

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // Großbuchstaben behandeln
                c = (char) ('A' + (c - 'A' + n) % 26);
            } else if (c >= 'a' && c <= 'z') {
                // Kleinbuchstaben behandeln
                c = (char) ('a' + (c - 'a' + n) % 26);
            }
            text += c; // Zeichen hinzufügen
        }

        System.out.println(text);
        return text;
    }


    public String entschluesseln(int n, String s) {
        return verschluesseln(26 - n, s);
    }

    public void startGame() {
        String klartext = "";
        String geheimtext = "";
        int ver = 0;
        do {
            System.out.print("(1) Eingabe Klartext\n" +
                    "(2) Eingabe Geheimtext\n" +
                    "(3) verschiebung\n" +
                    "(4) Verschluesseln\n" +
                    "(5) Enttschluesseln\n" +
                    "(6) Ende\n");

            switch (sc.nextInt()) {
                case 1:
                    klartext = sc.next();
                    break;
                case 2:
                    geheimtext = sc.next();
                    break;
                case 3:
                    ver = sc.nextInt();
                    break;
                case 4:
                    verschluesseln(ver, klartext);
                    break;
                case 5:
                    entschluesseln(ver, geheimtext);
                    break;
                    case 6:
                        System.exit(0);
                default:
                    System.out.println("bitte geben Sie eine Zahl von 1-6 ein.");
            }
        } while (true);
    }


}
