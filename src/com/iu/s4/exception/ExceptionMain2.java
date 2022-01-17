package com.iu.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {

		int num1=0;
		int num2=10;
		
		try {
		int result = num2/num1;
		}catch(Exception exception) {
			// 세부적인 컨트롤 작성은 어려움 원인이 뭔지 알아야함
			exception.printStackTrace(); // 원인 파악하는법, catch 하고 비워두지 말고 이 부분 꼭 쓰기
			
		}
	}

}
