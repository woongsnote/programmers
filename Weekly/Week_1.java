class Solution {
    public long solution(int price, int money, int count) {
    	//초기화
        long answer = 0;
        long payment = 0;
        
        //지불 금액 계산
        for(int i=1;i<=count;i++){
            payment += (price*i);
        }
        //지불 금액(payment)과 소지 금액(money) 비교
        answer = (money > payment)? 0 : payment - money;
        //결과값 리턴
        return answer;
    }
}
