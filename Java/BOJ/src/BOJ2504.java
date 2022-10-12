import java.io.*;
import java.util.Stack;

public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String command = br.readLine();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        int value = 1;
        for(int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == '(') {
                stack.push(command.charAt(i));
                value *= 2;
            } else if(command.charAt(i) == '[') {
                stack.push(command.charAt(i));
                value *= 3;
            } else if(command.charAt(i) == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                }
                if(command.charAt(i-1) == '(') {
                    result += value;
                }
                stack.pop();
                value /= 2;
            } else if(command.charAt(i) == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                }
                if(command.charAt(i-1) == '[') {
                    result += value;
                }
                stack.pop();
                value /= 3;
            }
        }

        if(!stack.isEmpty()) {
            bw.write("0\n");
        } else {
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
