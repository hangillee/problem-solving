package kit.matrix;

import java.util.Arrays;

public class MatrixSum {
    public static void main(String[] args) {
        MatrixSumSolution solution = new MatrixSumSolution();
        int[][] arr1 = new int[][]{{1}, {2}};
        int[][] arr2 = new int[][]{{3}, {4}};

        System.out.println(Arrays.deepToString(solution.solution(arr1, arr2)));
    }
}

class MatrixSumSolution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
