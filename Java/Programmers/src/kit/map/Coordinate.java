package kit.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Coordinate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[][]{{1, 4}, {3, 4}, {3, 10}})));
    }
}

class Solution {
    public int[] solution(int[][] v) {
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for(int[] coord : v) {
            xMap.put(coord[0], xMap.getOrDefault(coord[0], 0) + 1);
            yMap.put(coord[1], yMap.getOrDefault(coord[1], 0) + 1);
        }
        int currentMinX= Integer.MAX_VALUE;
        int neededX = 0;
        for(int x : xMap.keySet()) {
            if(currentMinX > xMap.get(x)) {
                currentMinX = xMap.get(x);
                neededX = x;
            }
        }
        int currentMinY = Integer.MAX_VALUE;
        int neededY = 0;
        for(int y : yMap.keySet()) {
            if(currentMinY > yMap.get(y)) {
                currentMinY = yMap.get(y);
                neededY = y;
            }
        }
        return new int[]{neededX, neededY};
    }
}