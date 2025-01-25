package sn.edu.sid.bambey;
/**
 * 
 * HomeWorker est un human mais pas un Student qui est sensé payer une location
 */
public class HomeWorker extends Human implements LocationPayment {
private Integer idHourly; //Id journalier
/**
 * Constructor by default with idHourly
 * @param idHourly
 */
public HomeWorker(Integer idHourly) {
	super();
	this.idHourly = idHourly;
}

public Integer getIdHourly() {
	return idHourly;
}

public void setIdHourly(Integer idHourly) {
	this.idHourly = idHourly;
}

@Override
public String paymentLocation() {
	return "Paiement fait par le Homeworker ["+this.getFirstName()+"]  ["+this.getLastName()+ " ] avec id journalier ["+this.getIdHourly()+"]";
}
}
