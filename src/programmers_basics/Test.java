package programmers_basics;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String A = "League Of Legend";
		String a = "L";
		String b = "Le";
		String c = "La";
		String d = "Lea";
		String e = "L eagu";
		String f = "League Of L";

		System.out.println(A.startsWith(a));
		System.out.println(A.startsWith(b));
		System.out.println(A.startsWith(c));
		System.out.println(A.startsWith(d));
		System.out.println(A.startsWith(e));
		System.out.println(A.startsWith(f));
	}

}
