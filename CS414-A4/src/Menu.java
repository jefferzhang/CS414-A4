import java.util.ArrayList;

public class Menu {
	private ArrayList<Drink> drinks;
	private ArrayList<Appetizer> appetizers;
	private ArrayList<Pizza> pizzas;
	
	public Menu(){
		drinks = new ArrayList<>();
		appetizers = new ArrayList<>();
		pizzas = new ArrayList<>();
	}
	
	public void define(Item item){
		if(item instanceof Drink) drinks.add((Drink)item);
		if(item instanceof Appetizer) appetizers.add((Appetizer)item);
		if(item instanceof Pizza) pizzas.add((Pizza)item);
	}
	
	public void modify(Item item){
		
	}
	
	public String toString(){
		String s = "Drinks:\n";
		for(Drink d: drinks){
			s += d.toString() + "\n";
		}
		s += "\nAppetizers:\n";
		for(Appetizer a: appetizers){
			s += a.toString() + "\n";
		}
		s += "\nPizzas:\n";
		for(Pizza p: pizzas){
			s += p.toString() + "\n";
		}
		return s;
	}
}
