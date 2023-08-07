package kit.string;

public class WaterMelon {
    public static void main(String[] args) {
        WaterMelonSolution solution = new WaterMelonSolution();
        System.out.println(solution.solution(9));

    }
}

class WaterMelonSolution {
    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n; i++) {
            stringBuilder.append(i % 2 == 0 ? "수" : "박");
        }
        return stringBuilder.toString();
    }
}
