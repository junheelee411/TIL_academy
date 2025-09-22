package ch07.unit03;

public class Quiz04 {

	public static void main(String[] args) {

		Bank obj= new Bank();
		
		System.out.println(obj.generateAccountNo()); //020-08-0000171
		System.out.println(obj.generateAccountNo()); //020-08-0000172
		System.out.println(obj.generateAccountNo()); //020-08-0000173
	}

}

class Bank{
	private String accountNo = "020-08-0000170";
	
	public String generateAccountNo() {
		String s1 = accountNo.substring(0,accountNo.lastIndexOf("-") + 1);
		String s2 = accountNo.substring(accountNo.lastIndexOf("-") + 1);
	
		// 공백이나 , 있는 string -> Int로 바꿀 수 없음
		
		System.out.println(s1);
		System.out.println(s2);
		
		int n= Integer.parseInt(s2)+1;
		accountNo = s1 + String.format("%07d",n);
		
		return accountNo;
	}
}
