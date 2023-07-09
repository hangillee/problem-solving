package kit.hash;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBookSolution solution = new PhoneBookSolution();
        System.out.println(solution.solution(new String[]{"119", "97674223", "1195524421"}));
    }
}

class PhoneBookSolution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        List<String> phoneList = Arrays.asList(phone_book);
        Collections.sort(phoneList);

        String prefix = "";
        for(int i = 0; i < phoneList.size() - 1; i++) {
            prefix = phoneList.get(i);
            if(phoneList.get(i+1).startsWith(prefix)) {
                return false;
            }
        }
        return answer;
    }
}
