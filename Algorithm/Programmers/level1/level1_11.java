package level1;

public class level1_11 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12944
	// 문제명: 평균 구하기
		
		public static void main(String[] args) {
		
			// 주어진 정수배열 arr의 평균값 출력하기
			
			int[] arr= new int[] {1,2,3,4};
			int sum=0;
			int len= arr.length;
			
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			
			// avg가 정수인 경우 정수로 나타내기
			// avg가 실수인 경우 실수로 나타내기 
			
			if(sum%len==0) { // answer이 정수인경우
				int answer=sum/len;
				System.out.println(answer);
			}
			else { // answer이 실수인경우
				double answer=sum/(double)len;
				System.out.println(answer);
			}
			
			
	}// end of main ----------------------
	
}
