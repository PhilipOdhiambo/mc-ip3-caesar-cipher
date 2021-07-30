package backend;

import java.util.ArrayList;

public class Encode {
    public ArrayList<Object> encode(char input, int key) {
        ArrayList<Object> testResults = new ArrayList<Object>();

        char coded = (char) (key + input);

        testResults.add(coded);
        return testResults;
    }
}
