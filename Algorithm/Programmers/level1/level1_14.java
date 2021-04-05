package level1;

import java.util.Scanner;

public class level1_14 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12969
	// 문제명: 직사각형 별찍기
		
	public static void main(String[] args) {
		
		// 두개의 정수 a과 b이 주어진다
		// 별(*)문자로 가로길이가 a, 세로길이가 b인 직사각형 형태를 출력하기
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 가로길이
        int b = sc.nextInt();  // 세로길이

        
        for(int i=0; i<b;i++) { // 세로길이
        	String star=""; // 초기화
        	for(int j=0;j<a;j++) { // 가로길이
        		star+="*";
        	}
        	System.out.println(star);
        }
        
	}// end of main ----------------------
	
}
