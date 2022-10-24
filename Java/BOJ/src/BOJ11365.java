import java.io.*;

public class BOJ11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        while(!str.equals("END")) {
            StringBuffer sb = new StringBuffer(str);
            bw.write(sb.reverse() + "\n");
            str = br.readLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
