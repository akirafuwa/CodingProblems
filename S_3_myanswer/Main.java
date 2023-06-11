package S_3_myanswer;

//Reversing letters and words: Write a program that reverses the letters of each word and a program that reverses the letters of each word and the words themselves.
//
//        Leonard, Anghel. Java Coding Problems: Improve your Java Programming skills by solving real-world coding challenges (p. 9). Packt Publishing. Kindle Edition.

public class Main {
    public static void main(String[] args) {
        // Given String
        String str = "This is a pen.";
        System.out.print(reversingLettersAndWords(str));
    }

    public static String reversingLettersAndWords(String str){
        StringBuffer sb = new StringBuffer();

        String[] strArray = str.split(" ");
        for (int i = strArray.length - 1; i >= 0; i--){
            StringBuffer word = new StringBuffer();
            for (int j = strArray[i].length() - 1; j >= 0; j--){
                word.append(strArray[i].charAt(j));
            }
            sb.append(word + " ");
        }
        return sb.toString();
    }
}
