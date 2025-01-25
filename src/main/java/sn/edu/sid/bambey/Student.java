package sn.edu.sid.bambey;

import java.util.Date;

/**
 * Un(e) Etudiant(e) est un(e) Human POJO
 */
public class Student extends Human {
	private String matricule;

	public Student(String matricule) {
		super();
		this.matricule = matricule;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Payer sa location
	 * 
	 * @param matricule
	 * @return
	 */
	public String payerLocation(Date locationDate,String matricule) {
		return "Paiement Location au ["+locationDate+"] avec la matricule [" + matricule+"]";
	}

	/**
	 * Payer sa restauration
	 * 
	 * @param matricule
	 * @return
	 */
	public String payerRestauration(Integer ticket, String matricule) {
		return "Restauration avec le ticket:[" + ticket + "] et la matricule: [" + matricule+"]";
	}

	/**
	 * Payer sa restauration
	 * 
	 * @param matricule
	 * @return
	 */
	public String payerInscription(Date inscriptionDate, Integer ticketInscription, String matricule) {
		return "Restauration avec la date d'inscriptione: [" + inscriptionDate + " ] le  ticket: [" + ticketInscription
				+ "] et la matricule: [" + matricule+"]";
	}

}
