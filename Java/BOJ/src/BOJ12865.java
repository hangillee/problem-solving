import java.io.*;
import java.util.StringTokenizer;

public class BOJ12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] dp = new int[N+1][K+1];
        int[] itemsWeight = new int[N+1];
        int[] itemsValue = new int[N+1];

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            itemsWeight[i] = Integer.parseInt(st.nextToken()); //무게
            itemsValue[i] = Integer.parseInt(st.nextToken()); //가치
        }

        //물건
        for(int i = 1; i <= N; i++) {
            //버틸 수 있는 최대 무게
            for(int j = 1; j <= K; j++) {
                //만약 물건의 무게가 최대 무게보다 낮으면
                if(itemsWeight[i] <= j) {
                    //이전에 넣은 물건을 빼고 현재 물건을 넣는 것이 이전까지의 가방에 담은 물건들의 가치보다 더 좋은 가치를 가지면
                    if((itemsValue[i] + dp[i - 1][j - itemsWeight[i]]) > dp[i - 1][j]) {
                        //가방에서 이전 물건을 빼고(이전 물건을 넣기 전의 최댓값을 가져오고) 현재 물건을 넣음
                        dp[i][j] = itemsValue[i] + dp[i - 1][j - itemsWeight[i]];
                    } else {
                        //현재 물건이 이전 물건들을 빼고 새로 넣는거보다 가치가 없다면 이전 가치 계승
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    //물건의 무게가 최대 무게를 넘어버리면 넣을 수 없음
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        bw.write(String.valueOf(dp[N][K]));
        bw.flush();
        bw.close();
        br.close();
    }
}
