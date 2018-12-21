package gms21;

public class SubjectBean {
	private String subjName,profName;
	int score;
	
	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getProfName() {
		return profName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
