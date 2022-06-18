import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= num; i++) {
            //처음에는 1의 제곱으로만 구성해두고
            dp[i] = i;
            //1 4 9가 들어갈 수 있는 경우에,
            for(int j = 1; j * j <= i; j++) {
                //이전의 제곱수의 합들과 1, 4, 9가 차례로 들어갔을 때의 제곱수의 합 중 항의 갯수가 적은 것을 대입
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }

        System.out.println(dp[num]);
    }
}
