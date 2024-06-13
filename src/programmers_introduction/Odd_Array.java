package programmers_introduction;

import java.util.Arrays;

public class Odd_Array {
	// 정수 n 이하의 홀수만 배열에 넣기
	public int[] solution(int n) {
		int[] answer = {};
		if( n % 2 == 0) {
			answer = new int [n / 2];
		}
		answer = new int [(n + 1) / 2];  // 연산자 진행 순서 꼭 생각하자;; 한참 헤맸어
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = (i * 2) + 1;
		}
		return answer;
	}
}
