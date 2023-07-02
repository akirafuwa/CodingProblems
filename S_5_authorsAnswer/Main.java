package S_5_authorsAnswer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(countVowelsAndConsonants(str));

    }
    public static String countVowelsAndConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        return "Vowels: " + vowels + ", Consonants: " + consonants;
    }
}
