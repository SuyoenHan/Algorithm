package level1;

import java.util.*;

public class Level1_29 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12930
	// 문제명: 이상한 문자 만들기
		
	public static void main(String[] args) {

	// 문자열 s는 한개 이상의 단어로 구성되어 있다. 각 단어는  하나 이상의 공백문자로 구분되어 있다
	// 각 단어의 짝숸째 알파벳은 대문자로, 홀수번쨰 알파벳은 소문자로 바꾼 문자열 만들기 
		
		String s= "sp   ace";
		
		String temp="";
		String temp2="";
		String answer="";
		List<Character> sList= new ArrayList<>();
		
		for(int i=0;i<s.length();i++) {
			sList.add(s.charAt(i));
		}
		
		for(int i=0;i<sList.size()-1;i++) { // 연속되는 공백 제거하기
			
			if((int)sList.get(i)== 32 && sList.get(i)==sList.get(i+1)) {
				sList.remove(i+1);
				i--;
			}
		} // end of for-----------
		
	    for(int i=0;i<sList.size();i++) {
	    	temp+=sList.get(i);
	    }
	
		String[] tempArr= temp.split(" ");
		
		for(int i=0;i<tempArr.length;i++) {

			char[] eachStringArr= tempArr[i].toCharArray();
			for(int j=0;j<eachStringArr.length;j++) {
				
				if(j%2==0) { // 짝수에 위치한 경우
					temp2+=String.valueOf(eachStringArr[j]).toUpperCase();
				}
				else { // 홀수에 위치한 경우
					temp2+=String.valueOf(eachStringArr[j]).toLowerCase();
				}
			}
		
		} // end of for------------
		
		
		// 공백이 여러개 있으면 나중 결과물에서도 공백 개수대로 출력해주는 걸 고려해야 한다...
		char[] answerArr= new char[s.length()];
		int index=0;
		
		for(int i=0;i<answerArr.length;i++) {
			
			if((int)s.charAt(i)==32) { // 공백인 경우
				answerArr[i]=' ';
			}
			else { // 공백이 아닌경우
				answerArr[i]=temp2.charAt(index);
				index++;
			}
		} // end of for----------------
		
		
		answer= String.valueOf(answerArr);
		System.out.println(answer);
		
		
	}// end of main ----------------------
	
}
