import java.io.*;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            char[] chars = br.readLine().toCharArray();
            bw.write(String.valueOf(chars[0]));
            bw.write(String.valueOf(chars[chars.length - 1]));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
