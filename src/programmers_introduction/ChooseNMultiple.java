package programmers_introduction;

import java.util.ArrayList;
import java.util.List;

public class ChooseNMultiple {
	public int[] solution(int n, int[] numlist) {
        List<Integer> num = new ArrayList<Integer>();
        for(int i = 0 ; i < numlist.length ; i++) {
        	if(numlist[i] % n == 0) {
        		num.add(numlist[i]);
        	}
        }
        int[] answer = new int [num.size()];
        for(int i = 0 ; i < num.size() ; i ++) {
        	answer[i] = num.get(i);
        }
        return answer;
    }
}
