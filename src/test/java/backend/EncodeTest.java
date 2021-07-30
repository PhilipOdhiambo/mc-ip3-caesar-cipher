package backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {
    @Test
    public void encode_lowerCase_char() {
        // Encode a lower case letter
        Encode testEncode = new Encode();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add('b');
        Assertions.assertEquals(expectedOutput, testEncode.encode('a', 1));
    }

}