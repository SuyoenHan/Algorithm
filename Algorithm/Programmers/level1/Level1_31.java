package level1;

import java.util.*;

public class Level1_31 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/68644
	// 문제명: 두 개 뽑아서 더하기
		
	public static void main(String[] args) {
		
		// 정수배열 numbers 에서 서로 다른 인덱스에 있는 두개의 정수를 뽑아 더해서 만들 수 있는 모든 수를 배열로 만들기
		// 결과 배열은 오름차순으로 정렬하기
		
		int[] numbers= new int[] {2,1,3,4,1};
		List<Integer> numbersList= new ArrayList<>();
		for(int i=0;i<numbers.length-1;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				
				int sum= numbers[i]+numbers[j];
				numbersList.add(sum);
			}
		} // end of for-------
		
		
		for(int i=0;i<numbersList.size();i++) {
			
			for(int j=i+1;j<numbersList.size();j++) {
				
				if(numbersList.get(i)==numbersList.get(j)) {
					numbersList.remove(i);
					i--;
					break;
				}
			}
		}// end of for---------
		
		Collections.sort(numbersList);
		int[] answer= new int[numbersList.size()];
		
		for(int i=0;i<numbersList.size();i++) {
			answer[i]= numbersList.get(i);
		}
		
		System.out.println(answer[0]);
		
		
	
		
	}// end of main ----------------------
	
}
