package kit.bit;

public class NextBigNum {
    public static void main(String[] args) {
        NextBigNumSolution solution = new NextBigNumSolution();
        System.out.println(solution.solution(15));
    }
}

class NextBigNumSolution {
    public int solution(int n) {
        int answer = 0;
        int bitCount = Integer.bitCount(n);
        for(int i = n+1; i <= 1000000; i++) {
            if(Integer.bitCount(i) == bitCount) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}