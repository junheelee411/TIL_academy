package ch07.unit03;

public class EX09 {

	public static void main(String[] args) {
		
		String[] citys = {"서울", "부산", "인천", "광주", "대전", "울산", "세종"};
		
		write("source data: ", citys);
		
		sorting(citys);
		
		write("sort data: ",citys);
	}
	
	public static void write(String title, String[] ss) {
		System.out.println("title");
		for(String s : ss) {
			System.out.println(s + " ");
		}
		System.out.println();
	}
		public static void sorting(String[] ss){
			String t;
			boolean flag = true;
			
			for(int i=1;flag;i++) {
				flag=false;
				
				for(int j=0; j<ss.length-i;j++) {
					if(ss[j].compareTo(ss[j+1])>0){
						t=ss[j];
						ss[j] =ss[j+1];
						ss[j+1]=t;
						flag=true;
					}
				}
			}
			
		}
}

