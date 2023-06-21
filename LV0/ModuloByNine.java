class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += digit - '0';  // char에서 '0'을 빼서 실제 정수 값을 얻습니다.
        }
        return sum % 9;
    }
}
