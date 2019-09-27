public class Main {

    public static void main(String[] args) {
        //Vi kalder vores metoder
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
        Player.addScore();
        TextPrinter.printLines();
        TextPrinter.printScore();
        TextPrinter.printLines();
        TextPrinter.playAgain();
        TextPrinter.newGame();
    }

}
