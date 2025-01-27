package sn.edu.sid.bambey;
/**
 * Gestion de l'homo sapiens sapiens
 * POJO : Plain Old Java Object
 */
public record Human  (
	 String lastName,
	 String firstName,
	 Genre genre,
	 String digitalEmpreinte,
	 String email,
	 String telephone,
	 Integer idCard
	) {
	public  Human() {
		this(
	            "Unknown",      // Default lastName
	            "Unknown",      // Default firstName
	            Genre.UNKNOWN,  // Default genre (assumes a Genre.UNKNOWN enum value exists)
	            "NoEmpreinte",  // Default digitalEmpreinte
	            "no-email@domain.com", // Default email
	            "000-000-0000", // Default telephone
	            0               // Default idCard
	        );
	}

}
