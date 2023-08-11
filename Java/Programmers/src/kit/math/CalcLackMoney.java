package kit.math;

public class CalcLackMoney {
    public static void main(String[] args) {
        CalcLackMoneySolution solution = new CalcLackMoneySolution();
        System.out.println(solution.solution(2500, 20, 2500));
    }
}

class CalcLackMoneySolution {
    public long solution(int price, int money, int count) {
        long spentMoney = 0;
        for(long i = 1; i <= count; i++) {
            spentMoney += (price * i);
        }
        long result = money - spentMoney;
        return result < 0 ? -result : 0;
    }
}