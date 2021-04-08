package level1;

import java.util.*;

public class Level1_30 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12910
	// 문제명: 나누어 떨어지는 숫자 배열
		
	public static void main(String[] args) {
		
		// arr의 각 요소들 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열 만들기
		
		int[] arr= new int[] {5, 9, 7, 10};
		int divisor= 5;
		
		List<Integer> arrList= new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%divisor==0) { // divisor로 나누어 떨어지는 경우
				arrList.add(arr[i]);
			}
		}
		
		int[] answer= {};
		// divisor로 나누어 떨어지는 요소가 하나도 없는경우 -1 담아서 return
		if(arrList.size()==0) {
			answer= new int[] {-1};
		}
		else {
			Collections.sort(arrList);
			answer= new int[arrList.size()];
			for(int i=0;i<arrList.size();i++) {
				answer[i]= arrList.get(i);
			}
		}
	
		System.out.println(answer[0]);
		
	}// end of main ----------------------
	
}
