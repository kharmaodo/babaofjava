package sn.edu.sid.bambey;
/**
 * Gestion de l'homo sapiens sapiens
 * POJO : Plain Old Java Object to Java Records 
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
	            "Unknown",     
	            "Unknown",      
	            Genre.UNKNOWN,  
	            "NoEmpreinte",  
	            "no-email@domain.com",
	            "000-000-0000", 
	            0              
	        );
	}

}
