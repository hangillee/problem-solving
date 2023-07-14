package kit.sort;

import java.util.Arrays;

public class MostBigNumber {
    public static void main(String[] args) {
        MostBigNumberSolution solution = new MostBigNumberSolution();
        System.out.println(solution.solution(new int[]{ 0, 0, 0, 0, 0 }));
    }
}

class MostBigNumberSolution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] numberArr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(numberArr, (o1, o2) -> {
            int o1o2 = Integer.parseInt(o1 + o2);
            int o2o1 = Integer.parseInt(o2 + o1);
            return o2o1 - o1o2;
        });
        if(numberArr[0].equals("0")) {
            return numberArr[0];
        }
        for(String number : numberArr) {
            answer.append(number);
        }
        return answer.toString();
    }
}