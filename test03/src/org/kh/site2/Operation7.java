package org.kh.site2;
//대입 연산자 :연산 후에 대입하는 연산자 +=,-=,*=,/=,%=,&=,|=,>>=,<<=,>>>=,^=
//비트 연산자 :& | ~ ^ >> <<
public class Operation7 {

	public static void main(String[] args) {
		int a = 20;
		int b= 15;
		int c;
		a += b;
		b -= a;
		c = a;
		a = b;
		b = c;
		
		System.out.println();
		//비트 (2진수) 연산
		int x =0b01101;
		int y =0b01011;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x & y)); // & 하나만 쓰면 비트 연산자
		System.out.println(Integer.toBinaryString(x | y));
		System.out.println(Integer.toBinaryString(x ^ y)); //xor
		System.out.println(Integer.toBinaryString(~x));
		System.out.println(Integer.toBinaryString(x >> 2));
		System.out.println(Integer.toBinaryString(x << 5));
		
		System.out.println("********** 대입 연산자");
		
		int num = 8;
		
		System.out.println(num += 10);
		
		
	}

}
