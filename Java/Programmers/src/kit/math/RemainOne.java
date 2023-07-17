package kit.math;

public class RemainOne {
    public static void main(String[] args) {
        RemainOneSolution solution = new RemainOneSolution();
        System.out.println(solution.solution(11));
    }
}

class RemainOneSolution {
    public int solution(int n) {
        int divisor = n - 1;
        for(int i = 2; i < n - 1; i++) {
            if(divisor % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
}
