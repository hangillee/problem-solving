import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        StringTokenizer st;
        Stack myStack = new Stack();
        int N = Integer.parseInt(br.readLine());
        String command;
        int num = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            if(command.equals("push") && num != 0) {
                myStack.push(num);
            }
            if(command.equals("pop")) {
                sb = new StringBuilder();
                sb.append(myStack.pop());
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            }
            if(command.equals("size")){
                sb = new StringBuilder();
                sb.append(myStack.size());
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            }
            if(command.equals("empty")){
                myStack.empty();
            }
            if(command.equals("top")){
                myStack.top();
            }
        }
        bw.close();
    }
}

class Stack {
    private static ArrayList<Integer> stackArr = new ArrayList<>();
    private static int index = 0;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb;

    public void push(int X) {
        stackArr.add(X);
        index++;
    }

    public int pop() {
        if(index == 0) {
            return -1;
        }
        int X = stackArr.get(index-1);
        stackArr.remove(index-1);
        index--;
        return X;
    }

    public int size() {
        return stackArr.size();
    }

    public void empty() throws IOException {
        if(index == 0) {
            bw.write("1\n");
            bw.flush();
        } else {
            bw.write("0\n");
            bw.flush();
        }
    }

    public void top() throws IOException {
        if(index == 0) {
            bw.write("-1\n");
            bw.flush();
        } else {
            sb = new StringBuilder();
            sb.append(stackArr.get(index-1));
            sb.append("\n");
            bw.write(sb.toString());
            bw.flush();
        }
    }
}
