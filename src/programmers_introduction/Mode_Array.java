package programmers_introduction;

public class Mode_Array {
	public int solution(int[] array) {
        int answer = 0;
        int arrMax = 0;
        for(int tmp : array) {
        	if(tmp > arrMax) {
        		arrMax = tmp;
        	}
        }
        int [] count = new int [arrMax + 1];
        for( int i = 0 ; i < array.length ; i++ ) {
        	count[array[i]]++;
        }
        int countMax = 0;
        int mode = 0;
        int count2 = 0;
        
        int num = 0;
        for( int i = 0 ; i < count.length ; i++ ) {
        	if ( count[i] > count2 ) {
        		count2 = count[i] ;
        		answer = i;
        	}
        }
        for( int i  = 0 ; i < count.length ; i++ ) {
        	if(count[i] == count2) {
        		num++;
        	}
        }
        if(num >= 2) {
        	return -1;
        }
        return answer;
    }
}
