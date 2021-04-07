package level1;

public class Level1_26 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12954
	// 문제명: x만큼 간격이 있는 n개의 숫자
		
	public static void main(String[] args) {
		
	// 정수 x와 자연수 n을 입력받아 x부터 시작해 x씩 증가하는 숫자를 n개만큼 배열로 나타내기
		
		int x= -4;
		int n= 2;
		
		long x1= x;
		int temp= x;
		long[] answer= new long[n];   // 배열에 long값이 들어갈수 있으므로 x를 long으로 형변환 
		for(int i=0;i<answer.length;i++) {
			answer[i]=x1;
			x1+=temp;	
		}
		
		System.out.println(answer[1]);
		
	}// end of main ----------------------
	
}
