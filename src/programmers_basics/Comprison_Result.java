package programmers_basics;

public class Comprison_Result {
	public int solution(int a, int b) {
		String A = String.valueOf(a) + String.valueOf(b);
		int num1 = Integer.parseInt(A);
		int num2 = 2 * a * b;
		if(num1 < num2) {
			return num2;
		}
		else {
			return num1;
		}
    }
}
