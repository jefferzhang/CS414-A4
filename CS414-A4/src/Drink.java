
public class Drink extends Item{
	private Size size;
	
	public Drink(String name, double price, Size size){
		super(name, price);
		this.size = size;
	}
	
	public void setSize(Size size){
		this.size = size;
	}
	
	public Size getSize(){
		return size;
	}
	
	public String toString(){
		return super.toString() + " " + size;
	}
}
