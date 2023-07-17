package kit.math;

public class DigitsSum {
    public static void main(String[] args) {
        DigitsSumSolution solution = new DigitsSumSolution();
        System.out.println(solution.solution(987));
    }
}

class DigitsSumSolution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += (n % 10);
            n /= 10;
        }
        return answer;
    }
}
