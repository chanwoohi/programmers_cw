package programmers_introduction;

public class Pizza01 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 2 ; i <= n ; i++) {
        	if( (i-1) % 7 == 0) {
        		answer++;
        	}
        }
        return answer + 1;
    }
}
