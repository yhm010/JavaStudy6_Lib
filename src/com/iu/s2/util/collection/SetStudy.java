package com.iu.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it= hs.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
	}

	public void study3() {
		Random random = new Random();

		// HashSet 사용해서 겹치는거 없도록 해보기
		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() != 6) {
			int num = random.nextInt(45) + 1;
			hs.add(num);

		}

//		for(int i=0;i<6;i++) {
//			int num = random.nextInt(45)+1; // 0~10 미만의 랜덤 수 뽑아줌
//			hs.add(num);
		System.out.println(hs);

	}

	public void study2() {
		Random random = new Random();

		// Lotto번호 랜덤 1~45번 6개를 모두 뽑고 List에 담아서
		ArrayList<Integer> ar = new ArrayList<>(); // 이거 쓰고도 중복 안되는거 고민해보기! 11:11

		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1; // 0~10 미만의 랜덤 수 뽑아줌
			ar.add(num);
		}

		System.out.println(ar);
		// 1부터 45 나오는지 확인하고 6개 나오도록
		// 한꺼번에 출력

	}

	public void study1() { // 메서드 하나 만듬
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1); // 중복데이터허용하지않음.
		hs.remove(2);

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(100); // 중복데이터허용

		System.out.println(hs);
		System.out.println(hs.size());

		System.out.println(ar);
		System.out.println(ar.size());
	}

}
