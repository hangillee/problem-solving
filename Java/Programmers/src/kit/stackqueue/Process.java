package kit.stackqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Process {
    public static void main(String[] args) {
        ProcessSolution solution = new ProcessSolution();
        int order = solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println(order + "");
    }
}

class ProcessSolution {
    public int solution(int[] priorities, int location) {
        int answer = 1;

        List<Integer> prioritiesList = new ArrayList<>();
        for (int priority : priorities) {
            prioritiesList.add(priority);
        }

        Queue<Integer> processes = new ArrayDeque<>(prioritiesList);
        while (!processes.isEmpty()) {
            Integer maxPriority = processes.stream()
                    .max(Integer::compare)
                    .get();

            Integer process = processes.remove();
            if (process < maxPriority) {
                processes.add(process);
                location = location == 0 ? processes.size() - 1 : location - 1;
            } else {
                if (location == 0) {
                    break;
                } else {
                    location--;
                    answer++;
                }
            }
        }

        return answer;
    }
}
