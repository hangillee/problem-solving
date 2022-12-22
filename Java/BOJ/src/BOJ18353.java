import java.io.*;
import java.util.StringTokenizer;

public class BOJ18353 {
    static int[] soldiers;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        soldiers = new int[N+1];
        dp = new int[N+1];
        for(int i = N; i > 0; i--) {
            soldiers[i] = Integer.parseInt(st.nextToken());
        }
        int length = 1;

        for(int i = 1; i <= N; i++) {
            int index = binarySearch(soldiers[i], 1, length, length+1);
            if(index == -1) {
                dp[length++] = soldiers[i];
            } else {
                dp[index] = soldiers[i];
            }
        }

        System.out.println(N-(length-1));
    }

    public static int binarySearch(int soldier, int front, int rear, int size) {
        int index = 0;
        while(front <= rear) {
            int center = (front + rear) / 2;
            if(dp[center] >= soldier) {
                rear = center - 1;
                index = center;
            } else {
                front = center + 1;
            }
        }
        if(front == size) {
            return -1;
        }
        return index;
    }
}
