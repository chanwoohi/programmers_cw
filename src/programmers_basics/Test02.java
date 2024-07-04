package programmers_basics;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int hp = 23;
		int answer = 0;
		int c = 5;
		int a = 3;
		int b = 1;

		for(;;) {
			if((hp -= c) > 0) {
				answer++;
				
			} else {
				hp +=c;
				break;
			}
		}
		for(;;) {
			if((hp -= a) > 0) {
				answer++;
				
			} else {
				hp +=c;
				break;
			}
		}
		for(;;) {
			if(hp - b != 0) {
				answer++;
				
			} else {
				break;
			}
		}
		System.out.println(answer);
	}
}


