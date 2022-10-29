import java.io.*;
import java.util.StringTokenizer;

public class BOJ5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int male = Integer.parseInt(st.nextToken());
        int female = Integer.parseInt(st.nextToken());

        while(male != 0 || female != 0) {
            bw.write((male + female) + "\n");
            st = new StringTokenizer(br.readLine());
            male = Integer.parseInt(st.nextToken());
            female = Integer.parseInt(st.nextToken());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
