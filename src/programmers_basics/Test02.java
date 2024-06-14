package programmers_basics;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		String ineq = "<", eq = "=";
		int n = 20, m = 50;
		int answer = 0;
		if ( ineq == "<" ){
			if(eq == "=") {
				if(n <= m) {
					answer = 1; 
				}
				else {
					answer = 0;
				}
			}
			else {
				if(n < m) {
					answer = 1; 
				}
				else {
					answer = 0;
				}
			}
		}
		else {
			if(eq == "=") {
			}
			if(n >= m) {
				answer = 1; 
			}
			else {
				answer = 0;
			}
			if(n > m) {
				answer = 1; 
			}
			else {
				answer = 0;
			}
		}
		System.out.println(answer);
	}

}
