package kit.math;

public class ReverseRadixThree {
    public static void main(String[] args) {
        ReverseRadixThreeSolution solution = new ReverseRadixThreeSolution();
        System.out.println(solution.solution(45));
    }
}

class ReverseRadixThreeSolution {
    public int solution(int n) {
        String radix3 = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < radix3.length(); i++) {
            sb.append(radix3.charAt(i));
        }
        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}
