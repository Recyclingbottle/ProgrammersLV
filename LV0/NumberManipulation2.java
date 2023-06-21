class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0 ; i < numLog.length - 1 ; i++){
            int a = numLog[i];
            int b = numLog[i+1];
            if(b - a == 1)
            {
                answer += "w";
            }
            else if(b-a == -1){
                answer += "s";
            }
            else if(b-a == 10){
                answer += "d";
            }
            else if(b-a == -10){
                answer += "a";
            }
        }
        return answer;
    }
}