package backend;

public class Decode {
    public char decode(char valueToDecode, int decodeKey) {

        if (valueToDecode >= 'A' && valueToDecode <= 'Z') {

            // Decode capital letter
            int valueIndex = valueToDecode - 'A';
            int newValueIndex = (valueIndex - decodeKey) % 26;

            if (newValueIndex < 0) {
                // Subtraction overlap boundary
                int rectifiedIndex = 26 - Math.abs(newValueIndex);
                return (char) ('A' + rectifiedIndex);
            } else {
                return (char) ('A' + newValueIndex);
            }

        } else if (valueToDecode >= 'a' && valueToDecode <= 'z') {

            // Decode lower case letter
            int valueIndex = valueToDecode - 'a';
            int newValueIndex = (valueIndex - decodeKey) % 26;

            if (newValueIndex < 0) {
                // Subtraction overlaps boundary
                int rectifiedIndex = 26 - Math.abs(newValueIndex);
                return (char) ('a' + rectifiedIndex);
            } else {
                return (char) ('a' + newValueIndex);
            }
        }
        // Return unmodified characters;
        return (char) valueToDecode;
    }
}
