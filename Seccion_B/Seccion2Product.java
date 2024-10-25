public class Product {
	private String name;
	private double price;
	private String type;
	public Product(String name, double price, String type) {
	// Constructor
}

public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public String getType() {
	return type;
	}
}

public class DigitalProduct extends Product {
	public DigitalProduct(String name, double price, String type) {
		//Constructor
	}
	
public class PhysicalProduct extends Product{
	public double weight;
	public PhysicalProduct(String name, double prince, String type, double weight){
		//Constructor
	}
	public double getWeight(){
		return weight;
	}

}