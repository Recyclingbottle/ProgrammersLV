## 프로그래머스 단계별로 풀어보기

참고 링크 - [https://school.programmers.co.kr/learn/challenges?order=recent&levels=0&languages=java](https://school.programmers.co.kr/learn/challenges?order=recent&levels=0&languages=java)

# LV.0

## 문자열 섞기 문제 - 문자열과 관련된 함수의 사용법

### **문제 설명**

길이가 같은 두 문자열 `str1`과 `str2`가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

### 제한사항

- 1 ≤ `str1`의 길이 = `str2`의 길이 ≤ 10
    - `str1`과 `str2`는 알파벳 소문자로 이루어진 문자열입니다.

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

