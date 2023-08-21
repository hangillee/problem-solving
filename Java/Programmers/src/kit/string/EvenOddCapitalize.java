package kit.string;

public class EvenOddCapitalize {
    public static void main(String[] args) {
        EvenOddCapitalizeSolution solution = new EvenOddCapitalizeSolution();
        System.out.println(solution.solution("  TRy HElLo  WORLD "));
    }
}

class EvenOddCapitalizeSolution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length(); j++) {
                if(j % 2 == 0) {
                    stringBuilder.append(String.valueOf(arr[i].charAt(j)).toUpperCase());
                } else {
                    stringBuilder.append(String.valueOf(arr[i].charAt(j)).toLowerCase());
                }
            }
            stringBuilder.append(" ");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
