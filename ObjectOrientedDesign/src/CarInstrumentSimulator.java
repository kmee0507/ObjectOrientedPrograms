class FuelGauge{
	private final int MAX_GALLONS = 15;
	private int fuel;
	
	void setCurrentAmountOfFuel(int f){
		this.fuel = f;
	}
	int getCurrentAmountOfFuel(){
		return this.fuel;
	}
	void addFuel(){
		while(this.fuel < MAX_GALLONS)
			this.fuel+=1;
	}
	void decreaseFuel(){
		if(this.fuel>0)
			this.fuel-=1;
	}
	
}

class Odometer{
	private int mileage;
	
	void setCurrentMileage(int m){
		this.mileage = m;
	}
	
	int getCurrentMileage(){
		return this.mileage;
	}
	void addMileage(int count, FuelGauge fg){
		
		
		this.mileage+=1;
		if(this.mileage == 1000000)
			this.mileage = 0;
		if (count % 24 == 0){
			fg.decreaseFuel();
			
		}
		

	}
}
	



public class CarInstrumentSimulator {
	public static void main(String[] args){
		FuelGauge fg = new FuelGauge();
		Odometer o = new Odometer();
		fg.addFuel();
		int count = 1;
		while(fg.getCurrentAmountOfFuel() != 0){
			o.addMileage(count, fg);
			System.out.println("The cars current mileage is: " + o.getCurrentMileage());
			System.out.println("The cars current amount of fuel is :" + fg.getCurrentAmountOfFuel());
			count += 1;
		}
	}

}
