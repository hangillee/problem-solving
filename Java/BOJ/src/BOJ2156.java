import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2156 {
    private static Integer[] dp;
    private static int[] wine;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int glassNum = Integer.parseInt(br.readLine());

        wine = new int[glassNum+1];
        dp = new Integer[glassNum+1];

        for(int i = 1; i <= glassNum; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = wine[1];
        if(glassNum > 1) {
            dp[2] = wine[1] + wine[2];
        }

        System.out.println(maxDrink(glassNum));
    }

    public static int maxDrink(int glassNum) {
        if(dp[glassNum] == null) {
            dp[glassNum] = Math.max(maxDrink(glassNum - 1),
                    Math.max(maxDrink(glassNum - 3) + wine[glassNum - 1], maxDrink(glassNum - 2)) + wine[glassNum]
            );
        }
        return dp[glassNum];
    }
}
