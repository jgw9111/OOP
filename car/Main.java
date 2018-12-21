package car;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CarBean car = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1. 차 선택\n"
					+ "2. 차 스펙\n")){
			case "0" : 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" : 
				car = new CarBean();
				String color = JOptionPane.showInputDialog("차 색상 입력");
				String gearType = JOptionPane.showInputDialog("변속기 선택");
				String door = JOptionPane.showInputDialog("문의 개수 입력");
				car.setColor(color);
				car.setGearType(gearType);
				car.setDoor(Integer.parseInt(door));
				break;
			case "2" : 
				JOptionPane.showMessageDialog(null,car.toString(car.getColor(), car.getGearType(), car.getDoor()));
				break;
			case "3" : break;
			}
		}
	}
}