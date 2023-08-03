package kit.string;

public class HidePhoneNumber {
    public static void main(String[] args) {
        HidePhoneNumberSolution solution = new HidePhoneNumberSolution();
        System.out.println(solution.solution("01033334444"));
    }
}

class HidePhoneNumberSolution {
    public String solution(String phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < phoneNumber.length() - 4; i++) {
            stringBuilder.append("*");
        }
        stringBuilder.append(phoneNumber.substring(phoneNumber.length() - 4));
        return stringBuilder.toString();
    }
}