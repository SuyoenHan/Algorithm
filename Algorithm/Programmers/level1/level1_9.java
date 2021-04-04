package level1;

import java.util.*;

public class level1_9 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/72410
	// 문제명: 신규 아이디 추천
		
		public static void main(String[] args) {
			
		// 사용자가 입력한 아이디인 new_id가 규칙에 맞지 않으면, 입력된 아이디와 유사하면서 
		// 규칙에 맞는 아이디를 추천해주기
		
		/*  
		        아이디 규칙
			1) 아이디 길이는 3자이상 15자 이하
			2) 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 만 사용 가능
			3) 마침표(.)는 처음과 끝에 사용할 수 없으며, 연속으로도 사용할 수 없다
		*/	
			
		/*
		         아이디 추천 규칙
		    1단계) new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
			2단계) new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
			3단계) new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
			4단계) new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
			5단계) new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
			6단계) new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     			    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
			7단계) new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		 */
			
		String new_id= "=.=";
		
		// 1단계) 대문자를 소문자로 치환
		new_id= new_id.toLowerCase();   
		
		
		// 2단계) 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		char[] new_id_Arr= new_id.toCharArray();
		List<Character> new_id_ArrList= new ArrayList<>();
		
		for(int i=0;i<new_id_Arr.length;i++) {
			new_id_ArrList.add(new_id_Arr[i]);
		}// end of for-----
		
		for(int i=0;i<new_id_ArrList.size();i++) {
			
			if((int)new_id_ArrList.get(i)!=(int)('-') && (int)new_id_ArrList.get(i)!=(int)('_') &&
			   !((int)new_id_ArrList.get(i)>=(int)('0') && (int)new_id_ArrList.get(i)<=(int)('9')) &&
			   (int)new_id_ArrList.get(i)!=(int)('.') &&
			   !((int)new_id_ArrList.get(i)>=(int)('a') && (int)new_id_ArrList.get(i)<=(int)('z'))) {
				
				new_id_ArrList.remove(i);
				i--;
			}
		}// end of for-----
		
		
		// 3단계) 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
		for(int i=0;i<new_id_ArrList.size();i++) {
			if(i!=0 && new_id_ArrList.get(i).equals('.') && new_id_ArrList.get(i).equals(new_id_ArrList.get(i-1))) {
				new_id_ArrList.remove(i);
				i--;
			}
		}// end of for-------
		
		
		// 4단계) 마침표(.)가 처음이나 끝에 위치한다면 제거
		try {
			if(new_id_ArrList.get(0).equals('.')) {
				new_id_ArrList.remove(0);
			}
			
			if(new_id_ArrList.get(new_id_ArrList.size()-1).equals('.')) {
				new_id_ArrList.remove(new_id_ArrList.size()-1);
			}
		} catch(Exception e) {}	
		
		String answer="";
		for(int i=0;i<new_id_ArrList.size();i++) {
			answer+=new_id_ArrList.get(i);
		}
		
		// 5단계) new_id가 빈 문자열이라면, new_id에 "a"를 대입
		
		if(answer.isEmpty()) {
			answer="a";
		}
		
		
		// 6단계) new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
		//       제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
		
		if(answer.length()>=16) {
			answer= answer.substring(0, 15);
		}
		
		if((int)answer.charAt(answer.length()-1)==(int)('.')) {
			answer= answer.substring(0, 14);
		}
		
		
		// 7단계) new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 추가
		do {
			if(answer.length()<=2) {
				char lastChracter= answer.charAt(answer.length()-1);
				answer+=lastChracter;
			}
		} while(answer.length()<3);
		
		System.out.println(answer);
			
			
	}// end of main ----------------------
	
}
