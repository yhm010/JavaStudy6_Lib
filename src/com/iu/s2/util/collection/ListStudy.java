package com.iu.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	public void Study3() {
		
//		ArrayList<E> ar3 = new ArrayList<E>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		ar2.add(1);
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("a");
		
		//<> : generic - 제네릭
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1); // int
		ar.add(2);
//		ar.add('b'); //char
//		ar.add(3.12); //double
//		ar.add("iu");//string
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
//		Object abj = 1;
//		obj = "iu";
//		int n = (Integer)obj;
		
		int num = ar.get(0);
//		String name = (String)ar.get(3);
	}
	
	public void Study2() {
		ArrayList ar = new ArrayList();
		int num =1;
		Integer n  = num; //artoBoxing 다형성
		ar.add(num);
		ar.add(1); //artoBoxing 다형성
		
		ar.add('a'); // artoBoxing 다형성
		
		ar.add(3.12);// artoBoxing 다형성
		
		ar.add("name"); // 다형성
		
		String k = "iu"; //String is a Object
		Object obj = k; // 다형성
	}
	public void Study1() {
		
		int [] numbers = new int [3];
		ArrayList ar = new ArrayList(); // 기본 10칸
		
		//배열
		numbers[0]=1;
		numbers[1]=2;
		
		ar.add(1); //0
		ar.add(2); //1
		ar.add(3); //2
		ar.add(1, 100);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();
		
//		System.out.println(numbers[0]); // 배열 꺼내는법
//		System.out.println(ar.get(0)); // add 꺼내는법
		
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("List 출력");
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
