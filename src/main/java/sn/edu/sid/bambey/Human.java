package sn.edu.sid.bambey;

/**
 * Gestion de l'homo sapiens sapiens POJO : Plain Old Java Object ===> Record
 */
public record Human(String lastName, String firstName, Genre genre, String digitalEmpreinte, String email,
		String telephone, Integer idCard) {
	Human() {
		this("N/A", "N/A", Genre.UNKNOWN, "N/A", "N/A", "N/A", 000000);
	}
}
