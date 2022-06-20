import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[][] member = new String[n][4];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++) {
                member[i][j] = st.nextToken();
            }
        }

        Arrays.sort(member, (first, second) -> {
            if(!first[1].equals(second[1])) {
                return Integer.parseInt(second[1]) - Integer.parseInt(first[1]);
            } else if(!first[2].equals(second[2])) {
                return Integer.parseInt(first[2]) - Integer.parseInt(second[2]);
            } else if(!first[3].equals(second[3])) {
                return Integer.parseInt(second[3]) - Integer.parseInt(first[3]);
            } else {
                return first[0].compareTo(second[0]);
            }
        });

        for(int i = 0; i < n; i++) {
            sb.append(member[i][0] + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
