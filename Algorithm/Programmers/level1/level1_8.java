package level1;

import java.util.*;

public class level1_8 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/42862
	// 문제명: 체육복
		
		public static void main(String[] args) {
			
		// 일부 학생의 체육복이 도난당함 => 여벌이 있는 학생들이 도난당한 학생들에게 체육복을 빌려줄수 있음 
		// 단 바로 앞번호의 학생이나 바로 뒤선호의 학생에게만 빌려줄 수 있다 / 여벌이 있는 학생도 도난당한 학생 배열에 있을 수 있다
		// 체육수업을 들을 수 있는 학생의 최댓값을 구하라
		
			// n, lost, reserve 변수의 값은 가변적
			int n=10;  // 전체 학생 수 n
			int[] lost=new int[] {5,7,9}; // 체육복을 도난당한 학생 번호
			int[] reserve= new int[] {1,2,3,4,6,8}; // 여벌체육복이 있는 학생 번호
			
			int answer=0;
			List<Integer> reserveList = new ArrayList<>();
			List<Integer> lostList = new ArrayList<>();
			
			
			// reserve 배열 중 도난당하지 않은 학생들 reserveList에 넣어주기 => 체육복을 빌려줄 수 있는 학생 리스트 생성
			for(int i=0;i<reserve.length;i++) {
				reserveList.add(reserve[i]);
				
				for(int j=0;j<lost.length;j++) {
					if(reserve[i]==lost[j]) {
						reserveList.remove(i);
					}
				}
			}// end of for------

			
			// lost 배열 중 여벌의 체육복이 있는 학생들을 제외한 학생들 lostList에 넣어주기 => 체육복을 빌려야만 하는 학생 리스트 생성
			for(int i=0;i<lost.length;i++) {
				boolean flag=false; // 초기화
				for(int j=0;j<reserve.length;j++) {
					if(lost[i]==reserve[j]) {
						flag=true;
						break;
					}
				}
				if(!flag) {
					lostList.add(lost[i]);
				}
			}// end of for-------
			
			// 앞에서 뒤로 빌려주기 => List의 remove는 인덱스 신경써야 한다!!
			
			for(int i=0;i<lostList.size();i++) {
				for(int j=0;j<reserveList.size();j++) {
					if(lostList.get(i)-1 == reserveList.get(j)) {
						reserveList.remove(j);
						lostList.remove(i);
						j--;
						i--;
						break;
					}
					else if(lostList.get(i)+1 == reserveList.get(j)) {
						reserveList.remove(j);
						lostList.remove(i);
						j--;
						i--;
						break;
					}
				}
			} // end of for-------------
			
			
			answer= n-(lostList.size());
			
			System.out.println(answer);
			
	}// end of main ----------------------
	
}
