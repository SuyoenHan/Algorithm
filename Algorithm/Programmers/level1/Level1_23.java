package level1;

import java.util.*;

public class Level1_23 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12915
	// 문제명: 문자열 내 마음대로 정렬하기
		
	public static void main(String[] args) {
		
		// 문자열 배열 strings과 정수 n이 주어질때, 인덱스 n번째 글자를 기준으로 오름차순 정렬하기
		// 문자열 배열 strings의 원소는 소문자 알파벳으로만 구성
		// strings의 원소의 길이는 n보다 크다
		// 인덱스 n의 문자와 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치
		
		
		String[] strings= new String[] {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		int n=2;
		
		
		String[] answer= new String[strings.length];
		
		List<String> stringList= new ArrayList<>();
		for(int i=0;i<strings.length;i++) {
			stringList.add(strings[i]);
		}
		
		Collections.sort(stringList);  
		char smallChar= stringList.get(0).charAt(n);
		int index=0;
		int small=0;
		
		do {
			smallChar= stringList.get(0).charAt(n);  // 초기화
			small=0; // 초기화
			for(int i=0;i<stringList.size();i++) {
				char indexChar= stringList.get(i).charAt(n);
				if((int)indexChar < (int)smallChar ) {
					smallChar= indexChar;
					small=i;
				}
			} // end of for----
			
			answer[index]= stringList.remove(small);
			index++;
			
		} while(stringList.size()!=0);
		
		System.out.println(answer[0]);
	}// end of main ----------------------
	
}
