import java.io.*;

public class BOJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] reports = new boolean[31];

        for(int i = 0; i < 28; i++) {
            int number = Integer.parseInt(br.readLine());
            reports[number] = true;
        }

        for(int i = 1; i < 31; i++) {
            if(!reports[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
