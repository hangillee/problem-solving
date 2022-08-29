import java.io.*;
import java.util.*;

public class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] coordArr = new Integer[N];
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            coordArr[i] = num;
        }

        Set<Integer> coordSet = new HashSet<>(Arrays.asList(coordArr));
        Integer[] sortedArr = coordSet.toArray(new Integer[0]);
        Arrays.sort(sortedArr);

        Map<Integer, Integer> coordMap = new HashMap<>();
        for(int i = 0; i < sortedArr.length; i++) {
            coordMap.put(sortedArr[i], i);
        }

        for(int i : coordArr) {
            bw.write( coordMap.get(i)+ " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
