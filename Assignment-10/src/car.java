public class car implements Comparable<car> {
	int id;
	String name;
	String category;
	double price;
	
	public car() {
		
	}
	
	public car(int id, String name,String category , double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Student [ID" + id +", name = "+ name + ", category "+category+  ", price "+ price +"]";
	}
	
	
	@Override
	public int compareTo(car c) {
		return this.category.compareTo(c.category);
		
	}

	

}
