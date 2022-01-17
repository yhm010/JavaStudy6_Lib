package com.iu.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력");
		int num = 200;
		try {
			int age = sc.nextInt(); // ten
			
			int result = num/age;
			
			System.out.println("Age : " + age);
			System.out.println("Result " + result);
		}catch (InputMismatchException excepiton) {
			System.out.println("숫자만 입력하세요.");
		}catch(ArithmeticException exception) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(Exception exception) {
			System.out.println("알수없는 예외 발생");
		}catch(Throwable exception) {
			System.out.println("모든 예외는 여기서 처리");
			// 세세하게 알 수 있음
		}
	}

}
