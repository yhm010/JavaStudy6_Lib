package com.iu.s1.lang.string;

import java.util.Scanner;

import javax.swing.filechooser.FileNameExtensionFilter;

public class StringStudy1 {
	
	public void splitTest() {
		String name = "iu suji choa 펭수 춘식이";
		String [] names = name.split(" ");
		
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i].trim());
		}
		
		
	}
	

	public static void valueTest() {
		int num =1000;
		String result = String.valueOf(num);
		System.out.println(result);
	}
	
	public void castTest() {
		String title = "West Side Story";
		
		String tri = title.trim();
		System.out.println(tri);
		
		String tol = title.toLowerCase();
		System.out.println(tol); // 소문자
		
		String tou = title.toUpperCase();
		System.out.println(tou); // 대문자
		System.out.println(title); // 원본
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		// 참조변수명.멤버메서드명() 멤버메서드 사용하는 법
		String reslet = title.replace('S', 't');
		System.out.println(title);
		System.out.println(reslet);
	}

	public void subStringEx1() {
		//키보드로부터 업로드할 파일명을 입력
		// a.txt, b.pdf, iu.jpg
		// jpg, gif, png -> 이미지파일입니다 출력
		// txt, pdf, hwp -> 문서 파일입니다 출력
		// mp3, wav, ogg -> 음원 파일입니다 출력
		// 나머지는 알 수 없는 파일입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("업로드할 파일명을 입력해주세요.");
		String fileName = sc.next(); //abc.test.txt
		String result=fileName.substring(fileName.lastIndexOf("." )+1);
				System.out.println(result);
				
				if(result.equals("jpg") || result.equals("gif") || result.equals("png")) {
					System.out.println("이미지파일입니다.");
				}else if (result.equals("txt") || result.equals("pdf") || result.equals("hwp")) {
					System.out.println("문서파일입니다.");
				}else if(result.equals("mp3") || result.equals("wav") || result.equals("ogg")){
					System.out.println("음원파일입니다.");
				}else {
					System.out.println("알 수 없는 파일입니다.");
				}

					
	}

	public void SubStringTest() {
		String title = "West Side Story";
//		String result = title.substring(5); 
		String result = title.substring(title.indexOf("S"));
		System.out.println(result);
		result = title.substring(5, 8);
		System.out.println(result);
	}

	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);

		String find = "e";
		// title find에 들어가 있는 글자가 몇개 인지 출력 // 글자는 나중에 바뀔 수 있음
		int count = 0;
		for (int i = 0; i < title.length(); i++) {
			int index = title.indexOf(find, i);
			if (index >= 0) {
				count++;
				i = index;
			} else {
				break;
			}
		}
		System.out.println("Count : " + count);

		// 한글자씩 출력
		// w
		// e
//		//s
		for (int i=0;i<title.length();i++)
			System.out.println(title.charAt(i));
	}

	public void indexOfTest() {
		String msg = "Hello World";
		// indexOf 호출

		int num = msg.indexOf("o", 4 + 1); // int ch = 'W'
		System.out.println(num);
	}

	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println("==========================");
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str4));
		System.out.println(str.equals(str3));
	}

	public void study1() {
		String name = "hello"; // 'h' 'e' 'l' 'l' 'o'

		// charAt 메서드 호출 코드 작성
		int i = 1;
		char ch = name.charAt(i); // 문자열에서 문자 한개 꺼내달라는 것
		System.out.println(ch);

		String name2 = new String("hello2");
	}
}
