package test;

public class Sungjuk {

	public static void main(String[] args) {
		String hakName[] = {"쥐", "소", "호랑이", "토끼", "용"};
		int hakGuk[] = { 40, 74, 90, 60, 83 };
		int hakEng[] = { 35, 72, 95, 65, 82 };
		int hakMat[] = { 50, 70, 92, 62, 81 };
		double hakAvg[] = new double[5];
		int hakGrade;
		char myGrade[] = new char[5];
		int hakSum[] = new int[5];
		int hakRank[] = new int[5];
		
		System.out.println("                             성    적    표                 ");
		System.out.println("=======================================================================");
		System.out.println("   " + "번호" + "\t" + "이름" + "\t" +"국어" +"\t" +
				"영어" + "\t" + "수학" + "\t" + "총점"+ "\t" + "평균" + "\t" + "학점"+ "\t" + "등수");
		System.out.println("=======================================================================");
		
		for(int i=0; i<hakGuk.length; i++) {
			
			hakSum[i] = hakGuk[i] + hakEng[i] + hakMat[i];
			hakAvg[i] = (double)hakSum[i]/3;
			
			hakGrade = (int)hakAvg[i]/10;
			switch(hakGrade)
			{
			case 10:
			case 9: 
				myGrade[i] = 'A';
				break;
			case 8:
				myGrade[i] = 'B';
				break;
			case 7:
				myGrade[i] = 'C';
				break;
			case 6:
				myGrade[i] = 'D';
				break;
			default:
				myGrade[i] = 'F';
			}	
				
		}

		for(int i=0; i<hakGuk.length; i++) {
			hakRank[i] = 1;
			for(int j=0; j<hakGuk.length; j++) {
				if(hakSum[i]<hakSum[j])
					hakRank[i] ++;
			}
		}
		for(int i=0; i<hakGuk.length; i++) {
			System.out.println("   " + (i+1) + "\t" + hakName[i] +"\t" + hakGuk[i] + "\t" + hakEng[i] 
								+ "\t" + hakMat[i] + "\t" + hakSum[i] +"\t" 
								+ Math.round(hakAvg[i]*10)/10.0 + "\t" + myGrade[i] + "\t" + hakRank[i]);
		
		}
	
	}	
}
