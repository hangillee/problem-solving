package kit.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Budget {
    public static void main(String[] args) {
        BudgetSolution solution = new BudgetSolution();
        System.out.println(solution.solution(new int[]{ 1, 3, 2, 5, 4 }, 9));
    }
}

class BudgetSolution {
    public int solution(int[] d, int budget) {
        List<Integer> budgetList = new ArrayList<>(Arrays.stream(d).boxed().collect(Collectors.toList()));
        Collections.sort(budgetList);
        int total = budgetList.stream().mapToInt(Integer::intValue).sum();
        if(total == budget) {
            return d.length;
        }
        while(total > budget) {
            total -= budgetList.get(budgetList.size() - 1);
            budgetList.remove(budgetList.size() - 1);
        }
        return budgetList.size();
    }
}