import java.io.*;
import java.util.*;

public class BOJ10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Set<Integer> numSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            numSet.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortedList = new ArrayList<>(numSet);
        Collections.sort(sortedList);

        for(int i : sortedList) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
