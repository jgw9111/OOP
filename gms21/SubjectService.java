package gms21;

public class SubjectService {

	public String info(String name, String hakbun, String subjName, String profName,int score) {
		return String.format("[과목 정보] \n"
				+ "이 	  름 : %s \n"
				+ "학	  번 : %s \n "
				+ "수강 과목 : %s \n"
				+ "교수 이름 : %s \n"
				+ "점 	  수 : %s",name,hakbun,subjName,profName,score);
	}
}
