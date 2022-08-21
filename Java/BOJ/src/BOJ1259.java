import java.io.*;

public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String pallindrome = br.readLine();
            if(pallindrome.equals("0")) {
                break;
            }

            char[] pdnum = pallindrome.toCharArray();
            boolean isPdNum = true;
            for(int i = 0; i < pdnum.length / 2; i++) {
                if(pdnum[i] != pdnum[pdnum.length - 1 - i]) {
                    isPdNum = false;
                    break;
                }
            }
            if(isPdNum) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
