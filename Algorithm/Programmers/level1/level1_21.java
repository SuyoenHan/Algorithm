package level1;

public class level1_21 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12943
	// 문제명: 콜라츠 추측
		
	public static void main(String[] args) {
		
		// 주어진 수 num이 아래의 과정을 통해 몇번만에 1이 되는지 알아내기
		// 500번 반복해도 1이되지 않는다면 -1로 출력하기
		
		 /*
		  	1-1) 입력된 수가 짝수라면 2로 나눕니다
		  	1-2) 입력된 수가 홀수라면 3을 곱하고 1을 더합니다
		 	2) 결과로 나온 수에 같은 작업을 1일 될때까지 반복합니다
		 */
		
		int num= 626331;
		int cnt=0;
		
		while(num!=1) {
			cnt++;
			
			if(cnt>500) {
				cnt=-1;
				break;
			}
			
			if(num%2==0) {  // num이 짝수인경우
				num= num/2;
				
			}
			else { // num이 홀수인경우
				num= num*3+1;
			}
			
		} //end of while--------
		
		System.out.println(cnt);
		
	}// end of main ----------------------
	
}
