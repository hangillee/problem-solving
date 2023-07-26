package kit.math;

public class IntSqrt {
    public static void main(String[] args) {
        IntSqrtSolution solution = new IntSqrtSolution();
        System.out.println(solution.solution(121));
    }
}

class IntSqrtSolution {
    public long solution(long n) {
        if(Math.sqrt(n) % 1 == 0.0) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}