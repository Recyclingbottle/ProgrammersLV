class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) == '1')
                    mode = 1;
                else {
                    if (i % 2 == 0)
                        answer += code.charAt(i);
                }
            } else {
                if (code.charAt(i) == '1') {
                    mode = 0;
                } else {
                    if (i % 2 == 1)
                        answer += code.charAt(i);
                }
            }
        }
        return answer;
    }
}

class Solution2 { //gpt 가 생성한 답 차이가 뭐지 차이가 없는데 얘는 정답이네 흠
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) == '1')
                    mode = 1;
                else {
                    if (i % 2 == 0)
                        ret += code.charAt(i);
                }
            } else {
                if (code.charAt(i) == '1') {
                    mode = 0;
                } else {
                    if (i % 2 == 1)
                        ret += code.charAt(i);
                }
            }
        }
        return ret;
    }
}
