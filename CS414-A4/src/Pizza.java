
public class Pizza extends Item{
	private Size size;
	
	public Pizza(String name, double price, Size size){
		super(name, price);
		this.size = size;
	}
	
	public Size getSize(){
		return size;
	}
}
