package com.iu.s3.ex1;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		//증감연산자
		// ++ i 선행  : 나 자신(i)을 먼저 실행(++) 
		// i ++ 후행  : 나 자신(i)를 젤 나중에 실행(++)
		// 단독으로 사용할 때는 차이가 없음
		//
		int num=0;
		++num; //num=1
		num++; //num=2
		
		System.out.println(num++);// 2, num=3
		System.out.println(++num);// num=4, 4
		
		
		
		
		
		
		
		
		
		
		//test, 프로그램 실행
		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> members = memberData.init();
		
		//memberData.addMember(members);
		MemberDTO memberDTO = memberData.removeMember(members);
		if(memberDTO != null) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		for(int i=0;i<members.size();i++) {
			System.out.println(members.get(i).getId());
			System.out.println(members.get(i).getPw());
			System.out.println(members.get(i).getName());
			System.out.println(members.get(i).getEmail());
			System.out.println(members.get(i).getAge());
			System.out.println("================");
		}
		

	}

}