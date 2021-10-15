import java.util.*;
class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        
        // int len = weights.length;
        
        int[][] rank = new int[weights.length][4];
        for(int i = 0; i < weights.length; i++) {
            //배열에 몸무게 추가 및 나머지 변수 초기화
            int w = weights[i], cnt = 0, win = 0, over = 0;
            for(int j = 0; j < weights.length; j++) {
                char c = head2head[i].charAt(j);
                //경기 횟수 계산
                cnt += c == 'N' ? 0 : 1;
                //승리 횟수 계산
                win += c == 'W' ? 1 : 0;
                //자기 몸무게보다 무거운 사람 승리한 경우 수 계산
                over += c == 'W' && weights[i] < weights[j] ? 1 : 0;
            }
            rank[i][0] = i + 1;
            rank[i][1] = (int)((double)win / cnt * 10000000);
            rank[i][2] = over;
            rank[i][3] = weights[i];
        }
        Arrays.sort(rank, (a, b) -> {
            if(a[1] != b[1]) return b[1] - a[1];
            if(a[2] != b[2]) return b[2] - a[2];
            if(a[3] != b[3]) return b[3] - a[3];
            return a[0] - b[0];
        });
        int[] answer = new int[weights.length];
        for(int i = 0; i < weights.length; i++) answer[i] = (int)rank[i][0];
        return answer;
    }
}
