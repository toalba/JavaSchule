
public class personen {
	private String name;
	private int alter;
	public personen(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public void ausgabe()
	{
		System.out.printf("Name:%s ;Alter:%d",name,alter);
	}
	

}
