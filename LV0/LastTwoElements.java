class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        int length = num_list.length;
        if (num_list[length - 1] > num_list[length - 2]) {
            answer = new int[length + 1];
            answer[length] = num_list[length - 1] - num_list[length - 2];
        } else {
            answer = new int[length + 1];
            answer[length] = num_list[length - 1] * 2;
        }
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
