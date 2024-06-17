package programmers_basics;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int price = 500000;
        if(price >= 500000) {
        	System.out.println(  price * 0.8 );
        }
        else if (price >= 300000) {
        	System.out.println( price * (9 / 10));
        }
        else if (price >= 100000) {
        	System.out.println(price * (19 / 20));
        }
        System.out.println(price);
	}

}
