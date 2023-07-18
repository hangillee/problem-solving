package kit.math;

import java.util.Arrays;

public class MaxMinNum {
    public static void main(String[] args) {
        MaxMinNumSolution solution = new MaxMinNumSolution();
        System.out.println(solution.solution("-1 -2 -3 -4"));
    }
}

class MaxMinNumSolution {
    public String solution(String s) {
        Integer[] numArr = Arrays.stream(s.split(" "))
                .map(Integer::valueOf).toArray(Integer[]::new);
        Arrays.sort(numArr);
        return numArr[0] + " " + numArr[numArr.length - 1];
    }
}
