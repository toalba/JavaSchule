package interfaces_3a;

public class Person implements FileSerializeable, Comparable<Person>{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		return this.getName().compareTo(o.getName());
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public void write(String filePath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(String filePath) {
		// TODO Auto-generated method stub
		
	}
	
}
