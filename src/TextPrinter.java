public class TextPrinter {

    public static void printLines() {
        System.out.println("******************************");
    }

    public static void setupProgram() {
        System.out.println("Velkommen til Sten, Saks Papir!");
        System.out.println("I dette lille program skal du spille mod Computeren!");
        System.out.println("Start ud med at vælge Sten, Saks eller Papir og håb på det bedste!");
    }

    public static void getPlayerSymbol() {
        System.out.println("Du har valgt: " + Player.symbol);
    }

    public static void getComputerSymbol() {
        System.out.println("Lad os se hvad computeren har valgt: " + GeneratorComputer.symbol);
    }

}
