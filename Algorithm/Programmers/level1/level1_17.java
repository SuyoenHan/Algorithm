package level1;

public class level1_17 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12912
	// 문제명: 두 정수 사이의 합 
		
	public static void main(String[] args) {
		
		// 두 정수 a, b가 주어졌을때 a와 b 사이에 속한 모든 정수의 합 구하기 => a와 b 포함
		// a와 b가 같은경우 둘중 아무 수나 출력
		// a와 b의 대소관계는 정해져 있지 않다.
		
		int a=5;
		int b=3;

		long answer=0L;
		if(a>b) {
			for(int i=b;i<=a;i++) answer+=i;
		}
		
		else if (a<b){
			for(int i=a;i<=b;i++)  answer+=i;
		}
		
		else answer=a;
		
		System.out.println(answer);
	
	}// end of main ----------------------
	
}
