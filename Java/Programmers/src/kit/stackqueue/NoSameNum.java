package kit.stackqueue;

import java.util.*;
import java.util.stream.Collectors;

public class NoSameNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Deque<Integer> numStack = new ArrayDeque<>();
        for(Integer num : arr) {
            if(numStack.isEmpty()) {
                numStack.push(num);
            } else if(!numStack.peek().equals(num)) {
                numStack.push(num);
            }
        }
        answer = new int[numStack.size()];
        for(int i = answer.length-1 ; i >= 0; i--) {
            answer[i] = numStack.pop();
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        return answer;
    }
}
