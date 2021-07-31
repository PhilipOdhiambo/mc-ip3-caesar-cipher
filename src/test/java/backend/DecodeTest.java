package backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    public void decode_encodeLowerCaseWithinAlphabetRange_char() {
        // Encode a lower case letter a with key of 1
        Decode testDecode = new Decode();
        char expectedOutput = 'a';
        Assertions.assertEquals(expectedOutput, testDecode.decode('b', 1));
    }


}