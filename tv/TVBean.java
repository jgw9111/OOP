package tv;

public class TVBean {
	private String brand,color;
	private int channel,price;
	private boolean power;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return channel;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public boolean getPower() {
		return power;
	}
	public String toString(String brand,String color,int price) {
		// TODO Auto-generated method stub
		return String.format("[TV 정보]\n"
				+ "BRAND : %s \n"
				+ "COLOR : %s \n"
				+ "PRICE : %s \n",brand,color,price);
	}
}