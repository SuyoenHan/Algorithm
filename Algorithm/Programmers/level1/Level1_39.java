package level1;

public class Level1_39 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12977
	// 문제명: 소수 만들기
		
	public static void main(String[] args) {
		
		// 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수 구하기
		// 숫자들이 들어있는 배열 nums에서 서로 다른 3개의 수를 골라야 한다 (3-50개 이하의 수로 구성되며 중복된 수는 없다)
		
		int[] nums= new int[] {1,2,7,6,4};
		int sum= 0;
		boolean primeFlag= false;
		int answer= 0;
		
		for(int i=0;i<nums.length-2;i++) { // 첫번째 수
			for(int j=i+1;j<nums.length-1;j++) { // 두번째 수
				for(int k=j+1;k<nums.length;k++) {
					sum=nums[i]+nums[j]+nums[k];

					for(int divisor=2;divisor<=sum/2;divisor++) {
						if(sum%divisor==0) {  // 소수가 아닌경우
							primeFlag=true;
							break;
						}
					} // end of for---------------------------
					
					if(!primeFlag) { // 소수인 경우
						answer++;
					}
					
					primeFlag=false; //초기화
				}
			}
		} // end of for---------------------------
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
