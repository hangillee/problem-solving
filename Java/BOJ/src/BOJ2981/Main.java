package BOJ2981;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int[] diff = new int[N-1];
        for (int i = 0; i < numbers.length-1; i++) {
            diff[i] = Math.abs(numbers[i] - numbers[i+1]);
        }

        int gcd = diff[0];
        for (int i = 1; i < diff.length; i++) {
            gcd = gcd(gcd, diff[i]);
        }

        for (int i = 2; i * i <= gcd; i++) {
            if (gcd % i == 0) {
                bw.write(i + " ");
            }
        }
        bw.write(gcd + "");
        bw.flush();
        bw.close();
        br.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
