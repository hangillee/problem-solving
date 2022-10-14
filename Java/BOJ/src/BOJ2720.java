import java.io.*;

public class BOJ2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());
            int quarter = change / 25;
            int dime = change % 25 / 10;
            int nickel = change % 25 % 10 / 5;
            int penny = change % 25 % 10 % 5;
            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
