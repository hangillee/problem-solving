import java.io.*;

public class BOJ6810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] isbn = { 9, 7, 8, 0, 9, 2, 1, 4, 1, 8, 0, 0, 0 };
        for(int i = 0; i < 3; i++) {
            int N = Integer.parseInt(br.readLine());
            isbn[i+10] = N;
        }

        int result = 0;
        for(int i = 0; i < isbn.length; i++) {
            if(i % 2 == 0) {
                result += isbn[i];
            } else {
                result += isbn[i] * 3;
            }
        }

        bw.write("The 1-3-sum is " + result);
        bw.flush();
        bw.close();
        br.close();
    }
}
