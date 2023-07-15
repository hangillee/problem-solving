package kit.math;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOddSolution evenOddSolution = new EvenOddSolution();
        System.out.println(evenOddSolution.solution(-2));
    }
}

class EvenOddSolution {
    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}