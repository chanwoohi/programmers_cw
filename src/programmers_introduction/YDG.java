package programmers_introduction;

public class YDG {
	public int solution(int n, int k) {
        int answer = 0;
        int count = 0;
        for( int i = 1 ; i <= n ; i++) {
        	if( i % 10 == 0 ) {
        		count++;
        	}
        }
        answer = (n*12000) + (k-count)*2000;
        return answer;
    }
}
