package kit.math;

import java.util.Arrays;

public class GCDLCM {
    public static void main(String[] args) {
        GCDLCMSolution solution = new GCDLCMSolution();
        System.out.println(Arrays.toString(solution.solution(2, 5)));
    }
}

class GCDLCMSolution {
    public int[] solution(int n, int m) {
        int gcd;
        if(n > m) {
            gcd = getGCD(n, m);
        } else {
            gcd = getGCD(m, n);
        }
        return new int[]{ gcd, (n * m) / gcd };
    }

    int getGCD(int n, int m) {
        if(m == 0) return n;
        else return getGCD(m, n % m);
    }
}
