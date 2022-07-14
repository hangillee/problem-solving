import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2143 {
    static ArrayList<Integer> prefixN, prefixM;
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        prefixN = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        prefixM = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            int sum = 0;
            for(int j = i; j < N; j++) {
                sum += arrN[j];
                prefixN.add(sum);
            }
        }

        for(int i = 0; i < M; i++) {
            int sum = 0;
            for(int j = i; j < M; j++) {
                sum += arrM[j];
                prefixM.add(sum);
            }
        }

        Collections.sort(prefixN);
        Collections.sort(prefixM);

        long answer = getAnswer();
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long getAnswer() {
        int leftPointer = 0;
        int rightPointer = prefixM.size() - 1;
        long answer = 0;

        while(leftPointer < prefixN.size() && rightPointer >= 0) {
            int leftSum = prefixN.get(leftPointer);
            int rightSum = prefixM.get(rightPointer);
            if(leftSum + rightSum == T) {
                long leftCount = 0;
                long rightCount = 0;
                while(leftPointer < prefixN.size() && leftSum == prefixN.get(leftPointer)) {
                    leftPointer++;
                    leftCount++;
                }
                while(rightPointer >= 0 && rightSum == prefixM.get(rightPointer)) {
                    rightPointer--;
                    rightCount++;
                }
                answer += leftCount * rightCount;
            }
            else if (leftSum + rightSum < T) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return answer;
    }
}
