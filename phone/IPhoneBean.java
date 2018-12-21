package phone;

public class IPhoneBean extends CelphoneBean{
	private String data;
	
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("종류 :%s \n"
				+ "제조사 : %s \n"
				+ "이동가능 : %s \n"
				+ "검색 : %s", super.getKind(),super.getCompany(),super.getMove(),data);
	}
}
