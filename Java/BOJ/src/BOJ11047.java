import java.io.*;
import java.util.StringTokenizer;

public class BOJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coinType = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int[] coins = new int[coinType];
        int count = 0;

        for(int i = 0; i < coinType; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        while(money > 0) {
            for(int i = 1; i <= coinType; i++) {
                if(money - coins[coinType-i] >= 0) {
                    money -= coins[coinType-i];
                    count++;
                    break;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
