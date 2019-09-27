public class GeneratorComputer {
    static byte number;
    static String symbol;


    //Vi generere et tal mellem 1-3
    public static byte pickNumber() {
        number = (byte) (Math.random() * 3 + 1);
        return number;
    }

    //Vi benytter vores tal som blev generet i pickNumber() til at vælge Sten, Saks eller Papir for Computeren
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
