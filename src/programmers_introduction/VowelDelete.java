package programmers_introduction;

public class VowelDelete {
	public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
