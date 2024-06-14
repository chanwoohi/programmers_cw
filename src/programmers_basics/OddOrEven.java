package programmers_basics;

public class OddOrEven {
	public int solution(int n) {
		int answer = 0;
		for(int i = 0 ; i <= n ; i++) {
			if(n % 2 == 0 && i %  2 == 0) {
				answer += Math.pow(i, 2);
			}
			else if( n % 2 != 0 && i % 2 != 0) {
				answer += i;
			}
		}
		return answer;
	}
}
