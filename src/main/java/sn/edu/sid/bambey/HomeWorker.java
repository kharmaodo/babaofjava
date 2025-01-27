package sn.edu.sid.bambey;
/**
 * 
 * HomeWorker est un human mais pas un Student qui est sensé payer une location
 */
public record HomeWorker (Integer idHourly , Human humanDetails) implements LocationPayment {

public String paymentLocation() {
	return LocationPayment.super.paymentLocation("identifier"+idHourly);
}
}
