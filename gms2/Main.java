package gms2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1. \n"
					+ "2. \n")){
			case "0" : 
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" : break;
			case "2" : break;
			case "3" : break;
			}
		}
	}
}