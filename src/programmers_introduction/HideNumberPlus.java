package programmers_introduction;


//숨어있는 숫자의 덧셈
public class HideNumberPlus {
	public int solution(String my_string) {
        int answer = 0;
        
        String tmp = my_string.replaceAll("^[a-zA-Z]*$", "");
        String[] string = tmp.split("");
        
        for(String i : string){
        	answer += Integer.parseInt(i);
        }
        return answer;
    }
}
