package programmers_introduction;

public class CuttingArray {
	public int[] solution(int[] numbers, int num1, int num2) {
		String a = "";
		for(int i = 0 ; i < numbers.length ; i++) {
			a += numbers[i];
		}
		String b = a.substring(num1, num2);
		int [] newNumbers = new int[b.length()];
		for(int i = 0 ; i < b.length() ; i++) {
			newNumbers[i] = b.charAt(i);
		}
        return newNumbers;
    }
}
