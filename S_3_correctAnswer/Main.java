package S_3_correctAnswer;

public class Main {
    public static void main(String[] args) {
        String str = "This is a pen.";
        System.out.println(reverseWords(str));
    }

    private static final String WHITESPACE = " ";

    public static String reverseWords(String str){
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word: words){
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--){
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }
 }
