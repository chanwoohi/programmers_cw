package programmers_introduction;

public class SearchWhoBigger {
	public int[] solution(int[] array) {
		int[] answer = new int[2];
		int check = 0;
		int count = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i]>=check) {
				check = array[i];
				count = i;
			}
		}
		answer = new int [] {check,count};
		return answer;
	}
}
