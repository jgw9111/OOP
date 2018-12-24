package car;

public class CarBean {
	private String brand,color,gearType;
	private int door;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getGearType() {
		return gearType ;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return door;
	}
	public String toString(String color,String gearType,int door) {
		// TODO Auto-generated method stub
		return String.format("[차 스펙] \n"
				+ "BRAND : %s \n"
				+ "COLOR : %s \n"
				+ "GEAR TYPE : %s \n"
				+ "DOOR : %s",brand,color,gearType,door);
	}
}