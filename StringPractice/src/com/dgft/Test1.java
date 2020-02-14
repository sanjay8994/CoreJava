package com.dgft;

public class Test1 {

	public static void main(String[] args) {

		String st = "ABC";
		String st1 = "ABC";
	
		String st2= st1 +"XYZ"; // object will created in heap
		String st3= "ABCXYZ";

		String st4= st +"abc";

		System.out.println("111"+(st1==st2)); //false
		System.out.println("222"+(st2==st3)); //false
		System.out.println("333"+(st2.equals(st3))); //true
		System.out.println("444"+ (st==st1));//true
		System.out.println("555"+ (st.equals(st1))); //true

	}

}
