package programmers_introduction;

import java.util.Arrays;

//기약분수의 분자와 분모 더하기
public class AdditionOfFractions {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer = numer1*denom2 + numer2*denom1;
		int denom = denom1*denom2;
		
		int gcd=0;
		for(int i = 1; i <= denom && i <= numer ; i++) {
			if(denom % i == 0 && numer % i == 0){
				gcd = i;
			}
		}
		int answer[] = {numer/gcd,denom/gcd};
		return answer;
	}
}
