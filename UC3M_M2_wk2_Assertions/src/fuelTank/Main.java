package fuelTank;

/**
 * Main class of the Java program.
 * 
 * @author UC3M MOOC Team
 * @since 2016-04
 * 
 */
public class Main {

    public static void main(String[] args) {
    	FuelTank fuelTank = new FuelTank(40, 0);
        double fuelTankLevelInit = fuelTank.getTankLevel();
        double fuelAdd = 15;
        fuelTank.fill(fuelAdd);
        assert fuelTank.getTankLevel()>fuelTankLevelInit;
        double fuelRemove = 15;
        fuelTankLevelInit = fuelTank.getTankLevel();
        fuelTank.consume(fuelRemove);
        assert fuelTank.getTankLevel()<fuelTankLevelInit;
        System.out.println("The amount of fuel in the tank is " + fuelTank.getTankLevel());
    }
    
    
}
