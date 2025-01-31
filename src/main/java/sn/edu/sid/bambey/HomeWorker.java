package sn.edu.sid.bambey;
/**
 * 
 * HomeWorker est un human mais pas un Student qui est sensé payer une location
 */
public record HomeWorker(Integer idHourly,  Human humanDetails) implements LocationPayment {

@Override
public String paymentLocation() {
	return "Paiement fait par le Homeworker ["+humanDetails.firstName()+"]  ["+humanDetails.lastName()+ " ] avec id journalier ["+this.idHourly()+"]";
}
}
