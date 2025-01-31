package sn.edu.sid.bambey;
/*
 *Un FarmerWorker est un Human mais a une propriété dailyHours (Integer) 
 */
public class FarmerWorker extends Human implements LocationPayment {
private Integer dailyHours;

//Constructeur par défaut de la variable dailyHours
	public FarmerWorker(Integer dailyHours) {
	super();
	this.dailyHours = dailyHours;
}

//Getter de la variable dailyHours
	public Integer getDailyHours() {
	return dailyHours;
}

	//Setter de la variable dailyHours

public void setDailyHours(Integer dailyHours) {
	this.dailyHours = dailyHours;
}




//La classe de base qu'hérite la classe FarmerWorker
	@Override
	public String paymentLocation() {
		// TODO Auto-generated method stub
		return "Paiement fait par le FarmerWorker ["+this.getFirstName()+"]  ["+this.getLastName()+ " ] avec id dailyHours ["+this.getDailyHours()+"]";
	}
}
