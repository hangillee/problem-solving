import java.io.*;

public class BOJ5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int count = 0;
        int total = 0;
        for(int i = 1; i < M-1; i++) {
            if(S.charAt(i - 1) == 'I' && S.charAt(i) == 'O' && S.charAt(i + 1) == 'I') {
                count++;
                if(count == N) {
                    count--;
                    total++;
                }
                i++;
            } else {
                count = 0;
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}
