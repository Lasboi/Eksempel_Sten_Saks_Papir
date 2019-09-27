public class GeneratorComputer {
    static int number;
    static String symbol;

    public static int pickNumber() {
        number = (int) (Math.random() * 3 + 1);
        return number;
    }

    public static String pickSymbol() {
        if (number == 1)
            symbol = "Sten";
        else if (number == 2)
            symbol = "Saks";
        else
            symbol = "Papir";
        return symbol;
    }
}
