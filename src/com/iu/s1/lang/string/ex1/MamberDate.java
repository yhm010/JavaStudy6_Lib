package com.iu.s1.lang.string.ex1;

import java.lang.reflect.Member;

public class MamberDate {

	private String date;
	private String[] datas;

	// 기본 생성자 선언
	public MamberDate() {
		this.date = "id1-pw1-name1-id1@gmail.com-";
		this.date = this.date + "id2 - pw2 - name 2 - name2@naver.com-";
		this.date = this.date + "id3 - pw3 - name 3 - name3@daum.nat";
		System.out.println(this.date);
	}

	public MemberDTO[] init() {
		// this.date
		// 분리해서 멤버DTO에 값으로 배열에 집어넣음.

		String[] dates = this.date.split("-");

		MemberDTO[] members = new MemberDTO[3];
		
		int index=0;

		for (int i = 0; i < 3; i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(datas[index]); // datas[0] 4 8
			memberDTO.setPw(datas[++index]); // datas[1] 5 9
			memberDTO.setName(datas[++index]); // datas[2] 6 10
			memberDTO.setEmail(datas[++index]); // datas[3] 7 11
			members[i] = memberDTO;
			index++;

		}
		return members;

	}

}// 클래스 끝
