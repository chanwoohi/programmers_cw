package programmers_introduction;
//머쓱이의 키 재기
public class WhoTall {
	public int solution(int[] array, int height) {
        int count = 0;
        for(int i = 0 ; i < array.length ; i++) {
        	if(array[i] > height) {
        		count++;
        	}
        }
        return count;
    }
}
