package kit.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntDescSort {
    public static void main(String[] args) {
        IntDescSortSolution solution = new IntDescSortSolution();
        System.out.println(solution.solution(8000000000L));
    }
}

class IntDescSortSolution {
    public long solution(long n) {
        String numStr = String.valueOf(n);
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < numStr.length(); i++) {
            numList.add(numStr.charAt(i) - '0');
        }
        numList.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int digit : numList) {
            sb.append(digit);
        }
        return Long.parseLong(sb.toString());
    }
}
