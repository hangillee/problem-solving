import java.io.*;

public class BOJ15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        char[] alphabets = br.readLine().toCharArray();

        long hashCode = 0L;
        long r = 1L;
        for(int i = 0; i < L; i++) {
            hashCode = (hashCode + (alphabets[i] - 96) * r) % 1234567891;
            r = (r * 31) % 1234567891;
        }

        bw.write(String.valueOf(hashCode));
        bw.flush();
        bw.close();
        br.close();
    }
}
