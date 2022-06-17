import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] seq = new int[n];
        int[] lisdp = new int[n];
        int[] ldsdp = new int[n];

        for(int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            lisdp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(seq[i] > seq[j] && lisdp[i] < lisdp[j] + 1) {
                    lisdp[i] = lisdp[j] + 1;
                }
            }
        }

        for(int i = n-1; i >= 0; i--) {
            ldsdp[i] = 1;
            for(int j = n-1; j > i; j--) {
                if(seq[i] > seq[j] && ldsdp[i] < ldsdp[j] + 1) {
                    ldsdp[i] = ldsdp[j] + 1;
                }
            }
        }

        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(lisdp[i] + ldsdp[i], max);
        }

        System.out.println(max - 1);
    }
}
