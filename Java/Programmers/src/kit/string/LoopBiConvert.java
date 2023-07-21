package kit.string;

import java.util.Arrays;

public class LoopBiConvert {
    public static void main(String[] args) {
        LoopBiConvertSolution solution = new LoopBiConvertSolution();
        System.out.println(Arrays.toString(solution.solution("110010101001")));
    }
}

class LoopBiConvertSolution {
    public int[] solution(String s) {
        String temp = "";
        int zeroCount = 0;
        int convertCount = 0;
        while(!s.equals("1")) {
            convertCount++;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    temp += s.charAt(i);
                }
            }
            s = Integer.toBinaryString(temp.length());
            temp = "";
        }
        return new int[]{ convertCount, zeroCount };
    }
}
