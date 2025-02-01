package sn.edu.sid.bambey;
/*
 *Un FarmerWorker est un Human mais a une propriété dailyHours (Integer) 
 *Mainteant FarmerWorker est un joli record !!!
 */
public record FarmerWorker(Integer dailyHours , Human humanDetails) implements LocationPayment {
//La classe de base qu'hérite la classe FarmerWorker
	@Override
	public String paymentLocation() {
		return "Paiement fait par le FarmerWorker ["+this.humanDetails.firstName()+"]  ["+this.humanDetails.lastName()+ " ] avec id dailyHours ["+this.dailyHours()+"]";
	}
}
