import java.io.*;
import java.util.StringTokenizer;

public class BOJ11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        int[] mNum = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < mNum.length; i++) {
            mNum[i] = Integer.parseInt(st.nextToken());
        }

        int decimal = 0;
        for(int i = 0; i < m; i++) {
            decimal += mNum[i] * Math.pow(A, m-1-i);
        }

        if(decimal == 0) {
            sb.append(0);
        } else {
            while(decimal > 0) {
                sb.insert(0, decimal % B + " ");
                decimal /= B;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
