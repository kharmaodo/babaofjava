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
        humanService.add(new Human("Doe", "John", Genre.MALE, "xxxx","john.doe@example.com", "123-456-7890",1234));
        humanService.add(new Human( "Smith", "Jane", Genre.FEMALE,"yyy", "jane.smith@example.com", "987-654-3210",5678));
        humanService.add(new Human("Lee", "Bruce", Genre.MALE, "zzz","bruce.lee@example.com", "555-555-5555",8790));

        // Read All Humans
        System.out.println("\nAll Humans:");
        List<Human> allHumans = humanService.getAll();
        allHumans.forEach(System.out::println);

        // Read by Last Name
        System.out.println("\nHumans with Last Name 'Doe':");
        List<Human> does = humanService.findBy("Doe");
        does.forEach(System.out::println);

        // Update a Human
        System.out.println("\nUpdating Human with IDCrad 1234..");
        humanService.update(1234, new Human("Doe", "John", Genre.MALE, "xxxx","john.doe@example.com", "123-456-7890",1234));

        // Read All Humans after Update
        System.out.println("\nAll Humans After Update:");
        humanService.getAll().forEach(System.out::println);

        // Delete a Human
        System.out.println("\nDeleting Human with ID 8790...");
        humanService.delete(8790);

        // Read All Humans after Delete
        System.out.println("\nAll Humans After Deletion:");
        humanService.getAll().forEach(System.out::println);
	}

}
