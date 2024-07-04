package programmers_introduction;

import java.util.Arrays;

public class ArrayMaxMultiple {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
