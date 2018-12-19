package bank2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME= "텀블러";
	String accountNum,date;
	int money;
	Account(int money){
		this.accountNum = this.generatoraccountNum();
		this.date = this.today();
		this.money = money;
	}
	
	public String generatoraccountNum() {
		String generatoraccountNum = "";
		Random random = new Random();
		generatoraccountNum = random.nextInt(9000)+ 1000 +"-"+random.nextInt(10000) + "-"+ random.nextInt(10000);
		
		return generatoraccountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aa KK:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String open(String name) {
		
		return String.format("%s 은행입니다.\n"
				+ "계좌 번호 : %s \n"
				+ "이       름 : %s \n"
				+ "개설 날짜 : %s \n"
				+ "현재 잔액 : %s 원",BANK_NAME,accountNum,name,date,money);
	}
}
