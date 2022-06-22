import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue myQueue = new Queue();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            if(command.equals("push")) {
                myQueue.push(num);
            }
            if(command.equals("pop")) {
                myQueue.pop();
            }
            if(command.equals("size")) {
                myQueue.size();
            }
            if(command.equals("empty")) {
                myQueue.empty();
            }
            if(command.equals("front")) {
                myQueue.front();
            }
            if(command.equals("back")) {
                myQueue.back();
            }
        }
    }
}

class Queue {
    private static ArrayList<Integer> queue = new ArrayList<>();
    private static int MAX = 100;
    private static int front = 0;
    private static int back = 0;

    public void push(int X) {
        queue.add(X);
        back++;
    }
    public void pop() {
        if(front == back) {
            System.out.println(-1);
            return;
        }
        System.out.println(queue.get(front));
        queue.remove(front);
        back--;
    }

    public void size() {
        System.out.println(queue.size());
    }

    public void empty() {
        if(front == back) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public void front() {
        if(front == back) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(front));
        }
    }
    public void back() {
        if(front == back) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(back-1));
        }
    }
}
