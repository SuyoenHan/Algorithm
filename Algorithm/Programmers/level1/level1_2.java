package level1;

import java.util.*;

public class level1_2 {
// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/42748
// 문제명: k번째수	
	
	public static void main(String[] args) {
		
		// 1차원 배열에서 i번째부터 j번째까지 추출 => 오름차순 정렬 => k번째에 위치한 숫자 구해서 배열로 출력
		
		int[] array= new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= new int[][] {{2,5,3},{4,4,1},{1,7,3}}; // {{i,j,k},{i,j,k},{i,j,k}}
		// i번째, j번쨰, k번째 수 구하기
		
		int first=0;
		int second=0;
		int third=0;
		int len= commands.length;
		
		int[] result= new int[len];
		List<Integer> arraySplit;
		
		for(int i=0;i<commands.length;i++) {
			arraySplit= new ArrayList<>();
			
			for(int j=0;j<commands[i].length;j++) {
				
				if(j==0) {
					first= commands[i][j];
				}
				else if(j==1) {
					second= commands[i][j];
				}
				else {
					third= commands[i][j];
				}
			}
			
			for(int k=first-1;k<second;k++) {
				arraySplit.add(array[k]);
			}
			
			Collections.sort(arraySplit);
			result[i]=arraySplit.get(third-1);
		}
		
		System.out.println(result);
		
	}// end of main ----------------------
	
}
