package kit.math;

public class HarshadNumber {
    public static void main(String[] args) {
        HarshadNumberSolution solution = new HarshadNumberSolution();
        System.out.println(solution.solution(13));
    }
}

class HarshadNumberSolution {
    public boolean solution(int x) {
        int origin = x;
        int sum = 0;
        while(x > 0) {
            sum += (x % 10);
            x /= 10;
        }
        return origin % sum == 0;
    }
}
