package ch12.unit05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/*
 	fileInputstream
 	- 파일 입력 byte stream
 	- 파일이 존재하지 않으면 FileNotFoundException이 발생
 */

public class EX08 {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		String pathname = "subject2.properties";
		
		try (FileInputStream fis = new FileInputStream(pathname)){
			p.load(fis); // 파일의 내용을 읽어 Properties에 저장
			
			p.list(System.out);
			
			String s = p.getProperty("자바");
			System.out.println("자바 : " + s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
