package level1;

import java.util.*;

public class Level1_28 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12932
	// 문제명: 자연수 뒤집어 배열로 만들기
		
	public static void main(String[] args) {

		// 자연수 n을 뒤집어 배열형태로 만들기
		
		int n= 12345;
		String nString= String.valueOf(n);
		int[] answer= new int[nString.length()];
		
		List<String> nList= new ArrayList<>();
		
		for(int i=0;i<nString.length();i++) {
			nList.add(String.valueOf(nString.charAt(i)));
		}
		
		Collections.reverse(nList);
		
		for(int i=0;i<nList.size();i++) {
			answer[i]= Integer.parseInt(nList.get(i));
		}
		
		System.out.println(answer[0]);
		
	}// end of main ----------------------
	
}
