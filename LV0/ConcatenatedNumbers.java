class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                // 짝수
                evenSum = evenSum * 10 + num_list[i];
            } else {
                // 홀수
                oddSum = oddSum * 10 + num_list[i];
            }
        }
        
        return oddSum + evenSum;
    }
}
