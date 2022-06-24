import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer command = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(command.nextToken());
            if(n > 1) {
                int[] numbers = new int[n];
                for(int j = 0; j < numbers.length; j++) {
                    numbers[j] = Integer.parseInt(command.nextToken());
                }
                gcdSum(n, numbers);
            }
        }
    }

    public static void gcdSum(int n, int[] numbers) {
        int r = 0;
        long sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int a = numbers[i];
                int b = numbers[j];
                while(b != 0) {
                    r = a % b;
                    a = b;
                    b = r;
                }
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
