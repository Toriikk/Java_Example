package test;
// 총점 평균 최고점수 최저점수 
public class TestMaxMin {

	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] { 98, 70, 45, 60, 83 };
		
		int sum = 0; 
		int max = 0;
		int min = 100; 
		
		for(int i=0; i<5; i++) {
			sum += scores[i];
			
			if(scores[i]>max) 
				max = scores[i];
			if(scores[i]<min) 
				min = scores[i];	
		}
		double avg = (double) sum/5;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + Math.round(avg*10)/10.0);
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		
		
	}

}
