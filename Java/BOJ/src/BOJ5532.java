import java.io.*;

public class BOJ5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int Adays = 0;
        if(A % C != 0) {
            Adays = A / C + 1;
        } else {
            Adays = A / C;
        }

        int Bdays = 0;
        if(B % D != 0) {
            Bdays = B / D + 1;
        } else {
            Bdays = B / D;
        }

        int MaxDay = Math.max(Adays, Bdays);
        bw.write(String.valueOf(L - MaxDay));
        bw.flush();
        bw.close();
        br.close();
    }
}
