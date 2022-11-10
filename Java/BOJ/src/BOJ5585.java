import java.io.*;

public class BOJ5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] changes = { 500, 100, 50, 10, 5, 1 };

        int money = 1000 - Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < 6; i++) {
            count += money / changes[i];
            money = money % changes[i];
            if(money <= 0) {
                break;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
