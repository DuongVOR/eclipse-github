package chuong2;

public class Students {
	protected String name;
	protected int score;

	public Students() {
		super();
	}

	public Students(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

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

	@Override
	public String toString() {
		return "Studens [name=" + name + ", score=" + score + "]";
	}

}
