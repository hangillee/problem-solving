import java.io.*;

public class BOJ10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] buttons = {300, 60, 10};
        int[] hitCount = new int[3];
        for(int i = 0; i < buttons.length; i++) {
            hitCount[i] += T / buttons[i];
            T %= buttons[i];
        }
        if(T != 0) {
            bw.write("-1");
        } else {
            bw.write(hitCount[0] + " " + hitCount[1] + " " + hitCount[2]);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
