package level1;

import java.util.*;

public class level1_3 {
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/42840
// 문제명: 모의고사
	
	public static void main(String[] args) {
	
		// 주어진 시험문제 정답을 가장 많이 맞춘 사람 구하기
		// 수정1) 사람별 try-catch 구문을 각각 for문별 try-catch 구문으로 수정
		
		
		int[] answers= new int[]{1,1};  // answer 배열의 값과 길이는 달라지므로 변수로 풀이하기
		int[] person_1=new int[answers.length];
		int[] person_2=new int[answers.length];
		int[] person_3=new int[answers.length];
		List<Integer> person= new ArrayList<>();
		
		// 1번 수포자가 찍는 방식
		try {
			for(int i=0;i<answers.length;i+=5) { 
				person_1[i]=1;
			}
		}catch(Exception e) {}
		try {
			for(int i=1;i<answers.length;i+=5) {
				person_1[i]=2;
			}
		}catch(Exception e) {}	
		try {	
			for(int i=2;i<answers.length;i+=5) {
				person_1[i]=3;
			}
		}catch(Exception e) {}
		try {	
			for(int i=3;i<answers.length;i+=5) {
				person_1[i]=4;
			}
		}catch(Exception e) {}	
		try {	
			for(int i=4;i<answers.length;i+=5) {
				person_1[i]=5;
			}
		}catch(Exception e) {}	
		
		
		// 2번 수포자가 찍는 방식
		try {
			for(int i=0;i<answers.length;i+=2) {
				person_2[i]=2;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=1;i<answers.length;i+=8) {
				person_2[i]=1;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=3;i<answers.length;i+=8) {
				person_2[i]=3;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=5;i<answers.length;i+=8) {
				person_2[i]=4;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=7;i<answers.length;i+=8) {
				person_2[i]=5;
			}
		} catch(Exception e) {}
		
		// 3번 수포자가 찍는 방식
		try {
			for(int i=0;i<answers.length;i+=10) {
				person_3[i]=3;
				person_3[i+1]=3;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=2;i<answers.length;i+=10) {
				person_3[i]=1;
				person_3[i+1]=1;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=4;i<answers.length;i+=10) {
				person_3[i]=2;
				person_3[i+1]=2;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=6;i<answers.length;i+=10) {
				person_3[i]=4;
				person_3[i+1]=4;
			}
		} catch(Exception e) {}	
		try {	
			for(int i=8;i<answers.length;i+=10) {
				person_3[i]=5;
				person_3[i+1]=5;
			}
		} catch(Exception e) {}
		 
		
		// 채점하기
		int score_1=0;
		int score_2=0;
		int score_3=0;
		
		for(int i=0;i<answers.length;i++) {
			
			if(answers[i]==person_1[i]) {
				score_1++;
			}
			if(answers[i]==person_2[i]) {
				score_2++;
			}
			if(answers[i]==person_3[i]) {
				score_3++;
			}
		}
		
		// score_1 , score_2, score_3 비교
		if(score_1>score_2 && score_1>score_3) {
			person.add(1);
		}
		else if(score_1<score_2 && score_2>score_3) {
			person.add(2);
		}
		else if(score_3>score_1 && score_3>score_2) {
			person.add(3);
		}
		else if(score_1==score_2 && score_1>score_3) {
			person.add(1);
			person.add(2);
		}
		else if(score_1==score_3 && score_1>score_2) {
			person.add(1);
			person.add(3);
		}
		else if(score_2==score_3 && score_1<score_3) {
			person.add(2);
			person.add(3);
		}
		else if(score_1==score_2 && score_1==score_3) {
			person.add(1);
			person.add(2);
			person.add(3);
		}
		
		int[] answer= new int[person.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=person.get(i);
		}
		
		System.out.println(score_1);
		System.out.println(score_2);
		System.out.println(score_3);
		System.out.println(answer[1]);
	}// end of main ----------------------
	
}
