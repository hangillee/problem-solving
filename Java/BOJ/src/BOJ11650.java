import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] num = new int[n][2];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++) {
                num[i][j] = Integer.parseInt(st.nextToken(" "));
            }
        }

        Arrays.sort(num, (first, second) -> {
            if(first[0] == second[0]) {
                return first[1] - second[1];
            } else {
                return first[0] - second[0];
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.println(num[i][0] + " " + num[i][1]);
        }
    }
}
