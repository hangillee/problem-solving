package kit.math;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        CarpetSolution solution = new CarpetSolution();
        System.out.println(Arrays.toString(solution.solution(10, 2)));
    }
}

class CarpetSolution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int totalArea = brown + yellow;

        for(int height = 3; height < totalArea; height++) {
            int width = totalArea / height;
            if(width >= height) {
                if((height - 2) * (width - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}
