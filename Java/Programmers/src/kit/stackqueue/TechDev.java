package kit.stackqueue;

import java.util.*;
import java.util.stream.Collectors;

public class TechDev {
    public static void main(String[] args) {
        TechDevSolution solution = new TechDevSolution();
        System.out.println(Arrays.toString(solution.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }
}

class TechDevSolution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deployedList = new ArrayList<>();
        List<Integer> deployQueue = Arrays.stream(progresses).boxed().collect(Collectors.toList());
        List<Integer> speedList = Arrays.stream(speeds).boxed().collect(Collectors.toList());

        while(!deployQueue.isEmpty()) {
            int count = 0;
            for(int i = 0; i < deployQueue.size(); i++) {
                deployQueue.set(i, deployQueue.get(i) + speedList.get(i));
            }
            for(int i = 0 ; i < deployQueue.size(); i++) {
                if(deployQueue.get(i) >= 100) {
                    deployQueue.remove(i);
                    speedList.remove(i);
                    count++; i--;
                } else {
                    break;
                }
            }
            if(count > 0) {
                deployedList.add(count);
            }
        }
        return deployedList.stream().mapToInt(Integer::intValue).toArray();
    }
}
