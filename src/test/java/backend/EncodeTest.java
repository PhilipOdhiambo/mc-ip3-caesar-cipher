package backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {
    @Test
    public void encode_lowerCase_char() {
        // Encode a lower case letter a with key of 1
        Encode testEncode = new Encode();
        char expectedOutput = 'b';
        Assertions.assertEquals(expectedOutput, testEncode.encode('a', 1));
    }

    @Test
    void encode_upperCaseAWithKey1_char() {
        // Encode uppercase letter 'A' with key of 1;
        Encode testEncode = new Encode();
        char expectedOutput = 'B';
        Assertions.assertEquals(expectedOutput,testEncode.encode('A',1));
    }
}