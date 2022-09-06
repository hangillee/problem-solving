import java.io.*;
import java.util.*;

public class BOJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            ArrayList<Document> queue = new ArrayList<>();
            Integer[] values = new Integer[N];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int value = Integer.parseInt(st.nextToken());
                values[j] = value;
                queue.add(new Document(j, value));
            }

            Arrays.sort(values, Comparator.reverseOrder());
            int index = 0;
            while(index < queue.size()) {
                if(queue.get(index).value < values[index]) {
                    Document currentValue = queue.get(index);
                    queue.remove(index);
                    queue.add(currentValue);
                } else {
                    index++;
                }
            }

            int count = 0;
            for(Document docs : queue) {
                count++;
                if(docs.order == M) {
                    bw.write(count + "\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static class Document {
        int order;
        int value;
        public Document (int order, int value) {
            this.order = order;
            this.value = value;
        }
    }
}
