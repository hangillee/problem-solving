package kit.math;

public class PlusMinusSum {
    public static void main(String[] args) {
        PlusMinusSumSolution solution = new PlusMinusSumSolution();
        System.out.println(solution.solution(
                new int[]{ 4, 7, 12 },
                new boolean[]{ true, false, true }
        ));
    }
}

class PlusMinusSumSolution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}