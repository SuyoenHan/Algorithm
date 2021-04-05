package level1;

public class level1_12 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12950
	// 문제명: 행렬의 덧셈
		
	public static void main(String[] args) {
		
		// 주어진 2개의 행렬 arr1과 arr2를 입력받아, 같은행 같은열의 값을 서로 더한 행렬 출력하기
		
		int[][] arr1= new int[][] {{1,2},{2,3}}; 
		int[][] arr2= new int[][] {{3,4},{5,6}};
		
		int row= arr1.length;
		int col= arr2[0].length;
		
		int[][] answer= new int[row][col];
		
		
		for(int i=0;i<arr1.length;i++) { // 행 반복문
			
			for(int j=0;j<arr1[0].length;j++) { // 열 반복문
				answer[i][j]=arr1[i][j]+arr2[i][j];
			}
		}// end of for-----
		
		System.out.println(answer[0][0]);
		System.out.println(answer[0][1]);
		System.out.println(answer[1][0]);
		System.out.println(answer[1][1]);
		
		
	}// end of main ----------------------
	
}
