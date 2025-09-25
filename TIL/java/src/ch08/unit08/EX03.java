package ch08.unit08;

public class EX03 {

	public static void main(String[] args) {
		HttpStatus status = HttpStatus.fromCode(200);
		System.out.println("Status : " + status);
		
		//status = HttpStatus.fromCode(405) 런타임 에러

	}

}

enum HttpStatus{
	OK(200),
	NOT_FOUND(404),
	INTERNAL_SERVER_ERROR(500);
	
	private final int code;
	
	HttpStatus(int code){
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static HttpStatus fromCode(int code) {
		for(HttpStatus status : HttpStatus.values()) {
			if(status.code == code) {
				return status;
			}
		}
		
		// code가 존재하지 않으면 IllegalArgumentException 런타임 예외 발생
		throw new IllegalArgumentException("Invalid HTTP status code: " + code);
	}
}