package level1;

public class Level1_37 {
	
	// 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/courses/30/lessons/12921
	// 문제명: 소수찾기
		
	public static void main(String[] args) {
		
		// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수 구하기 
		// 소수는 1과 자기 자신으로만 나누어지는 수를 의미하며 1은 소수가 아니다
		
		// 효율성 개선을 위해 에라토스테네스의 체 방법 이용 => O(n)
		/* 2 이외의 2의 배수를 지우고, 3 이외의 3의 배수를 지우고, 5이외의 5의 배수를 지우고 .... */
		
		int n=10;
		int answer=-1;  // 1은 소수가 아니므로 
		boolean[] primeArray= new boolean[n]; // default값은 false
		
		for(int i=2;i*i<n;i++) {
			for(int j=2;i*j<=n;j++) {
				primeArray[(i*j)-1]=true;
				    //인덱스번호와 값 일치시키기 위함
			}
		}
		
		for(int i=0;i<primeArray.length;i++) {
			if(primeArray[i]== false) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}// end of main ----------------------
	
}
