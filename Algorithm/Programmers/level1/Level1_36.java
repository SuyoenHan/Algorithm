package level1;

public class Level1_36 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/70128
	// 문제명: 내적
		
	public static void main(String[] args) {
		
		// 길이가 같은 1차원 정수 배열 a,b가 주어질 때 a와 b의 내적을 구하시오
		// a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]  (n은 a와 b의 길이)

		int[] a = {1,2,3,4};
		int[] b= {-3,-1,0,2};
		
		int answer= 0;
		
		for(int i=0;i<a.length;i++) {
			answer+= a[i]*b[i];
		}
		
		System.out.println(answer);
		
		
	}// end of main ----------------------
	
}
