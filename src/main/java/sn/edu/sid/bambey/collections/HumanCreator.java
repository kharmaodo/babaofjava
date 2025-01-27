package sn.edu.sid.bambey.collections;

import java.util.List;

import sn.edu.sid.bambey.Genre;
import sn.edu.sid.bambey.Human;

/**
 * Running the creator of humans service.
 */
public class HumanCreator {

	public static void main(String[] args) {
		HumanService humanService = new HumanService();

		// Create Humans
		humanService.generateRandomHumans(10);
		// Read All Humans
		System.out.println("\nAll Humans:");
		List<Human> allHumans = humanService.getAll();
		allHumans.forEach(System.out::println);

		// Read by Last Name
		System.out.println("\nHumans with Last Name 'Doe':");
		List<Human> does = humanService.findBy("Doe");
		does.forEach(System.out::println);

		// Update a Human
		System.out.println("\nUpdating Human with IdCard 5..");
		humanService.update(5, new Human("Doe", "John", Genre.MALE, "xxxx", "john.doe@example.com", "123-456-7890", 5));

		// Read All Humans after Update
		System.out.println("\nAll Humans After Update:");
		humanService.getAll().forEach(System.out::println);

		// Delete a Human
		System.out.println("\nDeleting Human with IdCards 5...");
		humanService.delete(5);

		// Read All Humans after Delete
		System.out.println("\nAll Humans After Deletion:");
		humanService.getAll().forEach(System.out::println);
	}

}
