package Chapter4.Lv2;

import java.util.ArrayList;
import java.util.List;
class Solution {
    public double solution(int n) {
        /*
        문제 풀이 흐름
        1. 정수를 3진법으로 변환
        2. 변환된 문자열 뒤집기
        3. 뒤집은 문자열을 정수로 변환
         */
        String str = Integer.toString(n,3);

        String reversed = new StringBuilder(str).reverse().toString();
        // String reversed = new StringBuilder().append(str).reverse().toString(); 과 같은 코드

        return Integer.valueOf(reversed,3);
    }
}
