package programmers_introduction;

import java.util.Arrays;

public class CutOfArray {
	public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}
