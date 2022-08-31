package jinsu;
// 선생님과 함께 하는 진수 변환 
public class Binary {

	public static void main(String[] args) {
		int num = 35;
		int cnt = 0; // cnt = count
		int[] bin = new int[15];
		
		while(num >= 1) {   // 2진수 연산
			bin[cnt] = num%2;
			cnt++;
			num = num/2;
		}
		
		for(int i=cnt-1 ; i>=0; i--) {  // 2진수 출력
			System.out.print(bin[i]);
		}
	}

}
