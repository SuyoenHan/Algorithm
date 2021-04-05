package level1;

public class level1_15 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12937
	// 문제명: 짝수와 홀수
		
	public static void main(String[] args) {
		
		// 주어진 정수 num이 짝수일 경우 "Even" , 홀수일 경우 "Odd" 출력하기
		// 0은 짝수이다.
		
		int num=0;
		String answer="";
		
		if(num%2==0) {  // 짝수인경우  (0%2도 나머지는 0이다)
			answer="Even";
		}
		else { // 홀수인경우
			answer="Odd";
		}
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
