
public class Item {
	private String name;
	private double price;
	
	public Item(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPrice(double price){
		this.price = price;	
	}
	
	public double getPrice(){
		return price;
	}
	
	public String toString(){
		return name + " " + price;
	}
	
	public void setDailySpecial(){
		setPrice(price/2);
	}
}
