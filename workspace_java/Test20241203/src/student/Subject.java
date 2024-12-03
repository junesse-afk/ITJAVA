package student;

public class Subject {
//	멤버변수 name, score 과목이름, 점수
	private String name;
	private int score;
	
//	set,get 메서드 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
