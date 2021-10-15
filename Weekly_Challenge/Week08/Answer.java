class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int len = sizes.length;
        int w = 0;
        int h = 0;
        
        //작은 수가 앞에 오도록 정리
        for(int i = 0; i< len; i++){
            if(sizes[i][0] > sizes[i][1]){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
        }
        

       // w(width)와 h(height) 값 구하기
        for(int j = 0; j < len; j++){
            if(sizes[j][0] > w ){
                w = sizes[j][0];
            }
            if(sizes[j][1] > h){
                h = sizes[j][1];
            }
        }
        //결과값 계산
        answer = w * h;
        return answer;
    }
}
