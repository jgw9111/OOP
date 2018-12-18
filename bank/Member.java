package bank;

public class Member {
	String id,name,ssn,pass; // 인스턴스변수 = 멤버변수
	Member(String id,String name,String ssn,String pass/*파라미터*/)/*생성자*/{
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	
	public String info() {
		
		return String.format("[회원정보] \n"
				+ "I D : %s \n"
				+ "이 름 : %s \n"
				+ "주민 번호 : %s \n"
				+ "패스워드 : %s \n", id, name, ssn, pass);
	}
	
}
