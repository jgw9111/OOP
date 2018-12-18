package gms;

import java.util.Random;

public class Lotto {
	public String randomNum() {
		String num = "";
		Random random = new Random();
		for(int i=1;i<6;i++) {
			num += random.nextInt(45)+1+" ";
		}
		return num;
	}
}
