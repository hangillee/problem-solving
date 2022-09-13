import java.io.*;
import java.util.StringTokenizer;

public class Round820A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int countFirst = firstElevator(a);
            int countSecond = secondElevator(b, c);

            if(countFirst < countSecond) {
                bw.write("1\n");
            } else if (countFirst > countSecond) {
                bw.write("2\n");
            } else {
                bw.write("3\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int firstElevator(int a) {
        return a - 1;
    }

    static int secondElevator(int b, int c) {
        return Math.abs(b - c) + Math.abs(c - 1);
    }
}
