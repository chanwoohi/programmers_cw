package programmers_introduction;

import java.util.Arrays;

public class SumArray {
	public double solution(int[] numbers) {
        double answer = 0;
        double a = 0;
        for(int i = 0 ; i < numbers.length ; i++ ) {
        	a += numbers[i];
        }
         answer = a / (numbers.length -1 );
        return answer;
    }
}
