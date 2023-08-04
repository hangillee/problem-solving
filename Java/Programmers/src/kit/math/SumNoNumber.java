package kit.math;

import java.util.Arrays;

public class SumNoNumber {
    public static void main(String[] args) {
        SumNoNumberSolution solution = new SumNoNumberSolution();
        System.out.println(solution.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}

class SumNoNumberSolution {
    public int solution(int[] numbers) {
        int arraySum = Arrays.stream(numbers).sum();
        return 45 - arraySum;
    }
}