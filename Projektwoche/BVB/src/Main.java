public class Main {
    public static void main(String[] args) {
        Mannschaft mannschaft = new Mannschaft("Ball-Verein Borussia Dortmund 09");
        Menu menu = new Menu(mannschaft);
        menu.showMenu();
    }
}