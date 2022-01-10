package com.iu.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		
	ObjectStudy1 objectStudy1 = new ObjectStudy1();
	// 참조변수 : 객체를 가리키는 주소를 담고 있는 변수
	// 참조변수명.메서드명. // 참조변수명.멤버
	objectStudy1.study1(); // 호출하는 법
	
	Car car = new Car();
	System.out.println("Car : "+car);
	System.out.println(car.toString());
	
	Object obj = car;
	boolean a = car.equals(obj);
		System.out.println(a);
	
	}

}
