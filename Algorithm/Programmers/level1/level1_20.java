package level1;

import java.util.*;

public class level1_20 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/1845
	// 문제명: 폰켓몬
		
	public static void main(String[] args) {
		
		// 총 N 마리의 폰켓몬 중에서 N/2마리를 가질 수 있다. => 배열 nums은 항상 짝수값으로 주어진다
		// N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아 그때의 폰켓몬 종류 번호의 개수를 출력
		
		int[] nums= new int[] {3,3,3,2,2,2};
		int answer=0;
		
		int get_len= nums.length/2;
		
		// nums에서 서로 다른 번호의 개수 알아내기
		List<Integer> nums_notduplicate= new ArrayList<>();
		
		boolean flag= false;
		for(int i=0;i<nums.length;i++) {
			flag=false; // 초기화
			for(int j=0;j<nums_notduplicate.size();j++) {
				if(nums[i]==nums_notduplicate.get(j)) {
					flag=true;
					break;
				}
			}
			if(!flag) { // 중복된 값이 아닌 경우
				nums_notduplicate.add(nums[i]);
			}
		}
		
		int len_notduplicate= nums_notduplicate.size();
		
		// len_notduplicate와 get_len 비교하기
		if(len_notduplicate>=get_len) {
			answer= get_len;
		}
		else {
			answer= len_notduplicate;
		}
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
