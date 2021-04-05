package level1;

public class level1_16 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12935
	// 문제명: 제일 작은 수 제거하기
		
	public static void main(String[] args) {
		
		// 정수를 저장한 배열 arr에서 가장 작은 수를 제거한 배열 리턴하기 (출력으로 확인해보기) => arr에는 중복된 값이 없다
		// 리턴하는 배열이 빈 배열이라면 -1을 채워서 리턴하기
		
		int[] arr= new int[] {10};
		
		// 정렬로 가장 작은 값 얻어오기 
		int smallest= arr[0];
		int smallest_index= 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest= arr[i];
				smallest_index=i;
			}
		} // end of for--------
				
		String s="";
		
		for(int i=0;i<arr.length;i++) {
		
			String comma= (i==0)?"":",";
			
			if(i!=smallest_index) {
				s+=comma+arr[i];
			}
		} // end of for--------
		
		int[] answer= {};
		if(!("".equals(s))) { // 빈문자열이 아니면
		
			String[] arr_s= s.split(",");
			answer= new int[arr_s.length];
			
			for(int i=0;i<answer.length;i++) {
				answer[i]= Integer.parseInt(arr_s[i]);
			}
			
		}// end of if-------
		
		else { // 빈문자열인 경우
			answer= new int[1];
			answer[0]=-1;
		}
		
		System.out.println(answer[0]);
	
	}// end of main ----------------------
	
}
