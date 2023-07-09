package kit.hash;

import java.util.HashMap;
import java.util.Map;

public class Clothes {
    public static void main(String[] args) {
        ClothesSolution solution = new ClothesSolution();
        System.out.println(solution.solution(new String[][]{
                        {"yellow_hat", "headgear"},
                        {"blue_sunglasses", "eyewear"},
                        {"smoky_makeup", "face"}
        }));
    }
}

class ClothesSolution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();
        for(String[] type : clothes) {
            clothesMap.put(type[1], clothesMap.getOrDefault(type[1], 0) + 1);
        }
        int cases = 1;
        for(String clothType : clothesMap.keySet()) {
            cases *= (clothesMap.get(clothType) + 1);
        }
        return cases - 1;
    }
}
