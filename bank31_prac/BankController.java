package bank31_prac;

import javax.swing.JOptionPane;

public class BankController {
	public static void main(String[] args) {
		MemberBean member = null; 
		AccountBean account = null;
		AccountService accountService = new AccountServiceImpl();
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입 \n"
					+ "2.회원정보 \n"
					+ "3.계좌개설 \n"
					+ "4.계좌정보 \n"
					+ "5.입      금 \n"
					+ "6.출      금 \n"
					+ "7.가입자 수 \n"
					+ "8.정보 수정 \n"
					+ "9.회원 목록\n"
					+ "10.로그인 ")) {
			case"0": 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case"1": 
				memberService.join(JOptionPane.showInputDialog("I D를 입력하세요"),
						JOptionPane.showInputDialog("이름을 입력하세요"), 
						JOptionPane.showInputDialog("주민번호를 입력하세요"), 
						JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				
				JOptionPane.showMessageDialog(null,"~~~회원가입 완료~~~");
				break;
			case"2": 
				JOptionPane.showMessageDialog(null,member.toString());
				break;
			case"3": 
				account = new AccountBean();
				String accountNum = accountService.generatorAccountNum();
				account.setAccountNum(accountNum);
				String today = accountService.today();
				account.setToday(today);
				String sMoney = JOptionPane.showInputDialog("입금");
				int iMoney = Integer.parseInt(sMoney);
				account.setMoney(iMoney);
				String info = accountService.info(account.getAccountNum(),member.getName(),account.getToday(),account.getMoney());
				JOptionPane.showMessageDialog(null,info);
				JOptionPane.showMessageDialog(null,"~~~계좌 생성 완료~~~");
				break;
			case"4": 
				JOptionPane.showMessageDialog(null,account.toString());
				break;
				
			case "5": 
				String inputMoney = JOptionPane.showInputDialog("얼마를 입금할까요");
				//String message = account.deposit(Integer.parseInt(inputMoney));
				//JOptionPane.showMessageDialog(null,message);
				break;
			case "6": 
				String outputMoney = JOptionPane.showInputDialog("얼마를 출금할까요");
				//String message2 = account.withdraw(Integer.parseInt(outputMoney));
				//JOptionPane.showMessageDialog(null,message2);
				break;
			case "7" :
				JOptionPane.showMessageDialog(null,memberService.count());
				break;
			case "8" : 
				String changePw = JOptionPane.showInputDialog("비밀번호 변경");
				member.setPass(changePw);
				break;	
			case "9" : 
				JOptionPane.showMessageDialog(null,memberService.list());
				break;	
			case "10" : 
				String id = JOptionPane.showInputDialog("id 입력");
				String pw = JOptionPane.showInputDialog("비밀번호 입력");
				if(memberService.login(id, pw)) {
					JOptionPane.showMessageDialog(null,"로그인 성공");
				}else {
					
					JOptionPane.showMessageDialog(null,"로그인 성공");
					
				}
				JOptionPane.showMessageDialog(null,memberService.find(id));
				break;
			}
		}
	}
}
