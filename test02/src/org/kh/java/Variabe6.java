package org.kh.java;

public class Variabe6 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14;
			int kor= 90, eng= 80, mat= 90;
			//float avg = (kor+eng+mat)/3;
			//float avg = (float)(kor+eng+mat)/3; 방법1
			float avg = (kor+eng+mat)/3.0f;//방법2 
				System.out.printf("\nf1=%.3f", f1);
				System.out.printf("\n 평균: %.2f",avg);
	}
}
