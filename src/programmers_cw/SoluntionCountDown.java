package programmers_cw;

import java.util.Arrays;

public class SoluntionCountDown {

	public int[] solution(int start_num, int end_num) {
		int[] answer = {};
		for( int i = start_num ; i >= end_num ; i-- ) {
			answer[i] = i - 1;
		}
		return answer;
    	}
	public static void main(String[] args) {
	}
}
