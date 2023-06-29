package kit.hash;

import java.util.HashMap;
import java.util.Map;

public class Marathon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "ana", "mislav" };
        System.out.println(solution.solution(participant, completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for(String name : participant) {
            map.merge(name, 1, Integer::sum);
        }

        for(String name : completion) {
            map.merge(name, 1, (a, b) -> a - b);
        }

        for(String name : map.keySet()) {
            if(map.get(name) > 0) {
                answer = name;
                break;
            }
        }

        return answer;
    }
}
