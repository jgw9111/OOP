package bank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "국민은행"; //상수
	String accountNum;
	int money;
	String today;
	Account(int money){ //파라미터
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random(); //1234-5678
		for(int i=0;i<12;i++) {
			if(i!=0 && i!=3 && i!=7) {
				accountNum += random.nextInt(10);
			}else if(i==0) {
				accountNum += random.nextInt(9)+1;
			}
			else if(i==3 || i==7){
				accountNum += random.nextInt(10)+"-";
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
	public String open(String name) {
		
		return String.format("%s 은행 \n"
				+ "계좌번호 : %s \n"
				+ "이      름 : %s \n"
				+ "개 설 일 : %s \n"
				+ "잔      액 : %s 원",BANK_NAME,accountNum,name,today,money);
	}
	
}
