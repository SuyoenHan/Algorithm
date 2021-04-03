package level1;

public class level1_1 {
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/42576
// 문제명: 완주하지 못한 선수	
	
	public static void main(String[] args) {
		
		// 마라톤 참가자 명단  String[] participant
		// 마라톤 완주자 명단 String[] completion
		
		
		String[] participant= new String[]{"mislav", "stanko", "mislav", "ana"};
		String[] completion= new String[]{"mislav", "stanko", "ana"};

		// participant 명단과 completion 명단의 이름 비교하기
		String name= "";
		int cnt= 0;
		for(int i=0;i<participant.length;i++) {
			cnt= 0;  // cnt값 초기화
			for(int j=0;j<completion.length;j++) {
				if(!participant[i].equals(completion[j])) { // 문자열 비교는 .equals 사용하기
					cnt++;
				}
				else {
					completion[j]= "";  // 동명이인조건 처리
					break;
				}
			}
			if(cnt==completion.length) {
				name=participant[i];
			}
		}
		
		System.out.println(name);
		
		
	}// end of main ----------------------
	
}
