import java.io.*;
import java.util.StringTokenizer;

public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String expression = br.readLine();
        StringTokenizer st = new StringTokenizer(expression, "-");

        int result;
        String firstExpression = st.nextToken();
        if(firstExpression.contains("+")) {
            StringTokenizer innerSt = new StringTokenizer(firstExpression, "+");
            int sum = 0;
            while(innerSt.hasMoreTokens()) {
                sum += Integer.parseInt(innerSt.nextToken());
            }
            result = sum;
        } else {
            result = Integer.parseInt(firstExpression);
        }

        while(st.hasMoreTokens()) {
            String sumExpression = st.nextToken();
            if(sumExpression.contains("+")) {
                StringTokenizer innerSt = new StringTokenizer(sumExpression, "+");
                int sum = 0;
                while(innerSt.hasMoreTokens()) {
                    sum += Integer.parseInt(innerSt.nextToken());
                }
                result -= sum;
            } else {
                result -= Integer.parseInt(sumExpression);
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
