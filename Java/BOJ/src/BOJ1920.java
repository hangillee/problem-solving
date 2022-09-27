import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            A[i] = num;
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            bw.write(binarySearch(A, target)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int binarySearch(int[] A, int target) {
        int front = 0;
        int rear = A.length - 1;
        while(front <= rear) {
            int mid = (front + rear) / 2;
            if(target > A[mid]) {
                front = mid + 1;
            } else if (target < A[mid]) {
                rear = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
