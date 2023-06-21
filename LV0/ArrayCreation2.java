import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (containsOnlyZeroAndFive(i)) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[] {-1};
        }

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }

    private boolean containsOnlyZeroAndFive(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}