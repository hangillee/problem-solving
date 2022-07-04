import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] cards = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards); //이분 탐색을 위한 정렬

        int M = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Integer[] cardIdx = Arrays.copyOf(nums, M); //원본 배열 복사

        int start; //시작 인덱스
        int end; //종료 인덱스
        int mid; //중앙 인덱스
        int target = 0; //찾으려는 수
        boolean isCard = false;
        int[] haveCard = new int[M];

        for(int i = 0; i < M; i++) {
            start = 0; //상근이가 가지고 있는 카드의 첫 번재 인덱스
            end = N-1; //상근이가 가지고 있는 카드의 마지막 인덱스
            target = nums[i]; //정수 목록 중 하나 선택
            while(start <= end) { //시작 인덱스가 종료 인덱스와 같거나 작을 동안만
                mid = (start + end) / 2; //중앙 인덱스
                if(target < cards[mid]) { //만일 선택한 정수가 카드 목록의 중앙 인덱스보다 작으면
                    end = mid - 1; //종료 인덱스를 중앙 값보다 앞으로 당김
                } else { //만일 선택한 카드가 정렬된 정수 목록의 중앙 인덱스보다 크거나 같을 경우
                    if(target == cards[mid]) {
                        haveCard[i] = 1; //찾았으니 정수 목록과 카드 목록에 일치하는 값 있음
                        break;
                    }
                    start = mid + 1; //시작점을 중앙값보다 앞당김
                }
            }
            bw.write(haveCard[i] + " ");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
