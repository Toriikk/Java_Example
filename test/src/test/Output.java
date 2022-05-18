package test;

public class Output {

	public static void main(String[] args) {
		int kuk[] = { 98, 70, 45, 60, 83 };
		int eng[] = { 98, 70, 45, 60, 83 };
		int mat[] = { 98, 70, 45, 60, 83 };
		int sum[] = new int[5];
		double avg[] = new double[5];
		int max = 0;
		int min = 999;
		String[] name = { "김", "이", "박", "한", "최" };
		int rank[] = new int[5];
		char grade[] = new char[5];
		
		
		for(int i=0; i<name.length; i++) {
			sum[i] += kuk[i] + eng[i] + mat[i];
			avg[i] = (double)sum[i]/3;
			
			if(sum[i]>max) max = sum[i];
			if(sum[i]<min) min = sum[i];		
			
			switch(kuk[i]/10)
			{
			case 10:
			case 9: 
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
	}

}
		for(int i=0; i<name.length; i++) {
			rank[i] = 1;
			for(int j=0; j<name.length; j++) {
				if(sum[i]<sum[j])
					rank[i] ++;
			}
		}
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t등급\t등수\t평균");
		System.out.println("-------------------------------------------------------------------");
		for(int i=0; i<name.length; i++)
			System.out.println((i+1) + "\t" + name[i] + "\t" + kuk[i] + "\t" +
		eng[i] + "\t" + mat[i] + "\t" + sum[i] + "\t" + grade[i] + "\t" + rank[i] + "\t" + avg[i]);
	}
	
	
}
