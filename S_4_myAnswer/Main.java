package S_4_myAnswer;
//Checking whether a string contains only digits: Write a program that checks whether the given string contains only digits.
//
//Leonard, Anghel. Java Coding Problems: Improve your Java Programming skills by solving real-world coding challenges (p. 9). Packt Publishing. Kindle Edition.

public class Main {
    public static void main(String[] args) {

        //String testStr = "1000243";
        String testStr = "1000243";
        //System.out.println(isNumeric(testStr));
        System.out.println(isAllNumeric(testStr));
    }

    public static boolean isAllNumeric(String str){
        if (str == null) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

//    public static boolean isNumeric(Char chr){
//        if(chr == null) {
//            return false;
//        }
//        try {
//            int i = Integer.parseInt(str);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//
//    }
}
