import java.io.*;

public class BOJ27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(br.readLine()).charAt(Integer.parseInt(br.readLine())-1));
        bw.flush();
        br.close();
        bw.close();
    }
}
