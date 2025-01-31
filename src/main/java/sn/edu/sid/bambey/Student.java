package sn.edu.sid.bambey;

import java.util.Date;

/**
 * Un(e) Etudiant(e) est un(e) Human POJO qui doit implementer la fonctionnalité de paiements
 * 
 * Student est un record maintenant !!
 */
public record Student (String matricule, Human humanDetails) implements LocationPayment {

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

	@Override
	public String paymentLocation() {
		return "Paiement fait par l'étudiant(e) avec matricule ["+this.matricule()+"]";
	}

}
