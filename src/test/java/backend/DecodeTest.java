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

    @Test
    void decode_decodeUpperCaseLetterWithinRange_char() {
        Decode testDecode = new Decode();
        char expectedOutput = 'A';
        Assertions.assertEquals(expectedOutput,testDecode.decode('B', 1));
    }

    @Test
    void decode_translateNonAlphabetAsIs_char() {
        Decode testDecode = new Decode();
        char expectedOutput = '1';
        Assertions.assertEquals(expectedOutput, testDecode.decode('1', 1));
    }
}