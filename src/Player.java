import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    static byte number = 0; //Vi sætter som standard number til 0 så vi kan komme videre i vores kode
    static String symbol;
    static byte result = 3; //Vi sætter som standard result til 3 så koden kan fortsætte hvis en fejl skulle ske
    static int winLooseTie[] = {0, 0, 0};

   //Vores loop som sikre at man vælger et tal mellem 1-3 før man kan fortsætte videre i koden
    public static byte numberChooser() {
        Scanner scanner = new Scanner(System.in);
        while (number == 0 || number < 0 || number > 3) {
            System.out.print("1 = Sten, 2 = Saks, 3 = Papir. Hvad vælger du?: ");
            inputInt("", scanner);
            if (number < 0 || number > 3) {
                System.out.println("Du skal vælge mellem 1, 2 eller 3...");
                System.out.println("******************************");
            }
        }
        return number;
    }

    public static int inputInt(String prompt, Scanner scanner) {
        try{ //Vi prøver at få fat i en Byte værdi
            return number = scanner.nextByte();
        } catch (InputMismatchException e){ //Mislykkeds det sendes brugeren tilbage til starten af metoden
            System.out.println("******************************");
            System.out.println("Du kan ikke skrive et ord her... Stuuupid!");
            System.out.print("Du SKAL skrive et tal mellem 1-3. Prøv igen: ");
            scanner.next();
            return inputInt(prompt, scanner);
        }
    }

    //Vi tager input fra number og giver et "symbol" (Sten, Saks eller Papir) alt efter hvad man indtaster
    public static String symbolPicker() {
        if (number == 1)
            symbol = "Sten";
        else if (number == 2)
            symbol = "Saks";
        else
            symbol = "Papir";
        return symbol;
    }

    //Vores logik til at tjekke hvem der vinder eller om det bliver uafgjort
    public static int winOrLooseOrTie() {
        if (GeneratorComputer.number == 1 && Player.number == 1 ||
                GeneratorComputer.number == 2 && Player.number == 2 ||
                    GeneratorComputer.number == 3 && Player.number == 3) {
            winLooseTie[2] = winLooseTie[2] + 1;
            result = 3; // 3 = Tie
        }

        else if (GeneratorComputer.number == 1 && Player.number == 2 ||
                    GeneratorComputer.number == 2 && Player.number == 3 ||
                        GeneratorComputer.number == 3 && Player.number == 1) {
            winLooseTie[1] = winLooseTie[1] + 1;
            result = 2; //2 = Loose
        }

        else if
            (GeneratorComputer.number == 1 && Player.number == 3 ||
                    GeneratorComputer.number == 2 && Player.number == 1 ||
                        GeneratorComputer.number == 3 && Player.number == 2) {
                winLooseTie[0] = winLooseTie[0] + 1;
                result = 1; // 1 = Win
            }

        else {
            winLooseTie[2] = winLooseTie[2] + 1;
            result = 3;
        }

        return result;
    }

}
