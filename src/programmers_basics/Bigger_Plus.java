package programmers_basics;

public class Bigger_Plus {

	public int solution(int a, int b) {
		String A = String.valueOf(a) + String.valueOf(b);
		String B = String.valueOf(b) + String.valueOf(a);
		int num1 = Integer.parseInt(A);
		int num2 = Integer.parseInt(B);
		if(num1 < num2) {
			return num2;
		}
		else {
			return num1;
		}
	}

}
