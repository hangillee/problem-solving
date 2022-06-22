import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String steel = br.readLine();

        Stack<Character> stlStk = new Stack<>();
        int num = 0;
        int total = 0;

        for(int i = 0; i < steel.length(); i++) {
            char ch = steel.charAt(i);

            if(ch == '(') {
                stlStk.push(ch);
                num++;
            } else {
                if(stlStk.peek() == ')') {
                    stlStk.push(ch);
                    num--;
                    total++;
                } else {
                    stlStk.push(ch);
                    num--;
                    total += num;
                }
            }
        }

        System.out.println(total);
    }
}
