package card;

public class CardBean {
	private String kind;
	private int number;
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString(String kind,int number) {
		// TODO Auto-generated method stub
		return String.format("[카드] \n"
				+ "카드 종류 : %s \n"
				+ "카드 번호 : %s",kind,number);
	}
}