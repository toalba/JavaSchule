package dialog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class Pathtest {

	public static void main (String[] args) throws IOException {
	
	Path p = Paths.get("/home/toalba/");
	UserPrincipal pr = Files.getOwner(p);
	System.out.println(pr);
	}
}
