package kit.string;

public class GetCenterString {
    public static void main(String[] args) {
        GetCenterStringSolution solution = new GetCenterStringSolution();
        System.out.println(solution.solution("qqwerr"));
    }
}

class GetCenterStringSolution {
    public String solution(String s) {
        if(s.length() % 2 == 0) {
            return s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        } else {
            return s.substring(s.length() / 2, (s.length() / 2) + 1);
        }
    }
}
