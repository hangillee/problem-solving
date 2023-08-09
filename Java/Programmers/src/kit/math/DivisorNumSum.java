package kit.math;

public class DivisorNumSum {
    public static void main(String[] args) {
        DivisorNumSumSolution solution = new DivisorNumSumSolution();
        System.out.println(solution.solution(13, 17));
    }
}

class DivisorNumSumSolution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            int count = 0;
            for(int j = 1; j * j <= i; j++) {
                if(j * j == i) count++;
                else if(i % j == 0) count += 2;
            }
            if(count % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
}
