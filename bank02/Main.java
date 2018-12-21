package bank02;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n 1.회원가입 \n 2.계좌 개설 \n 3.계좌 정보")) {
			case"0":
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case"1": 
				String id = JOptionPane.showInputDialog("== I D 입 력 ==");
				String name = JOptionPane.showInputDialog("== 이 름 입 력 ==");
				String ssn = JOptionPane.showInputDialog("== 주민번호 입 력 ==");
				String pass = JOptionPane.showInputDialog("== P W 입 력 ==");
				member = new Member(id, name, ssn, pass);
				JOptionPane.showMessageDialog(null,member.info());
				break;
				
			case"2" :
				account = new Account(0);
				JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다");
				break;
			case"3" :
				JOptionPane.showMessageDialog(null,account.open(member.name));
				break;
			}
		}
	}
}
