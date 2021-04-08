package level1;

public class Level1_34 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12901
	// 문제명: 2016년
		
	public static void main(String[] args) {
	
		// 2016년 1월1일은 금요일이다. 2016년 a월 b일은 무슨 요일인지 알아내기
		// 2016년은 윤년이며 a월 b일은 실제로 존재하는 날이다. 
		// 일요일부터 토요일까지의 이름은 각각 SUN,MON,TUE,WED,THU,FRI,SAT이다.
		
		
		int a=5;
		int b=24;
		
		String answer="";
		
		// 해당 월일에 해당하는 것을 1월1읿부터의 Day로 바꾸기		
		int[] arrDays = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
		int days= 0;
		
		for(int i=0;i<a-1;i++) {
			days+=arrDays[i];
		}

		days+=b;
		
		String[] todayArr= new String[] {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		int index=5; // 금요일부터 
		
		for(int i=0;i<days;i++) {
			answer=todayArr[index];
			index++;
			
			if(index==7) {
				index=0;
			}
		}// end of for-----------
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
