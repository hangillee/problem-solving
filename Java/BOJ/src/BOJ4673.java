import java.io.*;

public class BOJ4673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] selfnumber = new boolean[10001];
        for(int i = 1; i < selfnumber.length; i++) {
            int num = d(i);
            if(num <= 10000) {
                selfnumber[num] = true;
            }
        }

        for(int i = 1; i < selfnumber.length; i++) {
            if(!selfnumber[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int d(int n) {
        int sum = n;

        while(n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }
}
