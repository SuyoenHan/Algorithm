package level1;

public class level1_6 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12903
	// 문제명: 가운데 글자 가져오기
		
		public static void main(String[] args) {
	
		// 단어 s의 가운데 글자 반환하기 (길이가 짝수라면 가운데 두글자 반환)
			
		String s="abcde";
		String answer="";
		int index= 0;
		
		if(s.length()%2==0) { //글자 길이가 짝수인 경우
			index= s.length()/2;
			answer= String.valueOf(s.charAt(index-1))+String.valueOf(s.charAt(index));	
		}
		else { // 글자 길이가 홀수인 경우 
			index= s.length()/2+1; // int와 int 나누기는 int값으로 리턴
			answer= String.valueOf(s.charAt(index-1)); 	
		}
		
		System.out.println(answer);
	}// end of main ----------------------
	
}
