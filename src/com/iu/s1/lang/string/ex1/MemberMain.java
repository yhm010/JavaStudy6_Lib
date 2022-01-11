package com.iu.s1.lang.string.ex1;

public class MemberMain {

	public static void main(String[] args) {
		// test, 프로그램 실행
		MamberDate memberDate = new MamberDate();
		MemberDTO [] members= memberDate.init();

		for(int i=0;members.length;i++) {
			System.out.println(members[i].getId());
			System.out.println(members[i].getPw());
			System.out.println(members[i].getName());
			System.out.println(members[i].getEmail());
			System.out.println("======================");
		}
	}

}
