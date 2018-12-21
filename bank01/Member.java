package bank01;

public class Member {
	String id,name,ssn,pass; // 멤버변수 = 인스턴스 변수
	Member(String id, String name, String ssn, String pass){/**멤버변수들을 초기화하기위해*/
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	/**
	 * 회원정보 보여주기
	 * */
	public String info() {
		return String.format( "I     D : %s \n"
							+ "이      름 : %s \n"
							+ "주민번호 : %s \n"
							+ "비밀번호 : %s",id,name,ssn,pass);
	};
}
