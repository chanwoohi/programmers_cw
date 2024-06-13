package programmers_basics;

public class Arr_Multiplication {
	public String solution(String my_string, int k) {
        String answer = "";
        String new_String = "";
        for( int i = 0 ; i < k ; i++) {
        	new_String += my_string;
        }
        return new_String;
    }
}
