package bank01;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 계좌 클래스
 * [속성]
 * 상수 : BANK_NAME
 * 멤버변수 :
 * 1. accountNum 계좌번호
 * 2. money 잔액
 * 3. today 해당일
 * [기능]
 * 1.generatorAccountNum() 계좌번호 생성
 * 2.today() 해당일 생성
 * 3.withdraw() 출금하기
 * 4.deposit() 입금하기
 * 5.info() 계좌정보*/
public class Account {
	final static String BANK_NAME ="tired";
	String accountNum,today;
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.today = this.today();
		this.money = money;
		/*멤버변수 선언된 것은 반드시 초기화 해야한다.*/
	}
	
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for(int i=0;i<12;i++) {
			if(i != 0 && i != 3 && i != 7) {
				accountNum += random.nextInt(10);
			}else if(i == 3 || i ==7) {
				accountNum += random.nextInt(10)+"-";
			}else if(i==0) {
				accountNum += random.nextInt(9)+1;
			}
		}
		return accountNum;
	}
	/**
	 * 출금하기*/
	public String withdraw(int money) {
		String message = "";
		if(money >0 &&this.money >=money) {
			this.money -= money;
			message = "거래완료";
		}else {
			message = "입금액이 잘못되었거나, 잔고가 부족합니다.";
		}
		return message;
	}
	
	/**
	입금하기
	*/
	public String deposit(int money) {
		String message = "";
		if(money > 0) {
			this.money += money;
			message = "거래완료";
		}else {
			message = "입금액이 잘못되었습니다.";
		}
		return message;
	}
	
	public String interest(double money,int month) {
		double interstMoney = 0.0;
		DecimalFormat dcf = new DecimalFormat("#,##0");
		if(month >= 12) {
			interstMoney = money * 6.5;
		}
		return dcf.format(interstMoney);
	}
	
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String info(String name) {
		
		return String.format("%s 은행 입니다.\n"
				+ "계좌 번호 : %s \n"
				+ "이름 : %s \n"
				+ "날짜 : %s \n"
				+ "잔액 : %s \n",BANK_NAME,accountNum,name,today,money);
	}
}
