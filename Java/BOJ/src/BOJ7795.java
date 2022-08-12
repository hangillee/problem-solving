import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            Integer[] numSetA = new Integer[A];
            Integer[] numSetB = new Integer[B];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < numSetA.length; j++) {
                numSetA[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < numSetB.length; j++) {
                numSetB[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(numSetB);
            int answer = 0;
            for(int j = 0; j < numSetA.length; j++) {
                int targetNum = numSetA[j];
                int front = 0;
                int rear = numSetB.length - 1;

                while(front <= rear) {
                    int mid = (front + rear) / 2;
                    if(numSetB[mid] < targetNum) {
                        front = mid + 1;
                    } else {
                        rear = mid - 1;
                    }
                }

                answer += front;
            }
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
