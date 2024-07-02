package programmers_introduction;
//중복된 숫자 갯수
public class OverlapNumberCount {
	public int solution(int[] array, int n) {
        int count = 0;
        for(int i = 0 ; i < array.length ; i++) {
        	if(array[i] > n) {
        		count++;
        	}
        }
        return count;
    }
}
