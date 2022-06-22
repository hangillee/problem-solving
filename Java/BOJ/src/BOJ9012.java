import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            System.out.println(vps(br.readLine()));
        }
    }

    public static String vps(String str) throws IOException {
        Stack<Character> ps = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(') {
                ps.push(c);
            } else if(ps.empty()) {
                return "NO";
            } else {
                ps.pop();
            }
        }

        if(ps.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
