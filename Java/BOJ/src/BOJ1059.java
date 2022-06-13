import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int setSize = Integer.parseInt(br.readLine());
        int[] numSet = new int[setSize];

        int n;
        int firstIdx = 0;
        int lastIdx = 1001;
        int count = 0;
        boolean flag = true;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < setSize; i++) {
            numSet[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numSet);
        n = Integer.parseInt(br.readLine());


        for(int i : numSet) {
            if(i < n) {
                if(i > firstIdx) {
                    firstIdx = i;
                }
            } else if(n < i) {
                if(i < lastIdx) {
                    lastIdx = i;
                }
            } else {
                System.out.println(count);
                return;
            }
        }

        for(int i = firstIdx + 1; i <= n; i++) {
            for(int j = i + 1; j < lastIdx; j++) {
                if(n <= j) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
