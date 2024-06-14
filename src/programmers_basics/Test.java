package programmers_basics;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		for(int i = 0 ; i <= n ; i++) {
			if(n % 2 == 0 && i %  2 == 0) {
				answer += Math.pow(i, 2);
			}
			else if( n % 2 != 0 && i % 2 != 0) {
				answer += i;
			}
		}
		System.out.println(answer);

	}
}
