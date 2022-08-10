import java.io.*;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String croatianWord = br.readLine();
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < 8; i++) {
            croatianWord = croatianWord.replaceAll(croatianAlphabet[i], "C");
        }

        bw.write(String.valueOf(croatianWord.length()));
        bw.flush();
        bw.close();
        br.close();
    }
}
