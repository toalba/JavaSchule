package interfaces_3a;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Person p = new Kunde("Hubert", "1234X");
		FileSerializeable fs = new Kunde("Hubert", "1234X");
		

		ArrayList<FileSerializeable> fss = new ArrayList<>();
		fss.add(new Kunde("Herbert", "1"));
		fss.add(new Hund("Bello"));
		//fss.add(new Person("Heinz")); Geht nicht

		for (FileSerializeable f : fss)
		{
			f.write("/tmp/daten.txt");
		}
		
		ArrayList<Person> personen = new ArrayList<>();
		personen.add(new Person("Franz"));
		personen.add(new Kunde("Fritz", "333"));
		//personen.add(new Hund("Wuffi")); Geht nicht
		
	}

}
