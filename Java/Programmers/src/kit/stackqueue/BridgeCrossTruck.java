package kit.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BridgeCrossTruck {
    public static void main(String[] args) {
        BridgeCrossTruckSolution solution = new BridgeCrossTruckSolution();
        System.out.println(solution.solution(2, 10, new int[]{7, 4, 5, 6}) + "");
    }
}

class BridgeCrossTruckSolution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;
        Deque<Integer> bridge = new ArrayDeque<>();

        for (int i = 0; i < bridge_length; i++) {
            bridge.push(0);
        }

        for (int i = 0; i < truck_weights.length;) {
            answer++;
            currentWeight -= bridge.remove();
            if (currentWeight + truck_weights[i] <= weight) {
                bridge.add(truck_weights[i]);
                currentWeight += truck_weights[i];
                i++;
            } else {
                bridge.add(0);
            }
        }
        return answer + bridge_length;
    }
}