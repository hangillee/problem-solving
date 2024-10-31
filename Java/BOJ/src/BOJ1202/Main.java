/*
BOJ1202 - 보석 도둑
Greedy 알고리즘 문제 (매 순간 최선을 다한다!)

보석: 무게와 가격을 가진다.
가방: 허용 무게를 가진다.

1. 보석을 무게 오름차순으로 정렬하되, 동일 무게일 경우 가격 내림차순으로 정렬한다.
- 같은 무게라면 더 비싼 보석을 가방에 담는게 맞다.

2. 가방을 무게 오름차순으로 정렬한다.
- 내림차순으로 정렬하게 되면 이미 사용된 가방에 들어갈 수 있었던 보석을 담지 못하게 된다.

3. 가방을 기준으로 순차 탐색을 시작한다.
3-1. 현재 가방에 담을 수 없는 보석이 나올 때까지 보석 배열을 순회하며 우선순위 큐에 넣어둔다.
3-2. 우선순위 큐가 비어있지 않다면 큐에서 보석을 꺼내 그 가격을 결과에 합산한다.

남아있는 보석 중 현재 가방에 넣을 수 있는 보석들을 구해 우선순위 큐에 넣고 그 중 최고(Head)만 합산한다.
그 후, 다음 가방 순회 시에는 앞서서 우선순위 큐에 들어간 보석들은 더 이상 대상이되지 않기 때문에 Greedy 알고리즘이다.
왜냐하면, 이미 소모된 보석 중, 최고값이 있을 수도 있기 때문에 매 순간 최선을 다해 최고 가치를 더하지만 최적합은 아니다.
 */

package BOJ1202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Gem[] gems = new Gem[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            gems[i] = new Gem(M, V);
        }
        Arrays.sort(gems, Gem::compareTo);

        int[] bagSizes = new int[K];
        for (int i = 0; i < K; i++) {
            bagSizes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bagSizes);

        Queue<Integer> values = new PriorityQueue<>(Comparator.reverseOrder());
        long totalValue = 0;
        int gemOrder = 0;
        for (int bagSize : bagSizes) {
            while (gemOrder < N && gems[gemOrder].getWeight() <= bagSize) {
                values.offer(gems[gemOrder].getValue());
                gemOrder++;
            }
            if (!values.isEmpty()) {
                totalValue += values.poll();
            }
        }

        bw.write(String.valueOf(totalValue));
        bw.flush();
        bw.close();
        br.close();
    }

    static class Gem implements Comparable<Gem> {
        private final int weight;
        private final int value;

        public Gem(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }

        @Override
        public int compareTo(Gem target) {
            if (this.weight != target.weight) {
                return this.weight - target.weight;
            }
            return target.value - this.value;
        }
    }
}
