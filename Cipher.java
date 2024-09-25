public class Cipher {
    public static final String ORIGINAL_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final String CIPHER_ALPHABET = "dfxyhrklvwuasgimnojpqetbcz";

    public String encrypt(String inputString) {
        String outputString = "";

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            outputString += replaceChar(currentChar, true);
        }

        return outputString;
    }

    public String decrypt(String inputString) {
        String outputString = "";

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            outputString += replaceChar(currentChar, false);
        }

        return outputString;
    }

    private char replaceChar(char inputChar, boolean isEncrypt) {
        if (Character.isLowerCase(inputChar)) {
            if (isEncrypt) {
                for (int i = 0; i < ORIGINAL_ALPHABET.length(); i++) {
                    if (ORIGINAL_ALPHABET.charAt(i) == inputChar) {
                        return CIPHER_ALPHABET.charAt(i);
                    }
                }
            } else {
                for (int i = 0; i < CIPHER_ALPHABET.length(); i++) {
                    if (CIPHER_ALPHABET.charAt(i) == inputChar) {
                        return ORIGINAL_ALPHABET.charAt(i);
                    }
                }
            }
        }

        return inputChar;
    }
}
