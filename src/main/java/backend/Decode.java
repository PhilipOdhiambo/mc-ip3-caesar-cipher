package backend;

public class Decode {
    public char decode(char valueToDecode, int decodeKey) {

        if (valueToDecode > 'A' && valueToDecode < 'Z') {
            // Decode capital letter
            return (char) ((int) valueToDecode - decodeKey);

        } else if (valueToDecode > 'a' && valueToDecode < 'z') {
            // Decode lower case letter
            return (char) ((int) valueToDecode - decodeKey);
        }

        return (char) valueToDecode;
    }
}
