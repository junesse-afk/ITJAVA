
public class Test6 {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
//		s1.name = "차동원";
//		s1.score = 98273732;
		
		s1.setScore(98273732);
		
//		$("#id").val("ashdahbsvehabhe");
		
//		System.out.println(s1.name + ": " + s1.score);
//		System.out.println(s2.name + ": " + s2.score);
	}
}

class Student {
	private String name;
	private int score;
	
	public void setScore(int score) {
		
		if (score < 0 || score > 100) {
			System.out.println("이상한 거 자꾸 넣을래>??");
		}
		
//		return;
		score = 0;
		this.score = score;
	}
}


