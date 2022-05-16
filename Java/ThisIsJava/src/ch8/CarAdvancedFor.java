package ch8;

public class CarAdvancedFor {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	};
	
	void run() {
		for ( Tire tire : tires ) {
			tire.roll();
		}
	}
}
