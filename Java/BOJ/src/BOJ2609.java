import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(euclidean(a, b));
        System.out.println(a*b/euclidean(a, b));
    }

    public static int euclidean(int a, int b) {
        int r = 0;
        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
