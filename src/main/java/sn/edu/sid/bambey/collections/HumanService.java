package sn.edu.sid.bambey.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

import sn.edu.sid.bambey.Genre;
import sn.edu.sid.bambey.Human;

/**
 * An implementation of a human
 */
public class HumanService implements Crud<Human> {
	private List<Human> sapiens = new ArrayList<>();
	private final Faker faker = new Faker(); 

	public void generateRandomHumans(int finalStep) {
		if (finalStep == 0)
			finalStep = 5;
		for (int i = 1; i <= finalStep; i++) {
			sapiens.add(new Human(faker.name().lastName(), faker.name().firstName(), Genre.MALE, 
					faker.code().isbn10(), faker.internet().emailAddress(), faker.phoneNumber().phoneNumber(), i 
			));
		}

		System.out.println("Generated" + finalStep + "random humans!");
	}

	@Override
	public Human add(Human t) {
		boolean exists = sapiens.stream().anyMatch(h -> h.idCard().equals(t.idCard()));
		if (exists) {
			throw new IllegalArgumentException("A human with idCard " + t.idCard() + " already exists.");
		}
		sapiens.add(t);
		return t;

	}

	@Override
	public List<Human> getAll() {
		// Return an immutable view of the list
		return Collections.unmodifiableList(sapiens);
	}

	@Override
	public List<Human> findBy(String key) {
		return sapiens.stream().filter(h -> h.lastName().equalsIgnoreCase(key) || h.firstName().equalsIgnoreCase(key)
				|| h.email().equalsIgnoreCase(key)).collect(Collectors.toList());
	}

	@Override
	public void update(Integer id, Human t) {
		Optional<Human> existingHuman = sapiens.stream().filter(h -> h.idCard().equals(id)).findFirst();
		if (existingHuman.isPresent()) {
			sapiens.remove(existingHuman.get());
			sapiens.add(t);
		} else {
			throw new NoSuchElementException("No human found with idCard " + id);
		}
	}

	@Override
	public void delete(Integer id) {
		sapiens.removeIf(h -> h.idCard().equals(id));

	}
}
