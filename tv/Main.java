package tv;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		TVBean tvBean = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1. TV 작동  \n"
					+ "2. TV 스펙 입력\n"
					+ "3. TV 정보 보기")){
			case "0" : 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" : 
				
				break;
			case "2" : 
				tvBean = new TVBean();
				String brand = JOptionPane.showInputDialog("브랜드를 입력하세요");
				String color = JOptionPane.showInputDialog("색상을 입력하세요");
				String price = JOptionPane.showInputDialog("가격을 입력하세요");
				tvBean.setBrand(brand);
				tvBean.setColor(color);
				tvBean.setPrice(Integer.parseInt(price));
				break;
			case "3" : 
				JOptionPane.showMessageDialog(null,tvBean.toString(tvBean.getBrand(), tvBean.getColor(), tvBean.getPrice()));
				break;
			}
		}
	}
}