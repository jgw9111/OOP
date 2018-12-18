package gms;

import java.util.Scanner;

public class Member {
	String name; //멤버 변수
	
	public String bmi(double h,double w) {
		String res = ""; // 지역변수  -> 로컬변수

		double bmi = w/(h*h*0.0001);
		
		if(bmi >= 40) {
			res = "고도비만";
		}else if(bmi >= 35){
			res = "중등도 비만";
		}else if(bmi >= 30){
			res = "경도 비만";
		}else if(bmi >= 25){
			res = "과체중";
		}else if(bmi >= 18.5){
			res = "정상";
		}else{
			res = "저체중";
		}
		return res;
		} // bmi end
		public String grade(String[]scoreArr) {
			String grade= ""; //로컬변수는 반드시 초기화해야한다. 원치않는 값이 할당됨.
			/**
			 * 국어, 영어, 수학, 사회, 과학 과목 점수를 입력받아서 평균을 낸 뒤
			 * 100~90 A, B, C, D, E, F 를 내는 것
			 * */
			int[] scoreArr1 = new int[scoreArr.length];
			int sum = 0;
			for(int i=0;i<scoreArr.length;i++) {
				scoreArr1[i] = Integer.parseInt(scoreArr[i]);
				sum += scoreArr1[i];
			}
			
			int eve = sum/5;
		
			if(eve >= 90) {
				grade = "A";
			}else if(eve >= 80) {
				grade = "B";
			}else if(eve >= 70) {
				grade = "C";
			}else if(eve >= 60){
				grade = "D";
			}else if(eve >= 50){
				grade = "E";
			}else{
				grade = "F";
			}
			
			
			return grade;
		} //grade end
		public String genderChecker(String ssn) {
			String genderChecker = "";
			
			char ch = ssn.charAt(7);
			
			switch(ch) {
			case '1': case '3' :
				genderChecker = "남자";
				break;
			case '2': case '4' :
				genderChecker = "여자";
				break;
			case '5': case '6' :
				genderChecker = "외국인";
				break;
			case '7': case '8' : case '9' : case '0':
				genderChecker = "잘못된 입력";
				break;
				
			}
			
			return genderChecker;
		}//genderChecker end
		
		/*public static void main(String[] args) {
			Member m = new Member();
				Scanner scanner = new Scanner(System.in);
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int mat = scanner.nextInt();
			int soc = scanner.nextInt();
			int sic = scanner.nextInt();
			System.out.println(m.grade());
			
		}*/
	}

