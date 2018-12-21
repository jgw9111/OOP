package gms21;

import java.util.Random;

public class StudentService {
	public String makeHakbun() {
		String hakbun = "";
		Random random = new Random();
		hakbun = random.nextInt(9000)+1000+"";
		return hakbun;
	}
	
	public String info(String hakbun,String name, String ssn, String pass) {
		
		return String.format(" [ 학 생 정 보 ] \n"
				+ " 학 번 : %s \n"
				+ " 이 름 : %s \n"
				+ " 주민번호 : %s \n"
				+ " 비밀번호 : %s",hakbun,name,ssn,pass);
	}
	
}
