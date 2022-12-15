import java.io.*;

public class BOJ10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int month = Integer.parseInt(br.readLine());
        int date = Integer.parseInt(br.readLine());
        if(month == 2 && date == 18) {
            bw.write("Special");
        } else if(month > 2 || (month == 2 && date > 18)) {
            bw.write("After");
        } else {
            bw.write("Before");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
