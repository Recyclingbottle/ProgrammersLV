# 프로그래머스 단계별로 풀기

참고 링크 - https://school.programmers.co.kr/learn/challenges?order=recent&levels=0&languages=java

# LV.0

## 문자열 섞기 문제 - 문자열과 관련된 함수의 사용법

### **문제 설명**

길이가 같은 두 문자열 `str1`과 `str2`가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

### 제한사항

- 1 ≤ `str1`의 길이 = `str2`의 길이 ≤ 10
    - `str1`과 `str2`는 알파벳 소문자로 이루어진 문자열입니다.

### 입출력 예

| str1 | str2 | result |
| --- | --- | --- |
| "aaaaa" | "bbbbb" | "ababababab" |

### 소스코드

```markdown
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int s1 = -1;
        int s2 = -1;
        while (s1 != str1.length() - 1 || s2 != str2.length() - 1) {
            if (s1 <= s2) {
                s1++;
                answer += str1.charAt(s1);
            } else {
                s2++;
                answer += str2.charAt(s2);
            }
        }
        return answer;
    }
}
```

### 다른사람 풀이 - StringBuffer 와  append 함수

```markdown
StringBuffer sb = new StringBuffer();
for (int i = 0;i < str1.length();i++)
   sb.append(str1.charAt(i)).append(str2.charAt(i));
return sb.toString();

OR

String answer = "";

        for(int i = 0; i < str1.length(); i++){
            answer+= str1.charAt(i);
            answer+= str2.charAt(i);
        }

        return answer;
    }
```

## 문자 리스트를 문자열로 변환하기

### **문제 설명**

문자들이 담겨있는 배열 `arr`가 주어집니다. `arr`의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

---

### 제한사항

- 1 ≤ `arr`의 길이 ≤ 200
    - `arr`의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.

---

### 입출력 예

| arr | result |
| --- | --- |
| ["a","b","c"] | "abc" |

### 소스코드

```markdown
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
```

## 문자열 곱하기

### **문제 설명**

문자열 `my_string`과 정수 `k`가 주어질 때, `my_string`을 `k`번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

---

### 제한사항

- 1 ≤ `my_string`의 길이 ≤ 100
- `my_string`은 영소문자로만 이루어져 있습니다.
- 1 ≤ `k` ≤ 100

---

### 입출력 예

| my_string | k | result |
| --- | --- | --- |
| "string" | 3 | "stringstringstring" |
| "love" | 10 | "lovelovelovelovelovelovelovelovelovelove" |

### 소스코드

```markdown
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i<k; i++){
            answer += my_string;
        }
        return answer;
    }
}
```

## 더 크게 합치기

### **문제 설명**

연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

- 12 ⊕ 3 = 123
- 3 ⊕ 12 = 312

양의 정수 `a`와 `b`가 주어졌을 때, `a` ⊕ `b`와 `b` ⊕ `a` 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, `a` ⊕ `b`와 `b` ⊕ `a`가 같다면 `a` ⊕ `b`를 return 합니다.

---

### 제한사항

- 1 ≤ `a`, `b` < 10,000

---

### 입출력 예

| a | b | result |
| --- | --- | --- |
| 9 | 91 | 991 |
| 89 | 8 | 898 |

### 소스코드

```markdown
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String can0 = Integer.toString(a) + Integer.toString(b);
        String can1 = Integer.toString(b) + Integer.toString(a);
        int c0 = Integer.parseInt(can0);
        int c1 = Integer.parseInt(can1);
        if(c0 <= c1){
            answer = c1;
        } 
        else{
            answer = c0;
        }
        return answer;
    }
}
```

### 다른 사람 코드

```markdown
class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strSum1 = strA + strB;
        String strSum2 = strB + strA;
        return Math.max(Integer.valueOf(strSum1), Integer.valueOf(strSum2));
    }
}
```

```markdown
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }
}

```

## 두 수의 연산값 비교하기

### **문제 설명**

연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

- 12 ⊕ 3 = 123
- 3 ⊕ 12 = 312

양의 정수 `a`와 `b`가 주어졌을 때, `a` ⊕ `b`와 `2 * a * b` 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

단, `a` ⊕ `b`와 `2 * a * b`가 같으면 `a` ⊕ `b`를 return 합니다.

---

### 제한사항

- 1 ≤ `a`, `b` < 10,000

---

### 입출력 예

| a | b | result |
| --- | --- | --- |
| 2 | 91 | 364 |
| 91 | 2 | 912 |

### 소스코드

```java
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strSum = strA + strB;
        int c0 = Integer.valueOf(strSum);
        int c1 = 2 * a * b;
        if(c0 >= c1){
            answer = c0;
        }
        else{
            answer = c1;
        }
        return answer;
    }
}
```

### 다른 사람 코드

```java
class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a + "" + b);
        if(2 * a * b <= ab) {
            return ab;
        } else {
            return 2 * a * b;
        }
    }
}
```

## n의 배수

### **문제 설명**

정수 `num`과 `n`이 매개 변수로 주어질 때, `num`이 `n`의 배수이면 1을 return `n`의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 2 ≤ `num` ≤ 100
- 2 ≤ `n` ≤ 9

---

### 입출력 예

| num | n | result |
| --- | --- | --- |
| 98 | 2 | 1 |
| 34 | 3 | 0 |

---

### 입출력 예 설명

입출력 예 #1

- 98은 2의 배수이므로 1을 return합니다.

입출력 예 #2

- 32는 3의 배수가 아니므로 0을 return합니다.

### 소스코드

```java
class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){ 
            answer = 1; 
        }
        else answer = 0;
        return answer;
    }
}
```

## 공배수

### **문제 설명**

정수 `number`와 `n`, `m`이 주어집니다. `number`가 `n`의 배수이면서 `m`의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 10 ≤ `number` ≤ 100
- 2 ≤ `n`, `m` < 10

---

### 입출력 예

| number | n | m | result |
| --- | --- | --- | --- |
| 60 | 2 | 3 | 1 |
| 55 | 10 | 5 | 0 |

---

### 입출력 예 설명

입출력 예 #1

- 60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.

입출력 예 #2

- 55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다

### 소스코드

```java
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m == 0 ) answer = 1;
        else answer = 0;
        return answer;
    }
}
```

## 홀짝에 따라 다른 값 반환하기

### **문제 설명**

양의 정수 `n`이 매개변수로 주어질 때, `n`이 홀수라면 `n` 이하의 홀수인 모든 양의 정수의 합을 return 하고 `n`이 짝수라면 `n` 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

---

### 제한사항

- 1 ≤ `n` ≤ 100

---

### 입출력 예

| n | result |
| --- | --- |
| 7 | 16 |
| 10 | 220 |

---

### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `n`은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.

입출력 예 #2

- 예제 2번의 `n`은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 2 + 4 + 6 + 8 + 10 = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.

### 소스코드

```java
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n  % 2 == 0){
            for(int i = 2; i <= n; i=i+2){
                answer = answer + i*i;
            }
        }
        else{
            for(int i = 1; i <= n ; i= i+2){
                answer += i;
            }
        }
        return answer;
    }
}
```

## 코드 처리하기

### **문제 설명**

문자열 `code`가 주어집니다.

`code`를 앞에서부터 읽으면서 만약 문자가 "1"이면 `mode`를 바꿉니다. `mode`에 따라 `code`를 읽어가면서 문자열 `ret`을 만들어냅니다.

`mode`는 0과 1이 있으며, `idx`를 0 부터 `code의 길이 - 1` 까지 1씩 키워나가면서 `code[idx]`의 값에 따라 다음과 같이 행동합니다.

- `mode`가 0일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 짝수일 때만 `ret`의 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 0에서 1로 바꿉니다.
- `mode`가 1일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 홀수일 때만 `ret`의 맨 뒤에 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 1에서 0으로 바꿉니다.

문자열 `code`를 통해 만들어진 문자열 `ret`를 return 하는 solution 함수를 완성해 주세요.

단, 시작할 때 `mode`는 0이며, return 하려는 `ret`가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.

---

### 제한사항

- 1 ≤ `code`의 길이 ≤ 100,000
    - `code`는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.

---

### 입출력 예

| code | result |
| --- | --- |
| "abc1abc1abc" | "acbac" |

---

### 입출력 예 설명

입출력 예 #1

- `code`의 각 인덱스 `i`에 따라 다음과 같이 `mode`와 `ret`가 변합니다.

| i | code[i] | mode | ret |
| --- | --- | --- | --- |
| 0 | "a" | 0 | "a" |
| 1 | "b" | 0 | "a" |
| 2 | "c" | 0 | "ac" |
| 3 | "1" | 1 | "ac" |
| 4 | "a" | 1 | "ac" |
| 5 | "b" | 1 | "acb" |
| 6 | "c" | 1 | "acb" |
| 7 | "1" | 0 | "acb" |
| 8 | "a" | 0 | "acba" |
| 9 | "b" | 0 | "acba" |
| 10 | "c" | 0 | "acbac" |

따라서 "acbac"를 return 합니다.

### 소스코드

```jsx
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
```

## 등차수열의 특정한 항만 더하기

### **문제 설명**

두 정수 `a`, `d`와 길이가 n인 boolean 배열 `included`가 주어집니다. 첫째항이 `a`, 공차가 `d`인 등차수열에서 `included[i]`가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 `included`가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

---

### 제한사항

- 1 ≤ `a` ≤ 100
- 1 ≤ `d` ≤ 100
- 1 ≤ `included`의 길이 ≤ 100
- `included`에는 true가 적어도 하나 존재합니다.

---

### 입출력 예

| a | d | included | result |
| --- | --- | --- | --- |
| 3 | 4 | [true, false, false, true, true] | 37 |
| 7 | 1 | [false, false, false, true, false, false, false] | 10 |

---

### 입출력 예 설명

입출력 예 #1

- 예제 1번은 `a`와 `d`가 각각 3, 4이고 `included`의 길이가 5입니다. 이를 표로 나타내면 다음과 같습니다.
    
    
    |  | 1항 | 2항 | 3항 | 4항 | 5항 |
    | --- | --- | --- | --- | --- | --- |
    | 등차수열 | 3 | 7 | 11 | 15 | 19 |
    | included | true | false | false | true | true |
    
    따라서 true에 해당하는 1항, 4항, 5항을 더한 3 + 15 + 19 = 37을 return 합니다.
    

입출력 예 #2

- 예제 2번은 `a`와 `d`가 각각 7, 1이고 `included`의 길이가 7입니다. 이를 표로 나타내면 다음과 같습니다.
    
    
    |  | 1항 | 2항 | 3항 | 4항 | 5항 | 6항 | 7항 |
    | --- | --- | --- | --- | --- | --- | --- | --- |
    | 등차수열 | 7 | 8 | 9 | 10 | 11 | 12 | 13 |
    | included | false | false | false | true | false | false | false |
    
    따라서 4항만 true이므로 10을 return 합니다.
    
    ### 소스코드
    
    ```jsx
    class Solution {
        public int solution(int a, int d, boolean[] included) {
            int answer = 0;
            for(int i = 0; i < included.length; i++){
                if(included[i]){
                    answer += a + (i*d);
                }
            }
            return answer;
        }
    }
    ```
    

## 주사위 게임 2

### **문제 설명**

1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 `a`, `b`, `c`라고 했을 때 얻는 점수는 다음과 같습니다.

- 세 숫자가 모두 다르다면 `a` + `b` + `c` 점을 얻습니다.
- 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (`a` + `b` + `c`) × (`a` + `b` + `c` )점을 얻습니다.
    
    2
    
    2
    
    2
    
- 세 숫자가 모두 같다면 (`a` + `b` + `c`) × (`a` + `b` + `c` ) × (`a` + `b` + `c` )점을 얻습니다.
    
    2
    
    2
    
    2
    
    3
    
    3
    
    3
    

세 정수 `a`, `b`, `c`가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

---

### 제한사항

- `a`, `b`, `c`는 1이상 6이하의 정수입니다.

---

### 입출력 예

| a | b | c | result |
| --- | --- | --- | --- |
| 2 | 6 | 1 | 9 |
| 5 | 3 | 3 | 473 |
| 4 | 4 | 4 | 110592 |

---

### 입출력 예 설명

입출력 예 #1

- 예제 1번에서 세 주사위 숫자가 모두 다르므로 2 + 6 + 1 = 9점을 얻습니다. 따라서 9를 return 합니다.

입출력 예 #2

- 예제 2번에서 두 주사위 숫자만 같으므로 (5 + 3 + 3) × (5 + 3 + 3 ) = 11 × 43 = 473점을 얻습니다. 따라서 473을 return 합니다.
    
    2
    
    2
    
    2
    

입출력 예 #3

- 예제 3번에서 세 주사위 숫자가 모두 같으므로 (4 + 4 + 4) × (4 + 4 + 4 ) × (4 + 4 + 4 ) = 12 × 48 × 192 = 110,592점을 얻습니다. 따라서 110592를 return 합니다.

### 소스코드

```jsx
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && c != a) {
            answer = a + b + c;
        } else if (a == b && b == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer= (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }
}
```

## 원소들의 곱과 합

### **문제 설명**

정수가 담긴 리스트 `num_list`가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 2 ≤ `num_list`의 길이 ≤ 10
- 1 ≤ `num_list`의 원소 ≤ 9

---

### 입출력 예

| num_list | result |
| --- | --- |
| [3, 4, 5, 2, 1] | 1 |
| [5, 7, 8, 3] | 0 |

---

### 입출력 예 설명

입출력 예 #1

- 모든 원소의 곱은 120, 합의 제곱은 225이므로 1을 return합니다.

입출력 예 #2

- 모든 원소의 곱은 840, 합의 제곱은 529이므로 0을 return합니다

### 소스코드

```jsx
class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];;
        }
        if (mul < sum * sum) {
            return 1;
        } else {
            return 0;
        }
    }
}
```

## 이어 붙인 수

### **문제 설명**

정수가 담긴 리스트 `num_list`가 주어집니다. `num_list`의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 2 ≤ `num_list`의 길이 ≤ 10
- 1 ≤ `num_list`의 원소 ≤ 9
- `num_list`에는 적어도 한 개씩의 짝수와 홀수가 있습니다.

---

### 입출력 예

| num_list | result |
| --- | --- |
| [3, 4, 5, 2, 1] | 393 |
| [5, 7, 8, 3] | 581 |

---

### 입출력 예 설명

입출력 예 #1

- 홀수만 이어 붙인 수는 351이고 짝수만 이어 붙인 수는 42입니다. 두 수의 합은 393입니다.

입출력 예 #2

- 홀수만 이어 붙인 수는 573이고 짝수만 이어 붙인 수는 8입니다. 두 수의 합은 581입니다.

### 소스코드

```jsx
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                // 짝수
                even += String.valueOf(num_list[i]);
            } else {
                odd = String.valueOf(num_list[i]);
            }
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}

class Solution2 {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                // 짝수
                even += String.valueOf(num_list[i]);
            } else {
                odd = String.valueOf(num_list[i]);
            }
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}
```

## 마지막 두 원소

### **문제 설명**

정수 리스트 `num_list`가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 2 ≤ `num_list`의 길이 ≤ 10
- 1 ≤ `num_list`의 원소 ≤ 9

---

### 입출력 예

| num_list | result |
| --- | --- |
| [2, 1, 6] | [2, 1, 6, 5] |
| [5, 2, 1, 7, 5] | [5, 2, 1, 7, 5, 10] |

---

### 입출력 예 설명

입출력 예 #1

- 마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.

입출력 예 #2

- 마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.

### 소스코드

```jsx
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
```

## 수 조작하기1

### **문제 설명**

정수 `n`과 문자열 `control`이 주어집니다. `control`은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, `control`의 앞에서부터 순서대로 문자에 따라 `n`의 값을 바꿉니다.

- "w" : `n`이 1 커집니다.
- "s" : `n`이 1 작아집니다.
- "d" : `n`이 10 커집니다.
- "a" : `n`이 10 작아집니다.

위 규칙에 따라 `n`을 바꿨을 때 가장 마지막에 나오는 `n`의 값을 return 하는 solution 함수를 완성해 주세요.

---

### 제한사항

- 100,000 ≤ `n` ≤ 100,000
- 1 ≤ `control`의 길이 ≤ 100,000
    - `control`은 알파벳 소문자 "w", "a", "s", "d"로 이루어진 문자열입니다.

---

### 입출력 예

| n | control | result |
| --- | --- | --- |
| 0 | "wsdawsdassw" | -1 |

---

### 입출력 예 설명

입출력 예 #1

- 수 `n`은 `control`에 따라 다음과 같은 순서로 변하게 됩니다.
- 0 → 1 → 0 → 10 → 0 → 1 → 0 → 10 → 0 → -1 → -2 → -1
- 따라서 -1을 return 합니다.

### 소스코드

```jsx
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++)
        {
            char c = control.charAt(i);
            if (c == 'w') {
                n += 1;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }
        return n;
    }
}
```

## 수 조작하기 2

### **문제 설명**

정수 배열 `numLog`가 주어집니다. 처음에 `numLog[0]`에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.

- "w" : 수에 1을 더한다.
- "s" : 수에 1을 뺀다.
- "d" : 수에 10을 더한다.
- "a" : 수에 10을 뺀다.

그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 `numLog`입니다. 즉, `numLog[i]`는 `numLog[0]`로부터 총 `i`번의 조작을 가한 결과가 저장되어 있습니다.

주어진 정수 배열 `numLog`에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.

---

### 제한사항

- 2 ≤ `log`의 길이 ≤ 100,000
    - 100,000 ≤ `log[0]` ≤ 100,000
    - 1 ≤ `i` ≤ `log`의 길이인 모든 `i`에 대해 `|log[i] - log[i - 1]|`의 값은 1 또는 10입니다.

---

### 입출력 예

| log | result |
| --- | --- |
| [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1] | "wsdawsdassw" |

---

### 입출력 예 설명

입출력 예 #1

- result인 "wsdawsdassw"를 따라 `log[0]`에서부터 시작해 조작을 하면 `log`의 값과 순서대로 일치합니다. 따라서 "wsdawsdassw"를 return 합니다.

---

### Hint

"수 조작하기 1" 문제의 `n`값이 `log[0]`에 해당하며, 이 문제에서 주어진 `log`에 따라 "수 조작하기 1" 문제의 `control`을 구하는 문제라고 이해할 수 있습니다.

입출력 예 #1은 "수 조작하기 1" 문제의 입출력 예 #1과 같은 예시이므로 참고하시기 바랍니다

### 소스코드

```jsx
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
```

## 수열과 구간 쿼리 3

### **문제 설명**

정수 배열 `arr`와 2차원 정수 배열 `queries`이 주어집니다. `queries`의 원소는 각각 하나의 `query`를 나타내며, `[i, j]` 꼴입니다.

각 `query`마다 순서대로 `arr[i]`의 값과 `arr[j]`의 값을 서로 바꿉니다.

위 규칙에 따라 `queries`를 처리한 이후의 `arr`를 return 하는 solution 함수를 완성해 주세요.

---

### 제한사항

- 1 ≤ `arr`의 길이 ≤ 1,000
    - 0 ≤ `arr`의 원소 ≤ 1,000,000
- 1 ≤ `queries`의 길이 ≤ 1,000
    - 0 ≤ `i` < `j` < `arr`의 길이

---

### 입출력 예

| arr | queries | result |
| --- | --- | --- |
| [0, 1, 2, 3, 4] | [[0, 3],[1, 2],[1, 4]] | [3, 4, 1, 0, 2] |

---

### 입출력 예 설명

입출력 예 #1

- 각 쿼리에 따라 `arr`가 다음과 같이 변합니다.

arr

---

[0, 1, 2, 3, 4]

---

[3, 1, 2, 0, 4]

---

[3, 2, 1, 0, 4]

---

[3, 4, 1, 0, 2]

---

- 따라서 [3, 4, 1, 0, 2]를 return 합니다.

### 소스코드

```jsx
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length ; i++){
            int j = queries[i][0];
            int k = queries[i][1];
            int tmp = arr[j];
            arr[j] = arr[k];
            arr[k] = tmp;
        }
        return arr;
    }
}
```

## 수열과 구간 쿼리 2

### **문제 설명**

정수 배열 `arr`와 2차원 정수 배열 `queries`이 주어집니다. `queries`의 원소는 각각 하나의 `query`를 나타내며, `[s, e, k]` 꼴입니다.

각 `query`마다 순서대로 `s` ≤ `i` ≤ `e`인 모든 `i`에 대해 `k`보다 크면서 가장 작은 `arr[i]`를 찾습니다.

각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.

단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

---

### 제한사항

- 1 ≤ `arr`의 길이 ≤ 1,000
    - 0 ≤ `arr`의 원소 ≤ 1,000,000
- 1 ≤ `queries`의 길이 ≤ 1,000
    - 0 ≤ `s` ≤ `e` < `arr`의 길이
    - 0 ≤ `k` ≤ 1,000,000

---

### 입출력 예

| arr | queries | result |
| --- | --- | --- |
| [0, 1, 2, 4, 3] | [[0, 4, 2],[0, 3, 2],[0, 2, 2]] | [3, 4, -1] |

---

### 입출력 예 설명

입출력 예 #1

- 첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
- 두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
- 세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
- 따라서 [3, 4, -1]을 return 합니다.

### 소스코드

```jsx
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;

            for (int j = start; j <= end; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                }
            }

            if (min == Integer.MAX_VALUE) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }

        return answer;
    }
}
```

## 카운트 업

### **문제 설명**

정수 `start`와 `end`가 주어질 때, `start`부터 `end`까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 0 ≤ `start` ≤ `end` ≤ 50

---

### 입출력 예

| start | end | result |
| --- | --- | --- |
| 3 | 10 | [3, 4, 5, 6, 7, 8, 9, 10] |

---

### 입출력 예 설명

입출력 예 #1

- 3부터 10까지의 숫자들을 담은 리스트 [3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.

### 소스코드

```jsx
class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}
```

## 수열과 구간 쿼리 4

### **문제 설명**

정수 배열 `arr`와 2차원 정수 배열 `queries`이 주어집니다. `queries`의 원소는 각각 하나의 `query`를 나타내며, `[s, e, k]` 꼴입니다.

각 `query`마다 순서대로 `s` ≤ `i` ≤ `e`인 모든 `i`에 대해 `i`가 `k`의 배수이면 `arr[i]`에 1을 더합니다.

위 규칙에 따라 `queries`를 처리한 이후의 `arr`를 return 하는 solution 함수를 완성해 주세요.

### 제한사항

- 1 ≤ `arr`의 길이 ≤ 1,000
    - 0 ≤ `arr`의 원소 ≤ 1,000,000
- 1 ≤ `queries`의 길이 ≤ 1,000
    - 0 ≤ `s` ≤ `e` < `arr`의 길이
    - 0 ≤ `k` ≤ 5

---

### 입출력 예

| arr | queries | result |
| --- | --- | --- |
| [0, 1, 2, 4, 3] | [[0, 4, 1],[0, 3, 2],[0, 3, 3]] | [3, 2, 4, 6, 4] |

---

### 입출력 예 설명

입출력 예 #1

- 각 쿼리에 따라 `arr`가 다음과 같이 변합니다.

arr = 

[0, 1, 2, 4, 3]

[1, 2, 3, 5, 4]

[2, 2, 4, 5, 4]

[3, 2, 4, 6, 4]

- 따라서 [3, 2, 4, 6, 4]를 return 합니다.

```java
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i]++;
                }
            }
        }
        
        return arr;
    }
}
```

## 배열 만들기 2

### **문제 설명**

정수 `l`과 `r`이 주어졌을 때, `l` 이상 `r`이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

---

### 제한사항

- 1 ≤ `l` ≤ `r` ≤ 1,000,000

---

### 입출력 예

| l | r | result |
| --- | --- | --- |
| 5 | 555 | [5, 50, 55, 500, 505, 550, 555] |
| 10 | 20 | [-1] |

---

### 입출력 예 설명

입출력 예 #1

- 5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.

입출력 예 #2

- 10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.

```java
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
```

## 콜라츠 수열 만들기

### **문제 설명**

모든 자연수 `x`에 대해서 현재 값이 `x`이면 `x`가 짝수일 때는 2로 나누고, `x`가 홀수일 때는 `3 * x + 1`로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 `x`가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.

그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.

계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.

임의의 1,000 보다 작거나 같은 양의 정수 `n`이 주어질 때 초기값이 `n`인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.

---

### 제한사항

- 1 ≤ `n` ≤ 1,000

---

### 입출력 예

| n | result |
| --- | --- |
| 10 | [10, 5, 16, 8, 4, 2, 1] |

---

### 입출력 예 설명

입출력 예 #1

- 순서대로 연산한 결과를 표로 만들면 다음과 같습니다.

| 연산 횟수 | x | 홀짝 여부 |
| --- | --- | --- |
| 0 | 10 | 짝수 |
| 1 | 5 | 홀수 |
| 2 | 16 | 짝수 |
| 3 | 8 | 짝수 |
| 4 | 4 | 짝수 |
| 5 | 2 | 짝수 |
| 6 | 1 | 홀수 |
- 따라서 [10, 5, 16, 8, 4, 2, 1]을 return 합니다.

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            sequence.add(n);
        }

        int[] answer = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            answer[i] = sequence.get(i);
        }

        return answer;
    }
}
```

## 배열 만들기 4

### **문제 설명**

정수 배열 `arr`가 주어집니다. `arr`를 이용해 새로운 배열 `stk`를 만드려고 합니다.

변수 `i`를 만들어 초기값을 0으로 설정한 후 `i`가 `arr`의 길이보다 작으면 다음 작업을 반복합니다.

- 만약 `stk`가 빈 배열이라면 `arr[i]`를 `stk`에 추가하고 `i`에 1을 더합니다.
- `stk`에 원소가 있고, `stk`의 마지막 원소가 `arr[i]`보다 작으면 `arr[i]`를 `stk`의 뒤에 추가하고 `i`에 1을 더합니다.
- `stk`에 원소가 있는데 `stk`의 마지막 원소가 `arr[i]`보다 크거나 같으면 `stk`의 마지막 원소를 `stk`에서 제거합니다.

위 작업을 마친 후 만들어진 `stk`를 return 하는 solution 함수를 완성해 주세요.

---

### 제한사항

- 1 ≤ `arr`의 길이 ≤ 100,000
    - 1 ≤ `arr`의 원소 ≤ 100,000

---

### 입출력 예

| arr | result |
| --- | --- |
| [1, 4, 2, 5, 3] | [1, 2, 3] |

---

### 입출력 예 설명

입출력 예 #1

- 각 작업을 마친 후에 배열의 변화를 나타내면 다음 표와 같습니다.

| i | arr[i] | stk |
| --- | --- | --- |
| 0 | 1 | [] |
| 1 | 4 | [1] |
| 2 | 2 | [1, 4] |
| 2 | 2 | [1] |
| 3 | 5 | [1, 2] |
| 4 | 3 | [1, 2, 5] |
| 4 | 3 | [1, 2] |
| - | - | [1, 2, 3] |
- 따라서 [1, 2, 3]을 return 합니다.

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }

        return answer;
    }
}
```

## 간단한 논리 연산

### **문제 설명**

boolean 변수 `x1`, `x2`, `x3`, `x4`가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.

- (`x1` ∨ `x2`) ∧ (`x3` ∨ `x4`)

---

### 입출력 예

| x1 | x2 | x3 | x4 | result |
| --- | --- | --- | --- | --- |
| false | true | true | true | true |
| true | false | false | false | false |

---

### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `x1`, `x2`, `x3`, `x4`로 식을 계산하면 다음과 같습니다.
    
    (`x1` ∨ `x2`) ∧ (`x3` ∨ `x4`) ≡ (F ∨ T) ∧ (T ∨ T) ≡ T ∧ T ≡ T
    
    따라서 true를 return 합니다.
    

입출력 예 #2

- 예제 2번의 `x1`, `x2`, `x3`, `x4`로 식을 계산하면 다음과 같습니다.
    
    (`x1` ∨ `x2`) ∧ (`x3` ∨ `x4`) ≡ (T ∨ F) ∧ (F ∨ F) ≡ T ∧ F ≡ F
    
    따라서 false를 return 합니다.
    

---

- ∨과 ∧의 진리표는 다음과 같습니다.
    
    
    | x | y | x ∨ y | x ∧ y |
    | --- | --- | --- | --- |
    | T | T | T | T |
    | T | F | T | F |
    | F | T | T | F |
    | F | F | F | F |
    
    ```java
    class Solution {
        public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
            boolean result = (x1 || x2) && (x3 || x4);
            return result;
        }
    }
    ```
    

## 주사위 게임 3

### **문제 설명**

1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

- 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
- 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q) 점을 얻습니다.
    
    2
    
- 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
- 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
- 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.

네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 `a`, `b`, `c`, `d`로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

---

### 제한사항

- `a`, `b`, `c`, `d`는 1 이상 6 이하의 정수입니다.

---

### 입출력 예

| a | b | c | d | result |
| --- | --- | --- | --- | --- |
| 2 | 2 | 2 | 2 | 2222 |
| 4 | 1 | 4 | 4 | 1681 |
| 6 | 3 | 3 | 6 | 27 |
| 2 | 5 | 2 | 6 | 30 |
| 6 | 4 | 2 | 5 | 2 |

---

### 입출력 예 설명

입출력 예 #1

- 예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.

입출력 예 #2

- 예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1) = 41 = 1681점을 얻습니다. 따라서 1681을 return 합니다.
    
    2
    
    2
    

입출력 예 #3

- 예제 3번에서 `a`, `d`는 6으로, `b`, `c`는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.

입출력 예 #4

- 예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.

입출력 예 #5

- 예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.

```java
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
```

## 글자 이어 붙여 문자열 만들기

### **문제 설명**

문자열 `my_string`과 정수 배열 `index_list`가 매개변수로 주어집니다. `my_string`의 `index_list`의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

---

### 제한사항

- 1 ≤ `my_string`의 길이 ≤ 1,000
- `my_string`의 원소는 영소문자로 이루어져 있습니다.
- 1 ≤ `index_list`의 길이 ≤ 1,000
- 0 ≤ `index_list`의 원소 < `my_string`의 길이

---

### 입출력 예

| my_string | index_list | result |
| --- | --- | --- |
| "cvsgiorszzzmrpaqpe" | [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7] | "programmers" |
| "zpiaz" | [1, 2, 0, 0, 3] | "pizza" |

---

### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `my_string`에서 인덱스 3, 5, 6, 11, 12, 14, 16, 17에 해당하는 글자는 각각 g, o, r, m, r, a, p, e이므로 `my_string`에서 `index_list`에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, r, o, g, r, a, m, m, e, r, s입니다. 따라서 "programmers"를 return 합니다.

입출력 예 #2

- 예제 2번의 `my_string`에서 인덱스 0, 1, 2, 3에 해당하는 글자는 각각 z, p, i, a이므로 `my_string`에서 `index_list`에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, i, z, z, a입니다. 따라서 "pizza"를 return 합니다.

```java
class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int index : index_list) {
            answer.append(my_string.charAt(index));
        }
        return answer.toString();
    }
}
```

## 9로 나눈 나머지

### **문제 설명**

음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.

이 사실을 이용하여 음이 아닌 정수가 **문자열** `number`로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.

---

### 제한사항

- 1 ≤ `number`의 길이 ≤ 100,000
- `number`의 원소는 숫자로만 이루어져 있습니다.
- `number`는 정수 0이 아니라면 숫자 '0'으로 시작하지 않습니다.

---

### 입출력 예

| number | result |
| --- | --- |
| "123" | 6 |
| "78720646226947352489" | 2 |

---

### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `number`는 123으로 각 자리 숫자의 합은 6입니다. 6을 9로 나눈 나머지는 6이고, 실제로 123 = 9 × 13 + 6입니다. 따라서 6을 return 합니다.

입출력 예 #2

- 예제 2번의 `number`는 78720646226947352489으로 각자리 숫자의 합은 101입니다. 101을 9로 나눈 나머지는 2이고, 실제로 78720646226947352489 = 9 × 8746738469660816943 + 2입니다. 따라서 2를 return 합니다.

```java
class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += digit - '0';  // char에서 '0'을 빼서 실제 정수 값을 얻습니다.
        }
        return sum % 9;
    }
}
```

## 문자열 여러 번 뒤집기

### **문제 설명**

문자열 `my_string`과 이차원 정수 배열 `queries`가 매개변수로 주어집니다. `queries`의 원소는 [s, e] 형태로, `my_string`의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. `my_string`에 `queries`의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.

---

### 제한사항

- `my_string`은 영소문자로만 이루어져 있습니다.
- 1 ≤ `my_string`의 길이 ≤ 1,000
- `queries`의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < `my_string`의 길이를 만족합니다.
- 1 ≤ `queries`의 길이 ≤ 1,000

---

### 입출력 예

| my_string | queries | result |
| --- | --- | --- |
| "rermgorpsam" | [[2, 3], [0, 7], [5, 9], [6, 10]] | "programmers" |

---

### 입출력 예 설명

- 예제 1번의 `my_string`은 "rermgorpsam"이고 주어진 `queries`를 순서대로 처리하면 다음과 같습니다.
    
    
    | queries | my_string |
    | --- | --- |
    |  | "rermgorpsam" |
    | [2, 3] | "remrgorpsam" |
    | [0, 7] | "progrmersam" |
    | [5, 9] | "prograsremm" |
    | [6, 10] | "programmers" |
    
    따라서 "programmers"를 return 합니다.
    
    ```java
    class Solution {
        public String solution(String my_string, int[][] queries) {
            StringBuilder sb = new StringBuilder(my_string);
            for (int[] query : queries) {
                int start = query[0];
                int end = query[1];
                reverseString(sb, start, end);
            }
            return sb.toString();
        }
        
        private void reverseString(StringBuilder sb, int start, int end) {
            while (start < end) {
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                start++;
                end--;
            }
        }
    }
    ```
