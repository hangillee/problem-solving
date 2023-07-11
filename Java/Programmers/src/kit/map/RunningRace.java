package kit.map;

import java.util.*;

public class RunningRace {
    public static void main(String[] args) {
        RunningRaceSolution solution = new RunningRaceSolution();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution.solution(players, callings)));
    }
}

class RunningRaceSolution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        Map<Integer, String> rankMap = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i+1);
            rankMap.put(i+1, players[i]);
        }

        for (String calling : callings) {
            int calledPlayerRank = playerMap.get(calling);
            String frontOfPlayer = rankMap.get(calledPlayerRank-1);
            playerMap.put(calling, calledPlayerRank-1);
            playerMap.put(frontOfPlayer, calledPlayerRank);
            rankMap.put(calledPlayerRank-1, calling);
            rankMap.put(calledPlayerRank, frontOfPlayer);
        }

        String[] answer = new String[players.length];
        for(int rank : rankMap.keySet()) {
            answer[rank-1] = rankMap.get(rank);
        }
        return answer;
    }
}