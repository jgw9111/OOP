package phone;
/**
 * company 제조사
 * call 전화
 * kind 종류*/
public class PhoneBean {
	private String company, call, kind;
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company; 
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getCall() {
		return call;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	@Override
		public String toString() {
			return String.format("종 류 : %s \n"
					+ "제조사 : %s \n"
					+ "통화 내역 : %s ",kind ,company, call );
		}
}
