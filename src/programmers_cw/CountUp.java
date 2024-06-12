package programmers_cw;

import java.util.Arrays;

public class CountUp {

	public int[] solution(int start_num, int end_num) {
		start_num = 10; end_num =3;
        int[] answer = new int [end_num - start_num + 1];
       for(int i = start_num ; i <= end_num ; i++ ) {
    	   answer[i - start_num] = i ;
       }
        return answer;
    }
	
	
}
