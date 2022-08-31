package octal;

public class Octal {
	static final int JINSUNUM = 8;  // 기호상수 이용 
	
	public static void main(String[] args) {
		
		int num = 8;
		int cnt = 0; // cnt = count
		int[] bin = new int[15];
		
		while(num >= 1) {   // 8진수 연산
			bin[cnt] = num%JINSUNUM;
			cnt++;
			num = num/JINSUNUM;
		}
		
		for(int i=cnt-1 ; i>=0; i--) {  // 8진수 출력
			System.out.print(bin[i]);
		}
	}

}

