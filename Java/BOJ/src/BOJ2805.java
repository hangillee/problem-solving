import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2805 {
    static Long[] treeList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        treeList = new Long[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            treeList[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(treeList);

        long bestTree = cutTree(0, treeList[N-1], M);
        bw.write(String.valueOf(bestTree));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long cutTree(long start, long end, long M) {
        long mid = 0;
        while(start <= end) {
            long sum = 0;
            mid = (start + end) / 2;
            for(int i = 0; i < treeList.length; i++) {
                if(treeList[i] >= mid) {
                    sum += treeList[i] - mid;
                }
            }
            if(sum >= M){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
