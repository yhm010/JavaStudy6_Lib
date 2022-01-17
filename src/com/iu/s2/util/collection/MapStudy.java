package com.iu.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
	
	public void study1() {
		//HashMap
		HashMap<String, Integer> map = new HashMap<>(); // k는 개발자가 넣음. 데이터타입 v는 넣고싶은 레퍼런스타입
		
		//put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 1);
		
		System.out.println(map);
		
		Integer num = map.get("f2");
		System.out.println(num);
		
		map.remove("f3");
		System.out.println(map);
		
		map.put("f1", 100);
		System.out.println(map);
		
		//없는 키로 꺼내면 null이 나옴.
		Integer n = map.get("test");
//		int n = map.get("test"); // int 때문에 에러남
		System.out.println("N :" + n);
		
		String name ="K5";
		map.put(name, null); // 변수 형태로 가능 null도 가능
		System.out.println(name);
		
		map.clear();
		
		System.out.println(map);
	}

}
