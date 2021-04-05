package level1;

public class level1_18 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12947
	// 문제명: 하샤드 수
		
	public static void main(String[] args) {
		
		// 하샤드 수= x의 자릿수의 합으로 x가 나누어 떨어지는 수
		// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 확인하기
		
		int x=13;
		
		// 각 자리수 합 구하기
		int each_sum=0;
		char[] xArray= String.valueOf(x).toCharArray();
		for(int i=0;i<xArray.length;i++) {
			each_sum+= Integer.parseInt(String.valueOf(xArray[i]));
		}
		
		boolean answer= false;
		if(x%each_sum==0) {
			answer=true;
		}
		
		System.out.println(answer);
		
	
	}// end of main ----------------------
	
}
