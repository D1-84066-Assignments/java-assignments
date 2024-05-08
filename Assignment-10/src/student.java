
public class student implements Comparable<student> {
	int rollno;
	String name;
	double marks;
	
	public student() {
		
	}
	
	public student(int rollno, String name , double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [Rollno" + rollno +", name = "+ name +", marks "+ marks +"]";
	}
	
	
	@Override
	public int compareTo(student s) {
		return Double.compare(s.marks,this.marks);
		
	}

	

}
