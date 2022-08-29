import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ9024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            Integer[] num = new Integer[n];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(num);

            int minGap = Integer.MAX_VALUE;
            int count = 0;
            int front = 0;
            int rear = n-1;
            while(front < rear) {
                int sum = num[front] + num[rear];
                int currentGap = Math.abs(sum - K);

                if(currentGap == minGap) {
                    count++;
                } else if (currentGap < minGap){
                    count = 1;
                    minGap = currentGap;
                }

                if(sum >= K) {
                    rear--;
                } else {
                    front++;
                }
            }

            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
