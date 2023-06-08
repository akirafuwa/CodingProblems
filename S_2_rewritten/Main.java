package S_2_rewritten;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String sample = "aaadd2d";
        System.out.println(countDuplicateCharacters(sample));
        System.out.println(firstNonRepeatedCharacter(sample));
    }

    public static char firstNonRepeatedCharacter(String str){

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

    public static Map<String, Integer> countDuplicateCharacters(String str) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            //サロゲートペアで32bitが帰ってくる
            int cp = str.codePointAt(i);
            //32bitをchar型の配列に変えて、Stringに変換する
            String ch = String.valueOf(Character.toChars(cp));
            if (Character.charCount(cp) == 2) {
                //2 はサロゲートペアを表す
                i++;
            }
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }
}
