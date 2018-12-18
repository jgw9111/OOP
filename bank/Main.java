package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1. 회원가입 \n 2. 계좌 개설 \n 3.계좌 보기")) {
			case"0": 
				JOptionPane.showMessageDialog(null, "시스템 종료"); 
				return;
			case"1":
				String id = JOptionPane.showInputDialog("I D 등록");
				String name = JOptionPane.showInputDialog("이 름 등록");
				String ssn = JOptionPane.showInputDialog("주 민 번 호 등록");
				String pass = JOptionPane.showInputDialog("패 스 워 드 등록");
				member = new Member(id, name, ssn, pass);
				String info = member.info();
				JOptionPane.showMessageDialog(null, info);
				break;
			case"2":
				account = new Account(0);
				JOptionPane.showMessageDialog(null, "계좌가 개설되었습니다!");
				break;
			case "3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null, open);
				break;
			}
		}
	}
}
