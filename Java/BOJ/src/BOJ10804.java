import java.io.*;
import java.util.StringTokenizer;

public class BOJ10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numArr = new int[21];
        for(int i = 1; i < 21; i++) {
            numArr[i] = i;
        }

        StringTokenizer st;
        for(int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            while(first < last) {
                int temp = numArr[first];
                numArr[first] = numArr[last];
                numArr[last] = temp;
                first++;
                last--;
            }
        }

        for(int i = 1; i < numArr.length; i++) {
            bw.write(numArr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
