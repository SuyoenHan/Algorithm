package level1;

public class Level1_33 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12931
	// 문제명: 자릿수 더하기
		
	public static void main(String[] args) {
		
	// 자연수 n이 주어질때 각 자릿수의 합 구하기
		int n=987;
		
		int sum=0;
		char[] nCharArray= String.valueOf(n).toCharArray();
		
		for(int i=0;i<nCharArray.length;i++) {
			sum+=Integer.parseInt(String.valueOf(nCharArray[i]));
		}
		
		System.out.println(sum);
		
		
		
	}// end of main ----------------------
	
}
