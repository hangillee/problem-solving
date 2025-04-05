package kit.string;

public class SkillTree {
    public static void main(String[] args) {
        SkillTreeSolution solution = new SkillTreeSolution();
        int answer = solution.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
        System.out.println(answer);
    }
}

class SkillTreeSolution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            String temp = tree.replaceAll("[^"+ skill +"]", "");
            boolean isCorrect = true;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) != skill.charAt(i)) {
                    isCorrect = false;
                    break;
                }
            }
            if (isCorrect) {
                answer++;
            }
        }

        return answer;
    }
}
