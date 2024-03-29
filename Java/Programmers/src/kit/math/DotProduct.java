package kit.math;

public class DotProduct {
    public static void main(String[] args) {
        DotProductSolution solution = new DotProductSolution();
        int[] a = { 1, 2, 3, 4 };
        int[] b = { -3, -1, 0, 2};
        System.out.println(solution.solution(a, b));
    }
}

class DotProductSolution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }
        return answer;
    }
}
