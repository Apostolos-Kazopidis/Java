import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Person[] array = {
						new Person("John", "Snow"),
                        new Person("Tywin", "Lannister"),
                        new Person("Cersei", "Lannister")
						};

	    Arrays.sort(array);

	    for (Person p : array)
	        System.out.println(p);

		System.out.println("------------------------------------------------------------");

		ArrayList<Person> al = new ArrayList<Person>();

		al.add(new Person("John", "Snow"));
		al.add(new Person("Tywin", "Lannister"));
		al.add(new Person("Cersei", "Lannister"));

		Collections.sort(al);

		System.out.println(al);

























    }
}
