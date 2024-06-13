package programmers_introduction;

import java.util.Arrays;

public class MideanValue_array {
	public int solution(int[] array) {
		Arrays.sort(array);
        return array[array.length/2];
    }
}
