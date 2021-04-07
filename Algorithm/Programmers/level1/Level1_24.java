package level1;

public class Level1_24 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12922
	// 문제명: 수박수박수박수박수박수?
		
	public static void main(String[] args) {
		
		// "수박수박수박수...."와 같은 패턴을 유지하는 문자열에서 주어진 정수 n만큼 리턴하시오
		
		int n=5;
		String answer="";
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sb.append("수");
			}
			else {
				sb.append("박");
			}
		}
		
		answer= sb.toString();
		System.out.println(answer);
		
	
	}// end of main ----------------------
	
}
