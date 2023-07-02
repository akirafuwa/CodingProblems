package S_5_myanswer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int  decimalNum = 9;

    //バーコード１ブロックの行数
    public static final int numberOfCharsPerLine = 3;

    public static final int numberOfBlocksPerLine = 3;

    public static final String sharp = "#";
    public static final String dot = ".";

    public static void main(String[] args) {
        String line = "314159265";

        List<List<String>> decoded = new ArrayList<>();
        for (int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            decoded.add(convertNumToStringList(Character.toString(ch)));
        }

        int loopCount = line.length() / 3;
        int currentCount = 0;
        int firstIndex = 0;

        //読み出す回数
        while (currentCount < loopCount){
            List<String> firstList = decoded.get(firstIndex);
            List<String> secondList = decoded.get(firstIndex + 1);
            List<String> thirdList = decoded.get(firstIndex + 2);

            for (int i = 0; i < 3; i++){
                System.out.println(firstList.get(i) + secondList.get(i) + thirdList.get(i));
            }

            firstIndex = firstIndex + numberOfBlocksPerLine;
            currentCount++;
        }
    }

    public static List<String> convertNumToStringList(String str) {
        StringBuilder sb = new StringBuilder();
        int inputNum = Integer.parseInt(str);
        int count = decimalNum;
        List<String> result = new ArrayList<>();

        for (int i = inputNum; count > 0; count--) {
            if (i > 0){
                sb.append(sharp);
            } else {
                sb.append(dot);
            }
            i--;
        }
        return convertStringToList(sb.toString());
    }

    public static List<String> convertStringToList(String input){
        List<String> result = new ArrayList<String>();

        int numberOfLines = decimalNum / numberOfCharsPerLine;
        int inputNum = decimalNum;
        int index = 0;

        for (int i = 0; i < numberOfLines; i++) {

            StringBuilder element = new StringBuilder();

            for (int j = 0; j < numberOfCharsPerLine; j++) {
                element.append(input.charAt(index));
                index++;
            }

            result.add(element.toString());

        }

        return result;

    }
}


