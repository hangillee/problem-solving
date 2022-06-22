import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque myDeque = new Deque();
        int num = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            if(command.equals("push_front")) {
                myDeque.push_front(num);
            }
            if(command.equals("push_back")) {
                myDeque.push_back(num);
            }
            if(command.equals("pop_front")) {
                myDeque.pop_front();
            }
            if(command.equals("pop_back")) {
                myDeque.pop_back();
            }
            if(command.equals("size")) {
                myDeque.size();
            }
            if(command.equals("empty")) {
                myDeque.empty();
            }
            if(command.equals("front")) {
                myDeque.front();
            }
            if(command.equals("back")) {
                myDeque.back();
            }
        }
    }
}

class Deque {
    private static ArrayList<Integer> deque = new ArrayList<>();
    private static int front = 0;
    private static int back = 0;

    public void push_front(int X) {
        deque.add(0, X);
        back++;
    }
    public void push_back(int X) {
        deque.add(X);
        back++;
    }
    public void pop_front() {
        if(front == back) {
            System.out.println(-1);
            return;
        }
        System.out.println(deque.get(front));
        deque.remove(front);
        back--;
    }
    public void pop_back() {
        if(front == back) {
            System.out.println(-1);
            return;
        }
        System.out.println(deque.get(back-1));
        deque.remove(back-1);
        back--;
    }

    public void size() {
        System.out.println(deque.size());
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
            return;
        }
        System.out.println(deque.get(front));
    }

    public void back() {
        if(front == back) {
            System.out.println(-1);
            return;
        }
        System.out.println(deque.get(back-1));
    }
}
