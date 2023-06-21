import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 빈도수를 저장하는 맵
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> nums = Arrays.asList(a, b, c, d);

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        if (freq.size() == 1) {  // 네 주사위에서 나온 숫자가 모두 같은 경우
            int p = a;
            return 1111 * p;
        } else if (freq.size() == 2) {  // 두 개의 숫자만 나온 경우
            List<Integer> keys = new ArrayList<>(freq.keySet());
            int p = keys.get(0);
            int q = keys.get(1);
            if (freq.get(p) == 3 || freq.get(q) == 3) {  // 세 주사위에서 나온 숫자가 같은 경우
                if (freq.get(p) == 1) {
                    int temp = p;
                    p = q;
                    q = temp;
                }
                return (10 * p + q) * (10 * p + q);
            } else {  // 주사위가 두 개씩 같은 값이 나온 경우
                return (p + q) * Math.abs(p - q);
            }
        } else if (freq.size() == 3) {  // 세 개의 숫자가 나온 경우
            int p = 0;
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() == 2) {
                    p = entry.getKey();
                    break;
                }
            }
            int q = 0, r = 0;
            for (int key : freq.keySet()) {
                if (key != p) {
                    if (q == 0)
                        q = key;
                    else
                        r = key;
                }
            }
            return q * r;
        } else {  // 네 주사위에 적힌 숫자가 모두 다른 경우
            return Collections.min(nums);
        }
    }
}
