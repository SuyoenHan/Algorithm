package level1;

import java.util.ArrayList;
import java.util.List;

public class level1_7 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12906
	// 문제명: 같은 숫자는 싫어
		
		public static void main(String[] args) {
			
		// 주어진 숫자배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
		// 제거 후 반환할때는 배열 arr의 원소 순서 유지
			
		int[] arr= new int[] {1,1,3,3,0,1,1};
		List<Integer> arrList= new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				arrList.add(arr[i]);
			}
			else if(arr[i]!=arr[i-1]) {
				arrList.add(arr[i]);
			}
		}
		
		int[] answer = new int[arrList.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i]=arrList.get(i);
		}
		
		System.out.println(answer[0]);
		
	}// end of main ----------------------
	
}
