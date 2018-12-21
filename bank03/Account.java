package bank03;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {
	final static String BANK_NAME = "집";
	String accountNum,date;
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.date = this.today();
		this.money = money;
	}
	public String generatorAccountNum() {
		String generatorAccountNum = "";
		Random random = new Random();
		generatorAccountNum = random.nextInt(9000)+1000+"-"+random.nextInt(10000)+"-"+random.nextInt(10000);
		return generatorAccountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aa KK:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String open(String name) {
		
		return String.format("%s 은행입니다. \n"
				+ "계좌   번호 : %s \n"
				+ "이 	   름  : %s \n"
				+ "계좌발급일 : %s \n"
				+ "현재	 잔액 : %s \n",BANK_NAME,accountNum,name,date,money);
	}
}
