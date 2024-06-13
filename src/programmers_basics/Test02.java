package programmers_basics;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int n = 11;
		int[] answer = {};
		if( n % 2 == 0) {
			answer = new int [n / 2];
		}
		else {
		answer = new int [(n + 1) / 2];
		}
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = (i * 2) + 1;
		}
		System.out.println(Arrays.toString(answer));
	}

}
