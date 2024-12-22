package BOJ17127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer trees = new StringTokenizer(br.readLine());

        int[] flowers = new int[N];
        for (int i = 0; i < N; i++) {
            flowers[i] = Integer.parseInt(trees.nextToken());
        }

        int result = getResult(flowers);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getResult(int[] flowers) {
        int result = 0;
        int firstGroup = 1;
        for(int i = 0; i < flowers.length - 3; i++) {
            firstGroup *= flowers[i];
            int secondGroup = 1;
            for (int j = i + 1; j < flowers.length - 2; j++) {
                secondGroup *= flowers[j];
                int thirdGroup = 1;
                for (int k = j + 1; k < flowers.length - 1; k++) {
                    thirdGroup *= flowers[k];
                    int fourthGroup = 1;
                    for (int l = k + 1; l < flowers.length; l++) {
                        fourthGroup *= flowers[l];
                    }
                    result = Math.max(result, firstGroup + secondGroup + thirdGroup + fourthGroup);
                }
            }
        }
        return result;
    }
}
