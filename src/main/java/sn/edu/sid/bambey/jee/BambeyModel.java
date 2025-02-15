package sn.edu.sid.bambey.jee;

import static java.util.List.of;

import java.util.List;

import sn.edu.sid.bambey.Genre;
import sn.edu.sid.bambey.Human;

public class BambeyModel {
	private List<Human> students = of(
			new Human("Samba", "Kébé", Genre.MALE, "eXXXXXXX", "habibatou.diallo@somewhere", "76xxxxx", 12456789),
			new Human("Habibatou", "Diallo", Genre.FEMALE, "eXXXXXXX", "habibatou.diallo@somewhere", "76xxxxx", 90876),
			new Human("Ngor", "Diop", Genre.MALE, "fXXXXXXX", "ngor.diop@somewhere", "768888", 90888));

	public List<Human> getStudents() {
		return students;
	}

	public BambeyModel() {
		super();
	}
	
	
}
