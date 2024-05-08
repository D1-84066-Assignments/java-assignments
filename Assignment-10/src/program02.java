import java.util.Arrays;

public class program02 {

	public static void main(String[] args) {
		car[] arr = {
				new car(4,"Mobile","Electronics",15000),
				new car(2,"Tshirt","Clothing",300),
				new car(5, "Bottle","Plastics",50),
				new car(1,"Table","Wooden", 1700),
				new car(3, "Shoes","Footwear",70),
				new car(4,"Laptop","Electronics",45000),
				new car(2,"SweatShirt","Clothing",750),
				new car(5, "Bowl","Plastics",35),
				new car(1,"Chair","Wooden", 550),
				new car(3, "Sandals","Footwear",1200)
		};
		System.out.println("Before sorting");
		for (car c : arr)
			System.out.println(c);
		
		Arrays.sort(arr);
		
		System.out.println("after sorting ");
		for (car c:arr)
			System.out.println(c);
		
		Comparable<car> c1 = new car();
	}

}
