package kit.math;

public class GetAverage {
    public static void main(String[] args) {
        GetAverageSolution solution = new GetAverageSolution();
        System.out.println(solution.solution(new int[]{ 1, 2, 3, 4 }));
    }
}


class GetAverageSolution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}