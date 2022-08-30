import java.io.*;
import java.util.*;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> nameSet = new HashSet<>();
        for(int i = 0; i < N; i++) {
            nameSet.add(br.readLine());
        }

        Map<String, Integer> nameMap = new HashMap<>();
        for(int i = 0; i < M; i++) {
            nameMap.put(br.readLine(), 1);
        }

        int count = 0;
        ArrayList<String> nameList = new ArrayList<>();
        for(String str : nameSet) {
            if(nameMap.get(str) != null) {
                count++;
                nameList.add(str);
            }
        }

        Collections.sort(nameList);

        bw.write(count + "\n");
        for(String name : nameList) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
