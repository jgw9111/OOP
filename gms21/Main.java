package gms21;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean student = null;
		SubjectBean subject = null;
		StudentService studentService = new StudentService();
		while(true) {
			/**
			 * 성적표에 표시될 내용 
			 *  학번 (student)
			 *  학생 이름 (student)
			 *  과목명 (subject)
			 *  학생정보 (subject)*/
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.학생 등록 \n"
					+ "2.회원 정보 \n"
					+ "3.비번 변경 \n"
					+ "4.수강과목등록 \n"
					+ "5.교수등록 \n"
					+ "6.점수등록 \n"
					+ "7.성적표 보기")) {
			case"0": 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case"1": 
				student = new StudentBean();
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀 번호를 입력하세요");
				String hakbun = studentService.makeHakbun(); 
				student.setHakbun(hakbun);
				student.setName(name);
				student.setSsn(ssn);
				student.setPass(pass);
				break;	
			case"2": 
				String info = studentService.info(student.getHakbun(),student.getName(), student.getSsn(), student.getPass());
				JOptionPane.showMessageDialog(null,info);
				break;	
			case"3": 
				String changePw = JOptionPane.showInputDialog("비밀번호를 변경하세요");
				student.setPass(changePw);
				break;	
			case"4": 
				subject = new SubjectBean();
				String subjName = JOptionPane.showInputDialog("수강 과목을 입력하세요");
				subject.setSubjName(subjName);
				break;	
			case"5": 
				String profName = JOptionPane.showInputDialog("교수 이름을 입력하세요");
				subject.setProfName(profName);
				break;	
			case"6": 
				String score = JOptionPane.showInputDialog("점수를 입력하세요");
				int score1 = Integer.parseInt(score);
				subject.setScore(score1);
				break;	
			case"7": 
				SubjectService subservice = new SubjectService();
				String info2 = subservice.info(student.getName(),student.getHakbun(),subject.getSubjName(), subject.getProfName(), subject.getScore()); 
				JOptionPane.showMessageDialog(null,info2);
				break;	
				
			}
		}
	}
}
