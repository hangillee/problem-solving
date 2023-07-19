package kit.string;

import java.util.StringTokenizer;

public class JadenCase {
    public static void main(String[] args) {
        JadenCaseSolution solution = new JadenCaseSolution();
        System.out.println(solution.solution("1for 2the 3last 4week"));
    }
}

class JadenCaseSolution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ", true);
        while(st.hasMoreTokens()){
            String target = st.nextToken();
            if(target.startsWith(" ")) {
                answer.append(target);
                continue;
            }
            String toUpperCase = target.substring(0, 1).toUpperCase();
            String toLowerCase = target.substring(1).toLowerCase();
            if(!st.hasMoreTokens()) {
                answer.append(toUpperCase).append(toLowerCase);
            } else {
                answer.append(toUpperCase).append(toLowerCase);
            }
        }
        return answer.toString();
    }
}