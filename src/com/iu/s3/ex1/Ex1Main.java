package com.iu.s3.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.iu.s3.ex1.mamber.MemberDTO;
import com.iu.s3.ex1.mamber.MemberData;
import com.iu.s3.ex1.student.StudentDTO;
import com.iu.s3.ex1.student.StudentDate;

public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		StudentDate studentDate = new StudentDate();
		
		//회원들의 정보 모음
	ArrayList<MemberDTO> ar = memberData.init();
	Map<String, StudentDTO> map= studentDate.addStudent(ar);
	Set<String> keys = map.keySet();
	Iterator<String> k= keys.iterator();
	
	while(k.hasNext()) {
		String key = k.next();
		StudentDTO studentDTO = map.get(key);
		System.out.println("Key :" + key);
		System.out.println(studentDTO.getId());
		System.out.println(studentDTO.getName());
		System.out.println(studentDTO.getKor());
		System.out.println(studentDTO.getEng());
		System.out.println(studentDTO.getMath());
		System.out.println(studentDTO.getTotal());
		System.out.println(studentDTO.getAvg());
	}
	
	System.out.println(map);
	
	StudentDate a = new StudentDate();
	a.addStudent(ar);
	}

}
