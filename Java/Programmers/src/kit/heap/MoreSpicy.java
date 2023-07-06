package kit.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MoreSpicy {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 2}, 7));
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = Arrays.stream(scoville).boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));
        while(heap.size() >= 2 && heap.peek() < K) {
            heap.offer(heap.poll() + (heap.poll() * 2));
            answer++;
        }
        if(!heap.isEmpty() && heap.peek() < K) return -1;
        else return answer;
    }
}
