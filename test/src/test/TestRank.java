package test;

public class TestRank {

	public static void main(String[] args) {
		int h[] =  { 98, 70, 45, 60, 83 };
		int rank[] = new int[5];
		
		
		for(int i=0; i<h.length; i++) {
			rank[i] = 1;
			for(int j=0; j<h.length; j++) {
				if(h[i]<h[j])
					rank[i] += 1;
			}
		}
		for(int i=0; i<h.length; i++) {
			System.out.println("점수:" + h[i] + "\t" + "등수:" + rank[i]);
		}
	}
}

