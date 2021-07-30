package backend;

import java.util.ArrayList;

public class Encode {
    public char encode(char input, int key) {
        //
        char coded = (char) (key + input);
        return coded;
    }
}
