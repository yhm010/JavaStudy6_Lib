package com.iu.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.iu.s3.ex1.mamber.MemberDTO;

public class StudentDate {
	
	private Scanner sc;
	
	public StudentDate() { // 생성자 메서드 만듦
		sc= new Scanner(System.in);
	}
	
	
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		// 키보드로부터 member의 수만큼 성적 정보 입력
		// 이정보들을 MemberData에 있고 그 정보를 받아서 StudentDTO (객체)에 id 이름을 채워서
		// map의 키는 id
		
		HashMap<String, StudentDTO> map = new HashMap<>();
		
			for(int i=0;i<ar.size();i++) {
				
				StudentDTO studentDTO = new StudentDTO();
				//id
				System.out.println("ID 입력");
				studentDTO.setId(ar.get(i).getName());
				//name
				System.out.println("이름 입력");
				studentDTO.setName(ar.get(i).getName());
				System.out.println("국어 성적 입력");
				studentDTO.setKor(sc.nextInt());
				System.out.println("영어 성적 입력");
				studentDTO.setEng(sc.nextInt());
				System.out.println("수학 성적 입력");
				studentDTO.setMath(sc.nextInt());
				//총점
				System.out.println("총점 입력");
				studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
				//평균
				System.out.println("평균 입력");
				studentDTO.setAvg(studentDTO.getTotal()/3.0);
				
				// map에 추가
				map.put(studentDTO.getId(), studentDTO);
			}
			return map;

		
	}

}
