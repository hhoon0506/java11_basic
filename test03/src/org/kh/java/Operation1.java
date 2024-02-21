package org.kh.java;


// 입력 항에 따라 : 단항 ,이항 ,삼항
public class Operation1 {
  public static void main(String[] args) {
	boolean b1 = true;
	int i1= 20, i2 = 40;
	int max = (i1 > i2) ? i1 : i2;
	System.out.println("max :"+max);
}
}
