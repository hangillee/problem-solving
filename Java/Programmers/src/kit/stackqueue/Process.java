package kit.stackqueue;

import java.util.ArrayDeque;
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

        Queue<Integer> processes = new ArrayDeque<>();
        for (int priority : priorities) {
            processes.add(priority);
        }

        while (!processes.isEmpty()) {
            Integer maxPriority = processes.stream()
                    .max(Integer::compare)
                    .get(); // 최우선 프로세스 탐색

            Integer process = processes.remove();
            if (process < maxPriority) { // 최우선 프로세스가 아니면
                processes.add(process); // 다시 큐에 삽입
                location = location == 0 ? processes.size() - 1 : location - 1;
            } else { //최우선 프로세스라면
                if (location == 0) { // 또한 현재 프로세스의 실행 순서를 구하고 있다면
                    break; // 탐색 종료
                } else { // 찾고 있던 프로세스가 아니라면
                    location--; // 포인터 이동
                    answer++; // 실행된 프로세스 개수 증가
                }
            }
        }

        return answer;
    }
}
