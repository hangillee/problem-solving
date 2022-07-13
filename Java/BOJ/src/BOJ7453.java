import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ7453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
            C[i] = Integer.parseInt(st.nextToken());
            D[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        int[] AB = new int[N * N];
        int[] CD = new int[N * N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                AB[idx] = A[i] + B[j];
                CD[idx] = C[i] + D[j];
                idx++;
            }
        }

        Arrays.sort(AB);
        Arrays.sort(CD);

        long result = getZeroSum(AB, CD);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long getZeroSum(int[] AB, int[] CD) {
        int leftPointer = 0;
        int rightPointer = CD.length - 1;
        long count = 0;

        while(leftPointer < AB.length && rightPointer >= 0) {
            int sumInAB = AB[leftPointer];
            int sumInCD = CD[rightPointer];

            if(sumInAB + sumInCD == 0) {
                long leftCount = 0;
                long rightCount = 0;

                while(leftPointer < AB.length && AB[leftPointer] == sumInAB) {
                    leftPointer++;
                    leftCount++;
                }

                while(rightPointer >= 0 && CD[rightPointer] == sumInCD) {
                    rightPointer--;
                    rightCount++;
                }

                count += leftCount * rightCount;
            } else if (sumInAB + sumInCD > 0) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }

        return count;
    }
}
