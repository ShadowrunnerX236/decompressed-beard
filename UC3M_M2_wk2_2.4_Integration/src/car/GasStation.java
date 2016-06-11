package car;

public class GasStation {

    /**
     * price is the cost of a liter
     */
    private double price;

    /** 
     * Gas Station constructor
     * @param crudePrice is the current crude price per liter
     * @param fixedCost is the fixed cost plus taxes per liter
     * 
     */
    public GasStation(double crudePrice, double fixedCost){
        price = fixedCost*0.6 + crudePrice*0.4;
    }

    /**
     * Try to fill the required fuel to finish the travel, if
     * the tank has enough capacity. Otherwise, 
     * the tank will be filled up to its capacity.
     *
     * precondition: missingKms > 0
     *
     * @param car is the car object that has the tank to be filled
     * @param missingKms is the missing kilometers to travel 
     *
     * @return the money amount to pay 
     */
    public double refuel(Car car, double missingKms){
        // IMPLEMENTED
    	double amountFuel = car.amountFuel(missingKms);
    	if ((car.getTank().getTankLevel()+ amountFuel) > car.getTank().getCapacity())
    	    amountFuel = car.getTank().getCapacity()-car.getTank().getTankLevel();
    	car.getTank().fill(amountFuel);
    	return amountFuel * price;
    }

}