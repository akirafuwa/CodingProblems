package S_2_myanswer;

//Finding the first non-repeated character: Write a program that returns the first non-repeated character from a given string.
//
//Leonard, Anghel. Java Coding Problems: Improve your Java Programming skills by solving real-world coding challenges (p. 9). Packt Publishing. Kindle Edition.

public class Main {
    public static void main(String[] args) {
        //My answer
        String str = "aaaaaaaaaabcccccc";
        Character result = null;

        for (int i = 0; i < str.length() ; i++) {
            Character currentChar = str.charAt(i);
            Character nextChar = str.charAt(i + 1);

            if (currentChar.equals(nextChar)) {
                continue;
            } else {
                result = nextChar;
                break;
            }
        }

        System.out.println("Result: " + result);
    }
}
