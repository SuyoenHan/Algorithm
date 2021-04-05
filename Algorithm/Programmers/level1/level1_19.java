package level1;

public class level1_19 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12919
	// 문제명: 서울에서 김서방 찾기
		
	public static void main(String[] args) {
		
		// 문자열배열 seoul에서 "Kim"의 위치 x를 찾아 "김서방은 x에 있다" 라는 문자열 출력
		// "Kim"은 반드시 1명만 존재하고, 존재하지 않는 경우는 없다
		
		String[] seoul= new String[] {"Jane","Kim"};
		
		int index=0;
		for(int i=0;i<seoul.length;i++) {
			if("Kim".equals(seoul[i])) {
				index=i;
				break;
			}
		}
		
		System.out.println("김서방은 "+index+"에 있다");
	
	}// end of main ----------------------
	
}
