package level1;

import java.util.*;

public class level1_13 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12982
	// 문제명: 예산
		
	public static void main(String[] args) {
		
		// 부서별로 신청한 금액이 들어있는 배열 d와 예산  budget을 이용해서 최대 몇 개의 부서에 물품을 지원할 수 있는지 알아내기
		// 단 신청금액보다 적은 금액은 지원해 줄 수 없다
		
		int[] d= new int[] {2,2,3,3};
		int budget= 10;
		int answer=0;
		
		// 낮은 금액을 신청한 순서대로 오름차순 정리 
		List<Integer> dList= new ArrayList<>();
		
		for(int i=0;i<d.length;i++) {
			dList.add(d[i]);
		}
		
		Collections.sort(dList);
		
		int sum=0;
		for(int i=0;i<dList.size();i++) {
			sum+=dList.get(i);
			answer++;
			
			if(budget<sum) {
				answer--;
				break;
			}
		}
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
