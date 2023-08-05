package kit.heap;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveMinNum {
    public static void main(String[] args) {
        RemoveMinNumSolution solution = new RemoveMinNumSolution();
        System.out.println(Arrays.toString(solution.solution(new int[]{4, 3, 2, 1})));
    }
}

class RemoveMinNumSolution {
    public int[] solution(int[] arr) {
        List<Integer> origin = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        List<Integer> heap = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        Collections.sort(heap);
        origin.remove(heap.get(0));
        if(origin.isEmpty()) {
            return new int[]{ -1 };
        }
        return origin.stream().mapToInt(Integer::intValue).toArray();
    }
}
