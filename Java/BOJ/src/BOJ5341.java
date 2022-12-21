import java.io.*;

public class BOJ5341 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            int total = 0;
            int base = Integer.parseInt(br.readLine());
            if(base == 0) {
                break;
            }
            for(int i = 0; i < base; i++) {
                total += base - i;
            }
            bw.write(total+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
