package com.fecloude.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 1.���α׷� ���
public class Hello {
	int iv = 10;
	static int cv =20;
	
	
	// private ������ ȣ���� �����ϴ�. @RequestMapping ���� URL�� ������ �Ѵٴ� ���� �� �޼��带 ������ ȣ�� �����ϵ��� �ϰڴٴ� �ǹ�
	// �׷��� ������ ���������� ��� ���� ȣ���� �����ϴ�. 
	// ������ ���� ������ private�� ����Ͽ��� ������ �� class �ȿ��� �� ������ �����ϴ�. 
	@RequestMapping("/hello") //2. URL�� main() �� ����  
	private void main(String[] args) { // �ν��Ͻ� �޼��� - iv, cv �Ѵ� ��밡��
		System.out.println("Hello - private");
		System.out.println(cv); // OK
		//System.out.println(iv ); // OK`
		
	}
	
	public static void main2 () {
		// System.out.println(iv); // ����
		System.out.println(cv); // OK
	}

}
