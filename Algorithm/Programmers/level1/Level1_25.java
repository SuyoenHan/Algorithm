package level1;

import java.util.*;

public class Level1_25 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12917
	// 문제명: 문자열 내림차순으로 배치하기
		
	public static void main(String[] args) {
		
	// 문자열 s를 내림차순으로 정렬하기 => s는 영어대소문자로만 구성되어 있으며 대문자는 소문자보다 작은 것으로 간주한다
	
		String s="Zbcdefg";
		String answer="";
		
		char[] sArray= s.toCharArray();
		List<String> sArrayList= new ArrayList<>();
		
		for(int i=0;i<sArray.length;i++) {
			sArrayList.add(String.valueOf(sArray[i]));
		}
		
		Collections.sort(sArrayList);
		Collections.reverse(sArrayList);
		answer= String.join("",sArrayList);
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
