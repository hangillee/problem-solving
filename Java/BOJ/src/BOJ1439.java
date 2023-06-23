import java.io.*;

public class BOJ1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        int countZero = 0;
        boolean isZero = false;
        int countOne = 0;
        boolean isOne = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0' && !isZero) {
                countZero++;
                isZero = true;
                isOne = false;
            } else if(s.charAt(i) == '1' && !isOne) {
                countOne++;
                isZero = false;
                isOne = true;
            }
        }

        System.out.print(Math.min(countZero, countOne));
    }
}
