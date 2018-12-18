package gms;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			String menu = JOptionPane.showInputDialog(
					"0.종료\n "
					+ "1.회원관리 \n"
					+ "2.계산기 \n"
					+ "3.로또 \n"
					+ "4.달력 \n");
			switch(menu) {
			case "0":
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1":
				Member m = new Member();
				String name = JOptionPane.showInputDialog("이름 입력");
				m.name = name;
				JOptionPane.showMessageDialog(null,
						String.format("환영합니다 %s 님", m.name));
				
				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴] \n"
						+ "1. BMI(키, 몸무게) \n"
						+ "2. 학점(국어, 영어, 수학, 과학, 사회) \n"
						+ "3. 성별체크(SSN)");
				switch (mMenu) {
				case "1":
					String[] arr = JOptionPane.showInputDialog(null,
							"키,몸무게 입력").split(",");
					String bmi = m.bmi(Double.parseDouble(arr[0]), 
							Double.parseDouble(arr[1]));
					JOptionPane.showMessageDialog(null,
							String.format("%s 님은 %s 입니다.", 
									m.name,
									bmi));
									
					break;
				case "2":
					String score = JOptionPane.showInputDialog("국어, 영어, 수학, 과학, 사회 점수 입력");
					String[] scoreArr = score.split(",");
					JOptionPane.showMessageDialog(null,String.format("학점은 %s입니다.",m.grade(scoreArr)));
					break;
				case "3":
					String ssn = JOptionPane.showInputDialog("주민번호 입력");
					JOptionPane.showMessageDialog(null,String.format("%s입니다.",m.genderChecker(ssn)));
					break;

				default:
					break;
				}
			case"2"	: 
				Calc c = new Calc();
				String cMenu = JOptionPane.showInputDialog("[계산기 메뉴]\n 1.계산기 \n 2.구구단");
				switch(cMenu) {
				case "1":  
					String op = JOptionPane.showInputDialog("숫자, 연산자,숫자 를 입력하세요");
					String[] opArr = op.split(" ");
					switch(opArr[1]) {
						case "+": 
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.",c.plus(opArr)));
					break;
						case "-": 
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.",c.minus(opArr)));
					break;
						case "*": 
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.",c.multi(opArr)));
					break;
						case "/": 
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.",c.divid(opArr)));
					break;
						case "%": 
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.",c.modul(opArr)));
					break;
				}
					break;
				case "2":  
					String dan = JOptionPane.showInputDialog("몇단을 출력할까요?");
					JOptionPane.showMessageDialog(null,String.format("%s",c.gugudan(dan)));
					break;
				}
			case "3":
				Lotto l = new Lotto();
				JOptionPane.showMessageDialog(null, String.format("%s",l.randomNum()));
				break;
				
			case "4":
				MyCalendar mc = new MyCalendar();
				String year = JOptionPane.showInputDialog("연도를 입력하세요");
				JOptionPane.showMessageDialog(null, String.format("%s",mc.leapYear(year)));
				break;	
			}
		}
		
	}
}