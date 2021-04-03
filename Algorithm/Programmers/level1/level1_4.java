package level1;

public class level1_4 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12918
	// 문제명: 문자열다루기기본
		
		public static void main(String[] args) {
		
		// 주어진 문자열의 길이가 4혹은 6이고 숫자로만 구성돼있는지 확인하기 => 조건에 부합하면 true, 아니면 false
			
		String s="1234";  // 문자열 s는 주어지는 값	
		char[] sArr= s.toCharArray();
		
		boolean answer= true;
		
		if(s.length()==4 || s.length()==6) { // 길이 조건에 부합하는 경우 실행
			
			for(int i=0;i<sArr.length;i++) {
				if(!(48<=sArr[i] && sArr[i] <=57)) { // 숫자 이외의 문자가 있는 경우
					answer=false;
					break;
				}
			}
		}
		else { // 길이 조건에 부합하지 않는 경우 실행
			answer= false;
		}
		
		System.out.println(answer);
			

	}// end of main ----------------------
	
}
