package programmers_introduction;
//점의 위치 구하기
public class DotPosition {
	public int solution(int[] dot) {
        if(dot[0] > 0 ) {
        	if(dot[1] > 0) {
        		return 1;
        	}
        	return 4;
        } else if(dot[0] < 0) {
        	if(dot[1] > 0) {
        		return 2;
        	}
        	return 3;
        }
        return 0;
    }
}
