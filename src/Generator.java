public class Generator {
    static int number = 2;
    static String symbol;

    public static int stenSaksPapirNumber() {
        return number;
    }

    public static String stenSaksPapirString() {
        if (number == 1)
            symbol = "Sten";
        else if (number == 2)
            symbol = "Saks";
        else
            symbol = "Papir";
        return symbol;
    }
}
