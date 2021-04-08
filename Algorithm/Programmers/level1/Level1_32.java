package level1;

public class Level1_32 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12933
	// 문제명: 정수 내림차순으로 배치하기
		
	public static void main(String[] args) {
		
		// 정수 n을 입력받아서 n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수 만들기 => n은 1이상
		long n= 1;
		long answer=0;
		char temp=' ';
		String nString= String.valueOf(n);
		
		char[] nStringArray= nString.toCharArray();
		
		if(nStringArray.length==1) {
			answer=n;
		}
		else {
	
			for(int i=0;i<nStringArray.length-1;i++) {
				for(int j=i+1;j<nStringArray.length;j++) {
					if(nStringArray[i]<nStringArray[j]) {
						temp= nStringArray[i];
						nStringArray[i]= nStringArray[j];
						nStringArray[j]= temp;
					}
				}
			}
			
			String sAnswer=String.valueOf(nStringArray);
			
			// answer은 long 타입이니까 Long.parseLong 사용해야 한다!!
			answer= Long.parseLong(sAnswer);
		} // end of else-------
		
		
		System.out.println(answer);
		
		
		
	}// end of main ----------------------
	
}
