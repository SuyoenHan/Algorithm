package level1;

public class level1_5 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12916
	// 문제명: 문자열 내 p와 y의 개수
		
		public static void main(String[] args) {
	
		// 문자열 s가 주어질때 p와 y의 개수가 같으면 true, 다르면 false 리턴
		// 대소문자는 구분하지 않는다
			
		String s= "pPoooyY";
		boolean answer= false;
		int pCnt= 0;
		int yCnt=0;
		
		for(int i=0; i<s.length();i++) {
			
			         // 문자열에서 i에 위치한 값 추출 (참고로 .equals()는 문자열 비교에서만 사용 가능)
			if((int)s.charAt(i)==(int)('p') || (int)s.charAt(i)==(int)('P')) {
				pCnt++; 
			}
			else if((int)s.charAt(i)==(int)('y') || (int)s.charAt(i)==(int)('Y')) {
				yCnt++; 
			}
		} // end of for------
		
		if(pCnt==yCnt) answer=true;
		
		System.out.println(answer);	
			

	}// end of main ----------------------
	
}
