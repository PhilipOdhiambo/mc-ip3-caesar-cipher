
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

        /* ---------------- Receive and validate key  ------------------- */
        System.out.println("Enter key (1-25):");
        System.out.print(">> ");
        scanner = new Scanner(System.in);
        inputString = scanner.next();

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


        /* Enter input String */

        System.out.println("");
        System.out.print("Input String: ");
        scanner = new Scanner(System.in);
        inputString = scanner.nextLine();



        /* Output Encoded string */

        StringBuilder encodedString = new StringBuilder("");
        for (int i = 0; i < inputString.length(); i ++) {
            encodedString.append(encoder.encode(inputString.charAt(i), key));
        }
        System.out.println("Encrypted string: " + encodedString);


        /* Output Decoded string */

        StringBuilder decodedString = new StringBuilder("");
        for (int i = 0; i < encodedString.length(); i ++) {
            decodedString.append(decoder.decode(encodedString.charAt(i), key));
        }
        System.out.println("Decrypted string: " + decodedString);

    }
}
