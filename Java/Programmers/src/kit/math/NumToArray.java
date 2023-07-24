package kit.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumToArray {
    public static void main(String[] args) {
        NumToArraySolution solution = new NumToArraySolution();
        System.out.println(Arrays.toString(solution.solution(12345)));
    }
}

class NumToArraySolution {
    public int[] solution(long n) {
        List<Long> numList = new ArrayList<>();
        while(n > 0) {
            numList.add(n % 10);
            n /= 10;
        }
        return numList.stream().mapToInt(Long::intValue).toArray();
    }
}