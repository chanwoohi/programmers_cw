package programmers_introduction;

import java.util.Scanner;

//이등변 삼각형 만들기
public class IsoscelesTriangle {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        for(int i = 1 ; i <= n ; i++) {
        	System.out.println(star.repeat(i));
        }
    }
}
