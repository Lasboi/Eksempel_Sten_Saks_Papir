import java.util.Scanner;

public class TextPrinter {
    static String answer;

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

    public static void getWinOrLooseOrTie() {
        if (Player.result == 1) {
            System.out.println(Player.symbol + " slår " + GeneratorComputer.symbol);
            System.out.println("Du har vundet Juhuuuuu!");
        }
        else if (Player.result == 2) {
            System.out.println(GeneratorComputer.symbol + " slår " + Player.symbol);
            System.out.println("Du har tabt... Get better next time looser!");
        }
        else if (Player.result == 3)
            System.out.println("Det blev uafgjort... BORING!");
        else
            System.out.println("Det blev uafgjort... BORING!");
    }

    public static void playAgain() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vil du spille igen? Ja eller Nej: ");
        answer = scanner.next();
        answer.toLowerCase();

    }

    public static void newGame() {
        if (answer.equals("ja")) {
            for (int i = 0; i < 20; ++i) System.out.println();
            Player.number = 0;
            String[] arguments = new String[] {"123"};
            Main.main(arguments);
        }
        else {
            System.out.println("Så skal du da være fri!");
            madeBy();
        }
    }

    static void madeBy() {
        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");
    }

}
