package Chapter7.Lv2.문자열_내_마음대로_정렬하기;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 처음 작성했던 코드
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
