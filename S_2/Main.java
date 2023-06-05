package S_2;

//Finding the first non-repeated character: Write a program that returns the first non-repeated character from a given string.

public class Main {
    private static final int EXTENDED_ASCII_CODES = 256;

    public static void main(String[] args) {

        String sample = "aaaaav";
        char ch = Main.firstNonRepeatedCharacter(sample);
        System.out.println(ch);
    }

    public static char firstNonRepeatedCharacter(String str){
        //Why is it 256??
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ?
                Character.MIN_VALUE : str.charAt(position);
    }
}
