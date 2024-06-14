package programmers_introduction;

public class Pizza03 {
	public int solution(int slice, int n) {
		int answer = 1;
		for(;;){
			if(slice < n) {
				slice += slice;
				answer++;
			}
			else if( slice >= n) {
				break;
			}
		}
		return answer;
	}
}
