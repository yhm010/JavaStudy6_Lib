package com.iu.s4.exception;

import java.util.InputMismatchException;

public class ExceptionMain3 {

	public static void main(String[] args) {
		ExStudy1 e1 = new ExStudy1();
		try {
		e1.ex1(); // 호출한 쪽에서 try catch 사용함.
		}catch(ArithmeticException e) {
		}catch(InputMismatchException e){	
		}catch(Exception e) {
		}
	}

}
