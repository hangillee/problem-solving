import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String balanceStr = br.readLine();
            if(balanceStr.equals(".")) {
                break;
            }
            Deque<Character> checkBalance = new ArrayDeque<>();
            for(int i = 0; i < balanceStr.length(); i++) {
                char checkChar = balanceStr.charAt(i);
                if(checkChar == '(' || checkChar == '[') {
                    checkBalance.push(checkChar);
                }
                if (checkChar == ')') {
                    if(!checkBalance.isEmpty() && checkBalance.peek() == '(') {
                        checkBalance.pop();
                    } else {
                        bw.write("no\n");
                        break;
                    }
                }
                if (checkChar == ']') {
                    if(!checkBalance.isEmpty() && checkBalance.peek() == '[') {
                        checkBalance.pop();
                    } else {
                        bw.write("no\n");
                        break;
                    }
                }
                if (checkChar == '.') {
                    if(!checkBalance.isEmpty()) {
                        bw.write("no\n");
                    } else {
                        bw.write("yes\n");
                    }
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
