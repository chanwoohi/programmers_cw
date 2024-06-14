package programmers_introduction;

public class Pizza02 {
	public int solution(int n) {
        int answer = 0;
        int a = 0;
        for( int i = 1 ; i <= n && i <= 6 ; i++) {
        	if(n % i == 0 && 6 % i == 0) {
        		a = i;
        	}
        }
        int b = (n * 6)/a;
        
        answer = b / 6;
        return answer;
    }
}
