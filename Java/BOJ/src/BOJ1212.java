import java.io.*;

public class BOJ1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String octalNum = br.readLine();
        String answer;

        if(octalNum.charAt(0) == '0') {
            sb.append(0);
            answer = sb.toString();
        } else {
            for(int i = 0; i < octalNum.length(); i++) {
                int num = octalNum.charAt(i) - '0';
                sb.append(num / 4);
                num %= 4;
                sb.append(num / 2);
                num %= 2;
                sb.append(num);
            }

            answer = sb.toString();
            int i = 0;
            while(answer.charAt(i) != '1') {
                answer = answer.substring(i+1);
            }
        }

        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}
