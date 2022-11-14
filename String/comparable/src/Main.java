import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Person[] array = {
						new Person("John", "Snow"),
                        new Person("Tywin", "Lannister"),
                        new Person("Cersei", "Lannister")
						};

		/*
		Person[] array = new Person[3];

		array[0] = new Person("John", "Snow");
		array[1] = new Person("Tywin", "Lannister");
		array[2] = new Person("Cersei", "Lannister");

		 */

	    Arrays.sort(array);

	    for (Person p : array)
	        System.out.println(p);

    }
}
