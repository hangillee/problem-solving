import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1208 {
    static int[] originArr;
    static ArrayList<Integer> firstArr = new ArrayList<>();
    static ArrayList<Integer> secondArr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        originArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            originArr[i] = Integer.parseInt(st.nextToken());
        }

        int mid = originArr.length / 2;
        DFS(0, mid, 0, firstArr);
        DFS(mid, N, 0, secondArr);
        Collections.sort(firstArr);
        Collections.sort(secondArr);

        long answer = 0;
        for(int sum : firstArr) {
            sum = S - sum;
            int low = lowerBound(secondArr, sum);
            int high = upperBound(secondArr, sum);
            answer += high - low;
        }

        if(S == 0) {
            answer--;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int start, int end, int sum, ArrayList<Integer> list) {
        if(start == end) {
            list.add(sum);
            return;
        }
        DFS(start + 1, end, sum + originArr[start], list);
        DFS(start + 1, end, sum, list);
    }

    public static int upperBound(ArrayList<Integer> list, int sum) {
        int front = 0;
        int rear = list.size();
        while(front < rear) {
            int mid = (front + rear) / 2;
            if(list.get(mid) <= sum) {
                front = mid + 1;
            } else {
                rear = mid;
            }
        }
        return rear;
    }

    public static int lowerBound(ArrayList<Integer> list, int sum) {
        int front = 0;
        int rear = list.size();
        while(front < rear) {
            int mid = (front + rear) / 2;
            if(list.get(mid) >= sum) {
                rear = mid;
            } else {
                front = mid + 1;
            }
        }
        return rear;
    }
}
