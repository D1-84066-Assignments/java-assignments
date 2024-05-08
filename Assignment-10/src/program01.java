import java.util.Arrays;

public class program01 {
	
	public static void main(String[] args) {
		student[] arr = {
				new student(4,"Anil",60),
				new student(2,"Mukesh",30),
				new student(5, "Sham",50),
				new student(1,"Nikhil", 90),
				new student(3, "Akash",70)
		};
		
		System.out.println("Before sorting");
		for (student stud : arr)
			System.out.println(stud);
		
		Arrays.sort(arr);
		
		System.out.println("after sorting ");
		for (student stud:arr)
			System.out.println(stud);
		
		Comparable<student> c1 = new student();
		
	}

}
