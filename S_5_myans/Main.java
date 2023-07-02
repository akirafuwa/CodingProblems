package S_5_myans;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Counting vowels and consonants: Write a program that counts the number of vowels and consonants in a given string. Do this for the English language, which has five vowels (a, e, i, o, and u).
//
//Leonard, Anghel. Java Coding Problems: Improve your Java Programming skills by solving real-world coding challenges (p. 10). Packt Publishing. Kindle Edition.
//
//
public class Main {

    public static final Character[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {

        String str = "adfalsdfhjaslfjahdljf";

        System.out.println(countingVowelsAndConsonants(str));
    }

    public static String countingVowelsAndConsonants(String input){

        Set<Character> vowels_Set = new HashSet<Character>(List.of(vowels));
        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for (int i = 0; i < input.length(); i++){
            if (vowels_Set.contains(input.charAt(i))) {
                numberOfVowels += 1;
            }  else {
                numberOfConsonants += 1;
            }
        }

        return "Vowels: " + numberOfVowels + ", Consonants: " + numberOfConsonants;
    }
}
