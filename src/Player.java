import java.util.Scanner;

public class Player {
    static byte number = 0;
    static String symbol;
    static int result = 3;

    public static byte numberChooser() {
        Scanner scanner = new Scanner(System.in);
        while (number == 0 || number < 0 || number > 3) {
            System.out.print("1 = Sten, 2 = Saks, 3 = Papir. Hvad vælger du?: ");
            number = scanner.nextByte();
            if (number < 0 || number > 3) {
                System.out.println("Du skal vælge mellem 1, 2 eller 3...");
                System.out.println("******************************");
            }
        }
        return number;
    }

    public static String symbolPicker() {
        if (number == 1)
            symbol = "Sten";
        else if (number == 2)
            symbol = "Saks";
        else
            symbol = "Papir";
        return symbol;
    }

    public static int winOrLooseOrTie() {
        if (GeneratorComputer.number == 1 && Player.number == 1 ||
                GeneratorComputer.number == 2 && Player.number == 2 ||
                    GeneratorComputer.number == 3 && Player.number == 3)
                        result = 3; // 3 = Tie

        else if (GeneratorComputer.number == 1 && Player.number == 2 ||
                    GeneratorComputer.number == 2 && Player.number == 3 ||
                        GeneratorComputer.number == 3 && Player.number == 1)
                            result = 2; //2 = Loose

        else if (GeneratorComputer.number == 1 && Player.number == 3 ||
                    GeneratorComputer.number == 2 && Player.number == 1 ||
                        GeneratorComputer.number == 3 && Player.number == 2)
                            result = 1; // 1 = Win

        else
            result = 3;

        return result;
    }

}
