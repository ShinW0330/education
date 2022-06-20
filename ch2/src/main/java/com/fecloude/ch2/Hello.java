package com.fecloude.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 1.프로그램 등록
public class Hello {
	int iv = 10;
	static int cv =20;
	
	
	// private 에서도 호출은 가능하다. @RequestMapping 으로 URL과 연결을 한다는 것은 이 메서드를 웹에서 호출 가능하도록 하겠다는 의미
	// 그렇기 떄문에 접근제어자 상관 없이 호출이 가능하다. 
	// 하지만 접근 제어자 private를 사용하였기 때문에 이 class 안에서 는 적용이 가능하다. 
	@RequestMapping("/hello") //2. URL과 main() 을 연결  
	private void main(String[] args) { // 인스턴스 메서드 - iv, cv 둘다 사용가능
		System.out.println("Hello - private");
		System.out.println(cv); // OK
		//System.out.println(iv ); // OK`
		
	}
	
	public static void main2 () {
		// System.out.println(iv); // 오류
		System.out.println(cv); // OK
	}

}
