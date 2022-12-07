import java.io.*;

public class BOJ23235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 0;
        while(true) {
            i++;
            String numbers = br.readLine();
            if(numbers.equals("0")) {
                break;
            }
            bw.write("Case " + i + ": Sorting... done!\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
