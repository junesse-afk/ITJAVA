package test;

public class Test3 {

	public static void main(String[] args) {
//		p506 사용자 정의 예외 
		Test3 test3 = new Test3();
		try {
			test3.setUserId(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 메서드 호출
		try {
			test3.setUserId("1234567");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	throws Exception : 메서드 호출한 곳에서 예외 미룸
	public void setUserId(String userId) throws Exception{
		if(userId == null) {
//			강제로 예외 발생 "아이디 null"
			throw new IDFormatException("아이디 null");
		}else if(userId.length() < 8 || userId.length() > 20) {
//			강제로 예외 발생 "아이디는 8자 이상 20자 이하로 사용"
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용");
		}
	}

}
