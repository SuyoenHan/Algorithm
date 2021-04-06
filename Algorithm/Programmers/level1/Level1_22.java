package level1;

public class Level1_22 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12925
	// 문제명: 문자열을 정수로 바꾸기
		
	public static void main(String[] args) {
		
		// 문자열 s를 숫자로 바꾸기
		// 문자열의 맨앞에는 부호(+,-)가 올 수도 있다
		
		String s= "1234";
		int answer=0;
		
		// 부호 존재 여부 알아내기
		
		try {
			Integer.parseInt(s.substring(0,1));
		
			// 부호가 없는 경우 => 무조건 양수
			answer= Integer.parseInt(s);
			
		} catch(NumberFormatException e) {  // 부호가 있는 경우
			
			switch(s.substring(0,1)) {
			case "+":
				answer= Integer.parseInt(s.substring(1));
				break;
			default:
				answer= Integer.parseInt(s.substring(1))*-1;
				break;
			}
			
		}
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
