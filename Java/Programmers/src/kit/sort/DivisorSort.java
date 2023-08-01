package kit.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivisorSort {
    public static void main(String[] args) {
        DivisorSortSolution solution = new DivisorSortSolution();
        System.out.println(Arrays.toString(solution.solution(new int[]{5, 9, 7, 10}, 5)));
    }
}

class DivisorSortSolution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> divided = new ArrayList<>();
        for(int num : arr) {
            if(num % divisor == 0) {
                divided.add(num);
            }
        }
        Collections.sort(divided);
        if(divided.isEmpty()) {
            return new int[]{ -1 };
        }
        return divided.stream().mapToInt(Integer::intValue).toArray();
    }
}
