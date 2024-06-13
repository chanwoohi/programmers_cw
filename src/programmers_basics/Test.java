package programmers_basics;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int n = 11;
		int[] answer = new int[n/2];
		for(int i = 1; i <= n ; i++) {
			if(i % 2 != 0) {
				answer[(int)(i/2)] = i;
			}
		}
		System.out.println(Arrays.toString(answer));
	}


}
