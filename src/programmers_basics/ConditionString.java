package programmers_basics;

public class ConditionString {
	public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		if ( ineq == "<" ){
			if(eq == "=") {
				if(n <= m) return 1; 
				return 0;
			}
			else {
				if(n < m) return 1; 
				return 0;
			}
		}
		if(eq == "=") {
			if(n >= m) return 1; 
			return 0;
		}
		else {
			if(n > m) return 1; 
			return 0;
		}
	}
}
