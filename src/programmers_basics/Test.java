package programmers_basics;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int answer = 0;
		int n = 6; 
		for ( int i = 1; i <= n ; i++ ) {
			if(i*n*10 % 6 == 0) {
				answer = i;
			}
		}
		System.out.println(answer);
	}


}
