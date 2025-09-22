package ch07.unit03;

/*
 	다중 스레드 환경에서는
 	동시성을 지원하는 StringBuffer는 안전
 	미지원하는 StringBuilder는 안전 x
 */
public class EX15 {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		new Thread(() -> {
			for (int i=0;i<10000; i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();
		
		new Thread(() -> {
			for (int i=0;i<10000; i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();
		
		new Thread(() -> {
			try {
				Thread.sleep(5000);
				
				System.out.println("StringBuffer: " + buffer.length());
				System.out.println("StringBuilder: " + builder.length()); 
			} catch (Exception e) {
			}
		}).start();
		
		
	}

}

