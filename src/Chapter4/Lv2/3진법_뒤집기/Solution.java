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
        /*
        (1) Integer.parseInt()와 (2) Integer.valueOf()의 차이점
        (1)은 결과값을 기본 자료형인 int로 반환함
        (2)은 문자열의 값을 정수형으로 변환한 뒤 참조 자료형(레퍼런스 타입)인 Integer 객체로 만들어서 반환함

         */
