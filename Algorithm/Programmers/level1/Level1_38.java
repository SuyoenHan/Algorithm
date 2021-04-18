package level1;

public class Level1_38 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/76501
	// 문제명: 음양 더하기
		
	public static void main(String[] args) {
		
		// 정수들의 절댓값을 담은 정수 배열 absolutes
		// 정수들의 부호를 차례대로 담은 불리언 배열 signs (true==양수 , false==음수)
		// 실제 정수들의 합 구하기
	
		int[] absolutes= new int[] {4,7,12};
		boolean[] signs= new boolean[] {true,false,true};
		
		int sum=0;
		
		for(int i=0;i<absolutes.length;i++) {
			
			if(!signs[i]) {  // 음수
				absolutes[i]=absolutes[i]*(-1);
			}
			sum+=absolutes[i];
		}
		
		System.out.println(sum);
		
		
	}// end of main ----------------------
	
}
