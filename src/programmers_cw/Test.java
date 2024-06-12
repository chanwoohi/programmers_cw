package programmers_cw;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int start_num =10;
		int end_num =3;
		
		int[] answer = new int[start_num - end_num + 1];
		for( int i = start_num ; i >= end_num ; i-- ) {
			answer[start_num - i ] = i;
		}
		System.out.println(Arrays.toString(answer));

	}

}
