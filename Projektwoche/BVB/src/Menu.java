import java.util.Scanner;

public class Menu {

    private Mannschaft mannschaft;

    public Menu(Mannschaft mannschaft) {
        this.mannschaft = mannschaft;
        addMockDaten();
    }

    private void addMockDaten() {
        Spieler mario = new Spieler("Götze", "Mario", "Mittelfeld", 5, 10);
        Spieler auba = new Spieler("Aubameyang", "Pierre Emerik", "Sturm", 18, 17);
        Trainer thomas = new Trainer("Tuchel", "Thmas");
        thomas.setLieblingsSpieler(auba);
        Arzt markus = new Arzt("Braun", "Markus", "Orthopädie");
        mannschaft.addMitglieder(mario);
        mannschaft.addMitglieder(auba);
        mannschaft.addMitglieder(thomas);
        mannschaft.addMitglieder(markus);
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        char eingabe = ' ';
        do {
            mannschaft.printInfo();
            System.out.println("\n\nWeiter Aktionen:" + "\n\t(A)rzt hinzufügen" + "\n\t(S)pieler hinzufügen" + "\n\t(T)rainer hinzufügen" + "\n\t(B)eenden");
            System.out.print("Ihre Eingabe: ");
            eingabe = scanner.next().charAt(0);
            switch (eingabe) {
                case 'A', 'a':
                    addArzt(scanner);
                    break;
                case 'S', 's':
                    addSpieler(scanner);
                    break;
                case 'T', 't':
                    addTrainer(scanner);
                    break;
                case 'B', 'b':
                    System.out.println("Ciao!");
                    break;
                default:
                    System.out.println("Bitte etwas gültiges eingeben!");
            }

        } while (eingabe != 'B');

    }

    private void addTrainer(Scanner scanner) {
        System.out.println("\tHinzufügen von neuen Trainer...");
        System.out.print("\t\tVorname: ");
        String vorname = scanner.next();
        System.out.print("\t\tNachname: ");
        String nachname = scanner.next();


        if (vorname != null && vorname.length() != 0 && nachname != null && nachname.length() != 0) {
            Trainer trainer = new Trainer(vorname, nachname);
            mannschaft.addMitglieder(trainer);
            if (mannschaft.getAnzahlMitSpieler() > 0) {
                System.out.print("\tHat der " + vorname + " einen lieblings Spieler? J(a), N(ein): ");
                char antwort = scanner.next().charAt(0);
                if (antwort == 'J' || antwort == 'j') {
                    Spieler[] alleSpieler = mannschaft.getAlleSpieler();
                    for (int i = 0; i < alleSpieler.length; i++) {
                        if (alleSpieler[i] != null) {
                            System.out.println("\t\t\t" + alleSpieler[i].getVorname() + " " + alleSpieler[i].getNachname() + " " + alleSpieler[i].getNumber());
                        }
                    }
                    System.out.print("Bitte wählen Sie eine Spielernummer aus der Tabelle: ");
                    int selectedNumber = scanner.nextInt();
                    for (int i = 0; i < alleSpieler.length; i++) {
                        if (alleSpieler[i] != null) {
                            if (selectedNumber == alleSpieler[i].getNumber()) {
                                trainer.setLieblingsSpieler(alleSpieler[i]);
                            } else {
                                System.out.println("nicht valide Spielernummer");
                            }
                        }
                    }
                }
            }
        }

        System.out.println("\tTrainer wurde erfolgreich hinzugefügt!");
    }

    private void addSpieler(Scanner scanner) {
        System.out.println("\tHinzufügen von neuen Spieler...");
        System.out.print("\t\tVorname: ");
        String vorname = scanner.next();
        System.out.print("\t\tNachname: ");
        String nachname = scanner.next();
        System.out.print("\t\tSpielposition: ");
        String spielposition = scanner.next();
        System.out.print("\t\tAnzahl Spieleinsätze: ");
        int spielEinsätze = scanner.nextInt();

        System.out.print("\t\tSpielernummer: ");
        int spielernummer = scanner.nextInt();


        if (vorname != null && vorname.length() != 0 && nachname != null && nachname.length() != 0 && spielposition != null && spielposition.length() != 0) {
            mannschaft.addMitglieder(new Spieler(vorname, nachname, spielposition, spielEinsätze, spielernummer));
        }
        System.out.println("\tSpieler wurde erfolgreich hinzugefügt!");
    }

    private void addArzt(Scanner scanner) {
        System.out.println("\tHinzufügen von neuen Arzt...");
        System.out.print("\t\tVorname: ");
        String vorname = scanner.next();
        System.out.print("\t\tNachname: ");
        String nachname = scanner.next();
        System.out.print("\t\tFachrichtung: ");
        String fachrichtung = scanner.next();

        if (vorname != null && vorname.length() != 0 && nachname != null && nachname.length() != 0 && fachrichtung != null && fachrichtung.length() != 0) {
            mannschaft.addMitglieder(new Arzt(vorname, nachname, fachrichtung));
        }
        System.out.println("\tArzt wurde erfolgreich hinzugefügt!\n");
    }
}