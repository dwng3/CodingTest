package Chapter7.Lv2.문자열_내_마음대로_정렬하기;

import java.util.Arrays;

class Solution2 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) != s2.charAt(n)){
                return s1.charAt(n) - s2.charAt(n);
            }
            return s1.compareTo(s2);
        });
        return strings;
    }
}