package programmers_basics;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String answer = "";
		int code = 2;
		String cipher = "pfqallllabwaoclk";
        for(int i = code - 1 ; i <= cipher.length() ; i += code ) {
        	answer += cipher.substring(i, i+1);
        }
        System.out.println(answer);

	}
}
