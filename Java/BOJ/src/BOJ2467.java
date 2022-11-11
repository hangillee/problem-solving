import java.io.*;
import java.util.StringTokenizer;

public class BOJ2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] solutions = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }

        int leftPointer = 0;
        int rightPointer = N - 1;
        int firstSolution = solutions[leftPointer];
        int secondSolution = solutions[rightPointer];
        long min = Long.MAX_VALUE;

        while(leftPointer < rightPointer) {
            long sum = solutions[leftPointer] + solutions[rightPointer];
            if(min > Math.abs(sum)) {
                min = Math.abs(sum);
                firstSolution = solutions[leftPointer];
                secondSolution = solutions[rightPointer];
            }
            if(sum > 0) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }

        bw.write(firstSolution + " " + secondSolution);
        bw.flush();
        bw.close();
        br.close();
    }
}
