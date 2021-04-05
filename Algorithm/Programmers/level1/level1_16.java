package level1;

import java.util.*;

public class level1_16 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12935
	// 문제명: 제일 작은 수 제거하기
		
	public static void main(String[] args) {
		
		// 정수를 저장한 배열 arr에서 가장 작은 수를 제거한 배열 리턴하기 (출력으로 확인해보기)
		// 리턴하는 배열이 빈 배열이라면 -1을 채워서 리턴하기
		
		int[] arr= new int[] {10};
		
		// 정렬로 가장 작은 값 얻어오기 
		List<Integer> arrList= new ArrayList<>();		
		for(int i=0;i<arr.length;i++) {
			arrList.add(arr[i]);
		}
		
		Collections.sort(arrList);
		
		int smallest= arrList.get(0);
		
		// 가장 작은 값이 여러개이면 해당 값들 같이 제거해주기
		for(int i=0;i<arrList.size();i++) {
			if(arrList.get(i).equals(smallest)) { // 객체데이터타입(Integer)이므로 .equals 사용
				arrList.remove(i);
				i--;
			}
			else {
				break;
			}
		}
		
		// 빈배열일 경우 -1 담아서 리턴시키기		
		// 리턴시킬 배열 순서는 기존의 배열 순서와 동일해야 한다
		
		int[] answer= {}; 
		if(arrList.size()==0) {
			answer= new int[1];
			answer[0]=-1;
		} // end of if---------------------
		else {
			answer= new int[arrList.size()];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=smallest) {
					answer[i]=arr[i];
				}
			}
		} // end of else-------------
		
		System.out.println(answer[0]);
	}// end of main ----------------------
	
}
