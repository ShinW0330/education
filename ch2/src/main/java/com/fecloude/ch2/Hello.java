package com.fecloude.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 1.프로그램 등록
public class Hello {
	int iv = 10;
	static int cv =20;
	
	@RequestMapping("/hello") //2. URL과 main() 을 연결 
	public void main(String[] args) { // 인스턴스 메서드 - iv, cv 둘다 사용가능
		System.out.println("Hello");
		System.out.println(cv); // OK
		System.out.println(iv ); // OK
		
	}
	
	public static void main2 () {
		// System.out.println(iv); // 오류
		System.out.println(cv); // OK
	}

}
