package level1;

public class Level1_37 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12921
	// 문제명: 소수찾기
		
	public static void main(String[] args) {
		
		// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수 구하기 
		// 소수는 1과 자기 자신으로만 나누어지는 수를 의미하며 1은 소수가 아니다
		
		int n=5;
		int answer=0;
		int cnt=1; // cnt (소수가 아닌 수) ==> 1 포함
		
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) { // 소수가 아닌인경우
					cnt++;
					break;
				}
			}
		} // end of for---
		
		answer= n-cnt;
		System.out.println(answer);
		
		
	}// end of main ----------------------
	
}
