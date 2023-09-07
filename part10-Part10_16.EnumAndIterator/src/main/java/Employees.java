import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private List<Person> persons;

	public Employees() {
		this.persons = new ArrayList<>();

	}

	public void add(Person personToAdd) {
		this.persons.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd) {
		peopleToAdd.stream().forEach(s -> persons.add(s));
	}

	public void print() {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// persons.stream().forEach(s -> System.out.println(s));
	}
	
	public void print(Education education) {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person nextInLine = iterator.next();
			if (nextInLine.getEducation() == education) {
				System.out.println(nextInLine);
			}
		}
	}

	public void fire(Education education) {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				iterator.remove();
			}
		}
	}
}
