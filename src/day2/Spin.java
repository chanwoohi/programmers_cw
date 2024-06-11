package day2;

import java.util.Scanner;

public class Spin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 1 ; i <= a.length() ; i++ ) {
        	char b = a.charAt(i-1);
        	System.out.println(b);
        }
    }
}