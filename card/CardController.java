package card;

import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		CardBean cardBean = null;
		CardService cardService = new CardServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1. 카드선택 \n"
					+ "2. \n")){
			case "0" : 
				
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" : 
				cardService.bet(JOptionPane.showInputDialog("카드 종류"), Integer.parseInt(JOptionPane.showInputDialog("카드 번호")));
				// 카드의 종류
				// 카드 번호
				break;
			case "2" :
				// 제출한 카드의 스펙
				break;
			case "3" : break;
			}
		}
	}
}