package S_1;

//P_1 Counting duplicate characters: Write a program that counts duplicate characters from a given string

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Given string
        String str = "abscsadkfjasdfjagjagjalgj";
        System.out.println(countDuplicateCharacters(str));

    }

    public static Map<Character, Integer> countDuplicateCharacters(String str) {

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (key, val) -> (val == null) ? 1 : ++val);
        }
        return result;
    }
}
