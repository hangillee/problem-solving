package kit.hash;

import java.util.*;
import java.util.stream.Collectors;

public class Ponkemon {
    public static void main(String[] args) {
        PonkemonSolution ponkemonSolution = new PonkemonSolution();
        System.out.println(ponkemonSolution.solution(new int[]{ 1,2,2,3 }));
    }
}

class PonkemonSolution {
    public int solution(int[] nums) {
        int maxSelectable = nums.length / 2;
        int maxIdentical = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        return Math.min(maxSelectable, maxIdentical);
    }
}