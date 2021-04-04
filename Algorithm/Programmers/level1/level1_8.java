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
			int n=5;  // 전체 학생 수 n
			int[] lost=new int[] {2,4}; // 체육복을 도난당한 학생 번호
			int[] reserve= new int[] {1,3,5}; // 여벌체육복이 있는 학생 번호
			
			int answer=0;
			boolean flag= false;
			List<Integer> arrList = new ArrayList<>(); 
			List<Integer> arrList2 = new ArrayList<>(); 
			List<Integer> reserveList = new ArrayList<>();
			List<Integer> reserveList2 = new ArrayList<>();
			List<Integer> lostList = new ArrayList<>();
			List<Integer> lostList2 = new ArrayList<>();
			
			// lost배열에 있지 않은 학생들 arrList에 추가
			for(int i=0;i<n;i++) {
				flag= false; // 초기화
				
				for(int j=0;j<lost.length;j++) {
					if(i+1 == lost[j]) {
						flag= true;
						break;
					}
				}
		
				if(!flag) {
					arrList.add(i+1);
					arrList2.add(i+1);
				}
			}// end of for--------
			
			
			// lost 배열에 있지만 여벌의 체육복이 있는 학생 arrList에 추가  & reserveList에서 제거
			for(int i=0;i<reserve.length;i++) {
				reserveList.add(reserve[i]);
				reserveList2.add(reserve[i]);
				
				for(int j=0;j<lost.length;j++) {
					if(reserve[i]==lost[j]) {
						arrList.add(reserve[i]);
						arrList2.add(reserve[i]);
						reserveList.remove(i);
						reserveList2.remove(i);
					}
				}
			}// end of for------


			for(int i=0; i<lost.length;i++) {
				lostList.add(lost[i]);
				lostList2.add(lost[i]);
			}
			
			// 앞 => 뒤 
			
			for(int i=0;i<lostList2.size();i++) {
				for(int j=0;j<reserveList2.size();j++) {
					if(lostList2.get(i)-1 == reserveList2.get(j)) {
						arrList.add(lostList2.get(i));
						reserveList2.remove(j);
						lostList2.remove(i);
						break;
					}
				}
			}
			
			for(int i=0;i<lostList2.size();i++) {
				for(int j=0;j<reserveList2.size();j++) {
					if(lostList2.get(i)+1 == reserveList2.get(j)) {
						arrList.add(lostList2.get(i));
						reserveList2.remove(j);
						lostList2.remove(i);
						break;
					}
				}
			}
			
			int len_case1= arrList.size();
			// System.out.println(len_case1);
			
			
			// 뒤 => 앞
	
			for(int i=0;i<lostList.size();i++) {
				for(int j=0;j<reserveList.size();j++) {
					if(lostList.get(i)-1 == reserveList.get(j)) {
						arrList2.add(lostList.get(i));
						reserveList.remove(j);
						lostList.remove(i);
						break;
					}
				}
			}
			
			for(int i=0;i<lostList.size();i++) {
				for(int j=0;j<reserveList.size();j++) {
					if(lostList.get(i)+1 == reserveList.get(j)) {
						arrList2.add(lostList.get(i));
						reserveList.remove(j);
						lostList.remove(i);
						break;
					}
				}
			}
			
			int len_case2= arrList2.size();
			// System.out.println(len_case2);
			
	
			if(len_case1>=len_case2) {
				answer= len_case1;
			}
			else if(len_case1<len_case2) {
				answer= len_case2;
			}
			
			System.out.println(answer);
			
	}// end of main ----------------------
	
}
