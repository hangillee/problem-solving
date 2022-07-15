import java.io.*;
import java.util.StringTokenizer;

public class BOJ2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            char result = ' ';
            for(int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            switch(sum) {
                case 0:
                    result = 'D';
                    break;
                case 1:
                    result = 'C';
                    break;
                case 2:
                    result = 'B';
                    break;
                case 3:
                    result = 'A';
                    break;
                case 4:
                    result = 'E';
                    break;
            }
            bw.write(result + "\n");
            bw.flush();
        }
    }
}
