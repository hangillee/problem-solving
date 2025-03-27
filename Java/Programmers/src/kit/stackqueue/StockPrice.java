package kit.stackqueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockPrice {
    public static void main(String[] args) {
        StockPriceSolution solution = new StockPriceSolution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 2, 3, 2, 3})));
    }
}

class StockPriceSolution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> bull = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            while (!bull.isEmpty() && prices[i] < prices[bull.peek()]) {
                answer[bull.peek()] = 1;
                bull.pop();
            }
            bull.push(i);
        }

        while (!bull.isEmpty()) {
            int time = bull.pop();
            answer[time] = prices.length - time - 1;
        }

        return answer;
    }
}
