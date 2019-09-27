public class Main {

    public static void main(String[] args) {
        TextPrinter.setupProgram();
        GeneratorComputer.pickNumber();
        GeneratorComputer.pickSymbol();
        Player.numberChooser();
        TextPrinter.printLines();
        Player.symbolPicker();
        TextPrinter.getPlayerSymbol();
        TextPrinter.getComputerSymbol();
        TextPrinter.printLines();
        Player.winOrLooseOrTie();
        TextPrinter.getWinOrLooseOrTie();
        TextPrinter.printLines();
        TextPrinter.playAgain();
        TextPrinter.newGame();

    }

}
