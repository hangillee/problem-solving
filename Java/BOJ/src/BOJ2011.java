import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String code = br.readLine();
        long[] dp = new long[code.length()+1];
        dp[0] = 1;
        dp[1] = 1;

        if(code.charAt(0) == '0') {
            System.out.println(0);
        }
        else {
            for(int i = 1; i < code.length(); i++) {
                char prev = code.charAt(i-1);
                if('1' <= code.charAt(i) && code.charAt(i) <= '9') {
                    dp[i+1] += dp[i] % 1000000;
                }
                //암호 두 자리일 경우
                if(!(prev == '0' || prev > '2' || (prev == '2' && code.charAt(i) > '6'))){
                    dp[i+1] += dp[i-1] % 1000000;
                }
            }
            System.out.println(dp[code.length()] % 1000000);
        }
    }
}
