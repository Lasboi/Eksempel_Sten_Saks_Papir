import java.util.Scanner;

public class Player {
    static byte number = 0;
    static String symbol;

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

        return symbol;
    }

}
