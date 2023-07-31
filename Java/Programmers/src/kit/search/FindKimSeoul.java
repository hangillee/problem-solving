package kit.search;

public class FindKimSeoul {
    public static void main(String[] args) {
        FindKimSeoulSolution solution = new FindKimSeoulSolution();
        System.out.println(solution.solution(new String[]{ "Jane", "Kim" }));
    }
}

class FindKimSeoulSolution {
    public String solution(String[] seoul) {
        int index = 0;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}