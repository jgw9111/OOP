package bank11;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null; 
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입 \n"
					+ "2.회원정보 \n"
					+ "3.계좌개설 \n"
					+ "4.계좌정보 \n"
					+ "5.입      금 \n"
					+ "6.출      금 \n"
					+ "7.이	    자 \n"
					+ "8.비번변경")) {
			case"0": 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case"1": 
				String id = JOptionPane.showInputDialog("I D를 입력하세요");
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				member = new Member(id, name, ssn, pass);
				JOptionPane.showMessageDialog(null,"~~~회원가입 완료~~~");
				break;
			case"2": 
				JOptionPane.showMessageDialog(null,member.toString());
				break;
			case"3": 
				account = new Account(0);
/*				JOptionPane.showMessageDialog(null,account.generatorAccountNum());
*/				JOptionPane.showMessageDialog(null,"~~~계좌 생성 완료~~~");
				break;
			case"4": 
				JOptionPane.showMessageDialog(null,account.toString());
				break;
				
			case "5": 
				String inputMoney = JOptionPane.showInputDialog("얼마를 입금할까요");
				String message = account.deposit(Integer.parseInt(inputMoney));
				JOptionPane.showMessageDialog(null,message);
				break;
			case "6": 
				String outputMoney = JOptionPane.showInputDialog("얼마를 출금할까요");
				String message2 = account.withdraw(Integer.parseInt(outputMoney));
				JOptionPane.showMessageDialog(null,message2);
				break;
			case "7" :
				String a = JOptionPane.showInputDialog("얼마를 자동이체 하실래요?");
				String b = JOptionPane.showInputDialog("몇개월 동안?");
				double auto = Integer.parseInt(a);
				int month = Integer.parseInt(b);
				JOptionPane.showMessageDialog(null,account.interest(auto, month));
				break;
			case "8" : 
				String changePw = JOptionPane.showInputDialog("비밀번호 변경");
				member.setPass(changePw);
				break;	
			}
		}
	}
}
