import java.io.*;

public class BOJ26766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String heart =
                " @@@   @@@ \n" +
                "@   @ @   @\n" +
                "@    @    @\n" +
                "@         @\n" +
                " @       @ \n" +
                "  @     @  \n" +
                "   @   @   \n" +
                "    @ @    \n" +
                "     @     ";
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            bw.write(heart + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
