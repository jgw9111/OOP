package gms;

public class Calc {
	public String plus(String[] opArr) {
		String res ="";
		int a = Integer.parseInt(opArr[0]);
		int b = Integer.parseInt(opArr[2]);
		res = a+b+"";
		return res;
	}
	public String minus(String[] opArr) {
		String res ="";
		int a = Integer.parseInt(opArr[0]);
		int b = Integer.parseInt(opArr[2]);
		res = a-b+"";
		return res;
	}
	public String multi(String[] opArr) {
		String res ="";
		int a = Integer.parseInt(opArr[0]);
		int b = Integer.parseInt(opArr[2]);
		res = a*b+"";
		return res;
	}
	public String divid(String[] opArr) {
		String res ="";
		int a = Integer.parseInt(opArr[0]);
		int b = Integer.parseInt(opArr[2]);
		res = a/b+"";
		return res;
	}
	public String modul(String[] opArr) {
		String res ="";
		int a = Integer.parseInt(opArr[0]);
		int b = Integer.parseInt(opArr[2]);
		res = a%b+"";
		return res;
	}
	public String gugudan(String dan) {
		String res = "";
		int n = Integer.parseInt(dan);
		for(int i=1;i<10;i++) {
			res += n+"*"+ i +"="+n * i+"\n";
		}
		return res;
	}
}
