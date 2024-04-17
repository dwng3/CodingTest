package Chapter6.LV2.소수찾기;

import java.util.*;
public class Solution {
    public int solution(String numbers) {
        // 재귀 정의
        // 1. 상태
        // 2. 종료 조건
        // 3. 점화식
        int answer = 0;
        return answer;
    }

    private Set<Integer> getPrimes(int acc, List<Integer> numbers){
        // 종료조건
        if(numbers.isEmpty()){
            if(isPrime(acc)) return Set.of(acc);
            return Set.of();
        }

        Set<Integer> primes = new HashSet<>();
        if(isPrime(acc)) primes.add(acc);
        return primes;
    }

    // 소수 판별 메서드
    private boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i= 2;i*i <= n;i++){
            if(n%i == 0 ) return false;
        }
        return true;
    }
}