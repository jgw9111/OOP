package bank31;

public class MemberBean {
	private String id,name,ssn,pass; // 멤버변수 = 인스턴스 변수 에 접근하지 못하게 하기위해 private 제어
	
	/**
	 * 회원정보 보여주기
	 * */
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;// 외부에서 받아오는 값이 없으니까 this 안써도 된다
	}
	public void setName(String name) { //세터 setter
		this.name = name; // write 
	}
	public String getName() { // 게터 getter  
		return name; // read 읽기만 가능 
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	} 
	public String toString() {
		return String.format( "I     D : %s \n"
							+ "이      름 : %s \n"
							+ "주민번호 : %s \n"
							+ "비밀번호 : %s",id,name,ssn,pass);
	};
}
