import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Long, Integer> cardMap = new HashMap<>();

        int max = 0;
        long x = 0;
        for(int i = 0; i < N; i++) {
            //카드의 숫자
            long card = Long.parseLong(br.readLine());

            //카드의 숫자를 Key로 Value에 해당 카드의 갯수를 저장
            cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);

            //만일 Map의 카드 숫자가 가진 값보다 최댓값이 크면
            if(cardMap.get(card) > max) {
                //최댓값에는 카드 숫자가 가진 값을 넣는다.
                max = cardMap.get(card);
                //해당 카드 숫자도 저장한다.
                x = card;
            //만일 Map의 카드 숫자가 최댓값과 같다면
            } else if (cardMap.get(card) == max) {
                //더 작은 카드 숫자를 저장한다.
                x = Math.min(x, card);
            }
        }

        System.out.println(x);
    }
}
