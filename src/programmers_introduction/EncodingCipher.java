package programmers_introduction;

public class EncodingCipher {

	public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code - 1 ; i <= cipher.length() -1 ; i += code ) {
        	answer += cipher.substring(i, i+1);
        }
        return answer;
    }

}
