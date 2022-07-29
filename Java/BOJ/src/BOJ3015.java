import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ3015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Person> heights = new ArrayDeque<>();
        long isVisible = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            Person currentPerson = new Person(num, 1);
            while(!heights.isEmpty() && num >= heights.peek().height) {
                Person frontPerson = heights.pop();
                isVisible += frontPerson.count;
                if(frontPerson.height == num) {
                    currentPerson.count += frontPerson.count;
                }
            }
            if(!heights.isEmpty()) {
                isVisible++;
            }
            heights.push(currentPerson);
        }

        bw.write(String.valueOf(isVisible));
        bw.flush();
        bw.close();
        br.close();
    }

    static class Person {
        int height;
        int count;

        Person(int height, int count) {
            this.height = height;
            this.count = count;
        }
    }
}
