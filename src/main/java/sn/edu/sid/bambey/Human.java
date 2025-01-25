package sn.edu.sid.bambey;
/**
 * Gestion de l'homo sapiens sapiens
 * POJO : Plain Old Java Object
 */
public class Human  {
	private String lastName;
	private String firstName;
	private Genre genre;
	private String digitalEmpreinte;
	private String email;
	private String telephone;
	private Integer idCard;
	
	public Human() {
		super();
	}
	
	public Human(String lastName, String firstName, Genre genre, String digitalEmpreinte, String email,
			String telephone, Integer idCard) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.genre = genre;
		this.digitalEmpreinte = digitalEmpreinte;
		this.email = email;
		this.telephone = telephone;
		this.idCard = idCard;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getDigitalEmpreinte() {
		return digitalEmpreinte;
	}

	public void setDigitalEmpreinte(String digitalEmpreinte) {
		this.digitalEmpreinte = digitalEmpreinte;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getIdCard() {
		return idCard;
	}

	public void setIdCard(Integer idCard) {
		this.idCard = idCard;
	}
	
	
	
}
