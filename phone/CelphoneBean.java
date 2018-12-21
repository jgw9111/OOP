package phone;

public class CelphoneBean extends PhoneBean{ //phone 을 확장해서 Celphone 을 만듦
	private String move; //이동 가능
	
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	
	@Override
		public String toString() {
			return String.format("종류 :%s \n"
					+ "제조사 : %s \n"
					+ "이동가능 : %s \n"
					+ "통화내용 : %s", super.getKind(),super.getCompany(),move,super.getCall());
	}
}
