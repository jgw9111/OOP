package bank3;

public class Member {
	String id,name,ssn,pass;
	Member(String id,String name,String ssn,String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public String info() {
		
		return String.format("id : %s \n"
				+ "이	름  : %s \n"
				+ "주민번호 : %s \n"
				+ "비밀번호 : %s \n",id,name,ssn,pass);
	}
}
