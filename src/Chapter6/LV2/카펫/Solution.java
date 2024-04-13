package Chapter6.LV2.카펫;

public class Solution {
    public int[] solution(int brown, int yellow) {
        // 문제에서 브라운이 8이상 옐로는 1이상이므로 가로세로 3X3 이상이어야 한다는 조건
        for(int width=3;width<=5000;width++){
            for(int height = 3;height<=width;height++){
                int boundary = (width + height -2) * 2;
                int center = width * height - boundary;

                if(brown==boundary && yellow == center){
                    return new int[] {width,height};
                }
            }
        }
        return null;
    }
}
