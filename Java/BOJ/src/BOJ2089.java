import java.io.*;

public class BOJ2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        if(N == 0) {
            sb.append(0);
        } else {
            while(N != 0) {
                int mod = N % -2;
                N /= -2;

                if(mod < 0) {
                    mod += 2;
                    N += 1;
                }

                sb.append(mod);
            }
        }

        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
