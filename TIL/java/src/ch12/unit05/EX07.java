package ch12.unit05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class EX07 {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		p.setProperty("자바", "95");
		p.setProperty("서블릿", "85"); 
		p.setProperty("스프링", "90");
		p.setProperty("오라클", "95"); 
		p.setProperty("HTML", "80");
		
		// prorperties에 저장된 내용을 파일에 저장
		// FileOutputStrea : 파일 출력 바이트 스트림
		String pathname = "subject.properties";
		try (FileOutputStream fos = new FileOutputStream(pathname)){
			p.store(fos, "과목별 성적");
			// 영문자와 숫자를 제외하고는 유니코드로 저장
			System.out.println("파일 저장 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
