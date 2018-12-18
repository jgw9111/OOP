package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입 \n"
					+ "2.계좌개설 \n"
					+ "3.계좌정보 ")) {
			case "0": 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("I D 를 입력하세요");
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				member = new Member(id, name, ssn, pass);
				String info = member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case "2": 
				account = new Account(0);
				JOptionPane.showMessageDialog(null,"계좌가 발급되었습니다.");
				break;
			case "3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null,open);
				break;
			}
		}
	}
}
