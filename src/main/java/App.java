
import backend.Decode;
import backend.Encode;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner;
        Encode encoder = new Encode();
        Decode decoder = new Decode();
        String inputString;
        StringBuilder outputString = new StringBuilder("");
        int key;


        System.out.println("=============== Caesar-Cipher ================");
        System.out.println("Choose an option:");
        System.out.println("1. Encrypt Message");
        System.out.println("2. Decrypt Message");
        System.out.println("");
        System.out.print(">> ");

        scanner = new Scanner(System.in);
        inputString = scanner.next();

        /* ------------- Receive and validate user option ----------------- */

        int option;

        try {
            option = Integer.parseInt(inputString);
            if (option < 1 || option > 2) {
                System.out.println("Invalid option!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid option!");
            return;
        }
        //scanner.close();

        /* ---------------- Receive and validate key  ------------------- */

        // Ask for key

        System.out.println("Enter key (1-25):");
        System.out.print(">> ");
        inputString = scanner.next();

        // validate key

        try {

            if (inputString.length() > 2) {
                System.out.println("Key too long!");
                return;
            }
            key = Integer.parseInt(inputString);
            if (key < 0 || key > 25) {
                System.out.println("Invalid key!");
                return;
            }
        } catch (NumberFormatException f) {
            System.out.println("Invalid key");
            return;
        }

        /* ------------- Branching based on user option ------ */

        // Option 1 Encrypt

        if (option == 1) {
            Encode encode = new Encode();
            scanner = new Scanner(System.in);
            System.out.println("Enter message to encode:");
            System.out.print(":: ");
            inputString = scanner.nextLine();

            for (int i = 0; i < inputString.length(); i ++) {
                outputString.append(encoder.encode(inputString.charAt(i), 1));
            }

            System.out.println("Output string:");
            System.out.println(outputString);

        }







    }
}
