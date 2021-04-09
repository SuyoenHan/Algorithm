package level1;

public class Level1_35 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12934 
	// 문제명: 정수 제곱근 판별
		
	public static void main(String[] args) {
	
		// 양의 정수 n에 대해 n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하기
		// n이 양의 정수 x의 제곱이라면 x+1제곱을 출력하고, n이 양의 정수 x의 제곱이 아니라면 -1을 출력해라
	
		long n= 121;
		long answer=0;
		
		double nSqrt= Math.sqrt(n);
		String sSqrt= String.valueOf(nSqrt);
		
		int index= sSqrt.indexOf(".");
		
		if( sSqrt.substring(index+1).length() == 1 && (int)sSqrt.charAt(index+1)==(int)'0') {
			answer= (long)((nSqrt+1)*(nSqrt+1)); 
		}
		else {
			answer=-1;
		}
	
		System.out.println(answer);
	}// end of main ----------------------
	
}
