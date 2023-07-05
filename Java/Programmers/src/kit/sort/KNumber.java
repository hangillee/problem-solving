package kit.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < commands.length; i++) {
            int[] temp = commands[i];
            int[] parted = Arrays.copyOfRange(array, temp[0]-1, temp[1]);
            Arrays.sort(parted);
            list.add(parted[temp[2]-1]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
