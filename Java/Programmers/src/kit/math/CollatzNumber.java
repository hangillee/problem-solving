package kit.math;

public class CollatzNumber {
    public static void main(String[] args) {
        CollatzNumberSolution solution = new CollatzNumberSolution();
        System.out.println(solution.solution(626331));
    }
}

class CollatzNumberSolution {
    public int solution(long num) {
        for(int i = 0; i < 500; i++) {
            if(num == 1) {
                return i;
            }
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
        }
        return -1;
    }
}