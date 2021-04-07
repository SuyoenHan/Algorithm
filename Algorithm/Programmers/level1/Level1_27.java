package level1;

public class Level1_27 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12926
	// 문제명: 시저 암호
		
	public static void main(String[] args) {

		// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문 만들기
		// 공백은 밀어도 공백, s는 소문자, 대문자, 공백으로만 구성
		
		
		String s= "a B z";
		int n=4;
		String answer="";
		char ch= ' ';
		
		for(int i=0;i<s.length();i++) {
			
			if((int)s.charAt(i) == 32) {  // 공백은 10진수로 32에 해당
				ch=' ';
			}
			else if((int)'A'<=(int)s.charAt(i) && (int)s.charAt(i) <=(int)'Z') { // 대문자인 경우
			
				if((int)s.charAt(i)+n > (int)'Z') { // Z보다 큰 경우
					int overNum= (int)s.charAt(i)+n - (int)'Z';
					ch= (char)((int)'A' + overNum-1);	
				}
				else {
					ch=(char)((int)s.charAt(i)+n);	
				}
				
				
			}
			else { // 소문자인 경우
				if((int)s.charAt(i)+n > (int)'z') { // z보다 큰 경우
					int overNum= (int)s.charAt(i)+n - (int)'z';
					ch= (char)((int)'a' + overNum-1);	
				}
				else {
					ch=(char)((int)s.charAt(i)+n);	
				}
			}	
			
			answer+=ch;			
		}
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
