package backend;

import java.util.ArrayList;

public class Encode {
    public char encode(char input, int key) {
        // Upper case letter provided
        if (( input >= 'A' && input <= 'Z')){
            return (char) (key + input);

            // Lower case letter provided
        } else if (input >= 'a' && input <= 'z') {
            return (char) (key + input);
        }

        // Character other than alphabet provided
        return input;
    }

    public char encodeOverflow(char input, int key) {

        return input;
    }
}
