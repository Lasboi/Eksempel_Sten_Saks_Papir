import java.util.Scanner;

public class Player {
    static byte number;

    public static byte numberChooser() {
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextByte();
        return number;
    }

}
