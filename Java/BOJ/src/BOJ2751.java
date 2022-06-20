import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0; i < testCase; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(num);

        for(int i : num) {
            sb.append(i + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
