package car;
import javax.swing.JOptionPane;

public class CarController {
	public static void main(String[] args) {
		CarBean car = null;
		CarService carservice = new CarServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1. 차량 입고\n"
					+ "2. 차량 목록\n"
					+ "3. 차량 검색\n"
					+ "4. 차량 판매")){
			case "0" : 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" : 
				String brand = JOptionPane.showInputDialog("브랜드");
				String color = JOptionPane.showInputDialog("차 색상 입력");
				String gearType = JOptionPane.showInputDialog("변속기 선택");
				String door = JOptionPane.showInputDialog("문의 개수 입력");
				carservice.add(brand,color,gearType,Integer.parseInt(door));
				break;
			case "2" : 
				carservice.list();
				break;
			case "3" : 
				carservice.find();
				break;
			case "4" :
				carservice.sell();
				break;
			}
		}
	}
}