package iostreams;

import java.io.Serializable;

public class Dog1 implements Serializable {
	String name;
	String breed;

	public Dog1(String name, String breed) {
	this.name = name;
	this.breed = breed;
	}

}
