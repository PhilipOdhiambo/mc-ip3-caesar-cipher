package backend;

import java.util.ArrayList;

public class Encode {
    public char encode(char input, int key) {
        // lower case
        if (( input >= 'a' && input <= 'z')){
            int inputIndex = input - 'a';
            int newIndex = (inputIndex + key) % 26;
            return (char) ('a' + newIndex);

            // upper case
        } else if (input >= 'A' && input <= 'Z') {
            int inputIndex = input - 'A';
            int newIndex = (inputIndex + key) % 26;
            return (char) ('A' + newIndex);
        }

        // Character other than alphabet provided
        return input;
    }


}
