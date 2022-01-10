package com.iu.s1.lang.object;

public class ObjectStudy1 {
	// 생성자가 없으면 컴파일러가 기본생성자를 만들어줌
	// 기본생성자는 매개변수가 없는 생성자

	public void study1() {
		System.out.println("Study  실행");

		// Object 객체를 생성하고 주소출력
		// 클래스명(=데이터타입) 참조변수명 = new 클래스명();
		Object obj = new Object();
		System.out.println(obj);
		// 클론 호출하고 결과물 받아서 출력
		// 참조변수명.멤버
		int num = obj.hashCode();
		System.out.println(num);
		
		String str = obj.toString();
		System.out.println(str);
	}

}
