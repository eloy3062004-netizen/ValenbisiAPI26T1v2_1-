package tema4;

public class examen_prueba {
	abstract class PublicTransport {
	    protected String plate;
	    protected String model;
	    protected int power;
	    protected boolean inService;

	    public PublicTransport(String plate, String model, int power, boolean inService) {
	        this.plate = plate;
	        this.model = model;
	        this.power = power;
	        this.inService = inService;
	    }
	    public abstract void startService();
	    public abstract void finishService();
	    public abstract int getNumberOfSeats();
	    public String getPlate() {
	        return plate;
	    }
	    public String getModel() {
	        return model;
	    }
	    public int getPower() {
	        return power;
	    }
	    public boolean isInService() {
	        return inService;
	    }
	    public void setInService(boolean inService) {
	        this.inService = inService;
	    }
	    public String toString() {
	        return "PublicTransport{" +
	                "plate='" + plate + '\'' +
	                ", model='" + model + '\'' +
	                ", power=" + power +
	                ", inService=" + inService +
	                '}';
	    }
	}
	class Taxi extends PublicTransport {
	    int licenseNumber;
	    boolean disabled;

	    public Taxi(String plate, String model, int power, boolean inService, int licenseNumber, boolean disabled) {
	        super(plate, model, power, inService);
	        this.licenseNumber = licenseNumber;
	        this.disabled = disabled;
	    }
	    public void startService() {
	        inService = true;
	        System.out.println("Taxi with license " + licenseNumber + " in service now");
	    }
	    public void finishService() {
	        inService = false;
	        System.out.println("Taxi with license " + licenseNumber + " has finished service.");
	    }
	    public int getNumberOfSeats() {

	        return 4;
	    }
	    public String toString() {
	        return "Taxi{" +
	                "licenseNumber=" + licenseNumber +
	                ", disabled=" + disabled +
	                ", " + super.toString() +
	                '}';
	    }
	}
	class Bus extends PublicTransport {
	    private int busNumber;
	    private int numberOfSeats;
	    public Bus(String plate, String model, int power, boolean inService, int busNumber, int numberOfSeats) {
	        super(plate, model, power, inService);
	        this.busNumber = busNumber;
	        this.numberOfSeats = numberOfSeats;
	    }
	    public void startService() {
	        inService = true;
	        System.out.println("Bus number " + busNumber + " in service now");
	    }
	    public void finishService() {
	        inService = false;
	        System.out.println("Bus number " + busNumber + " has finished service.");
	    }
	    public int getNumberOfSeats() {
	        return numberOfSeats;
	    }
	    public String toString() {
	        return "Bus{" +
	                "busNumber=" + busNumber +
	                ", numberOfSeats=" + numberOfSeats +
	                ", " + super.toString() +
	                '}';
	        
	    }
	}
}
