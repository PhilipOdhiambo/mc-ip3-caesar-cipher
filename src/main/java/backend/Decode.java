package backend;

public class Decode {
    public char decode(char valueToDecode, int decodeKey) {
        int output = (int) valueToDecode - decodeKey;
        return (char) output;
    }
}
