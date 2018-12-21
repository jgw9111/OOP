package bank21;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	//서비스 로직에는 멤버변수를 두지 않는다.
	
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for (int i = 0; i < 12; i++) {
			if (i != 0 && i != 3 && i != 7) {
				accountNum += random.nextInt(10);
			} else if (i == 3 || i == 7) {
				accountNum += random.nextInt(10) + "-";
			} else if (i == 0) {
				accountNum += random.nextInt(9) + 1;
			}
		}
		return accountNum;
	}

	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		today = sdf.format(date);
		return today;
	}
	
	/**
	 * 입금하기
	 */
	public String deposit(int money) {
		String message = "";
		/*if (money > 0) {
			this.money += money;
			message = "거래완료";
		} else {
			message = "입금액이 잘못되었습니다.";
		}*/
		return message;
	}
	public String info(String accountNum,String name,String today, int money) {
		return  String.format("%s 은행 입니다.\n" + "계좌 번호 : %s \n" + "이름 : %s \n" + "날짜 : %s \n" + "잔액 : %s \n", AccountBean.BANK_NAME,// 상수만 클래스이름.상수이름
				accountNum,name,today, money);
	} 

	/**
	 * 출금하기
	 */
	public String withdraw(int money) {
		String message = "";
		/*if (money > 0 && this.money >= money) {
			this.money -= money;
			message = "거래완료";
		} else {
			message = "입금액이 잘못되었거나, 잔고가 부족합니다.";
		}*/
		return message;
	}

	public String interest(double money, int month) {
		double interstMoney = 0.0;
		DecimalFormat dcf = new DecimalFormat("#,##0");
		if (month >= 12) {
			interstMoney = money * 6.5;
		}
		return dcf.format(interstMoney);
	}

}
