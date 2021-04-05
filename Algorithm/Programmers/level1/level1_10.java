package level1;

public class level1_10 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12948
	// 문제명: 핸드폰 번호 가리기
		
		public static void main(String[] args) {
			
		// 전화번호 문자열 phone_number에서 뒷 자리를 제외한 나머지 숫자를 전부 *로 가린 문자열 출력하기
		
		String phone_number= "027778888";
		String answer="";
		
		int changeLen= phone_number.length()-4;
		
		answer="";
		for(int i=0;i<changeLen;i++) {
			answer+="*";
		}
		
		answer+=phone_number.substring(changeLen);
				
		System.out.println(answer);
			
	}// end of main ----------------------
	
}
