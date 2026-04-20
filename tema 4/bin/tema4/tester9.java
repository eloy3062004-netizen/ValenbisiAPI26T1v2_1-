package tema4;
import java.util.ArrayList;
public class tester9 {

	    public static double howManySeatsInService(ArrayList<examen_prueba.PublicTransport> l) {

	        int total = 0;

	        for (examen_prueba.PublicTransport p : l) {
	            if (p.isInService()) {
	                total += p.getNumberOfSeats();
	            }
	        }
	        return total;
	    }
	    public static void taxisForDisabledPeople(ArrayList<examen_prueba.PublicTransport> l) {
	        for (examen_prueba.PublicTransport p : l) {
	            if (p instanceof examen_prueba.Taxi) {
	                examen_prueba.Taxi t = (examen_prueba.Taxi) p;
	                if (t.disabled) {
	                    System.out.println("Taxi license: " + t.licenseNumber);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {

	        examen_prueba factory = new examen_prueba();

	        ArrayList<examen_prueba.PublicTransport> list = new ArrayList<>();

	        list.add(factory.new Taxi("1111AAA","Toyota",120,true,101,true));
	        list.add(factory.new Taxi("2222BBB","Seat",110,false,102,false));
	        list.add(factory.new Taxi("3333CCC","Toyota",130,true,103,true));
	        list.add(factory.new Taxi("4444DDD","Skoda",115,true,104,false));
	        list.add(factory.new Taxi("5555EEE","Hyundai",118,false,105,true));

	        list.add(factory.new Bus("6666FFF","Mercedes",300,true,1,50));
	        list.add(factory.new Bus("7777GGG","Volvo",320,true,2,55));
	        list.add(factory.new Bus("8888HHH","MAN",310,false,3,60));
	        list.add(factory.new Bus("9999III","Mercedes",305,true,4,45));
	        list.add(factory.new Bus("0000JJJ","Volvo",315,false,5,52));

	        double seats = howManySeatsInService(list);
	        System.out.println("Total seats in service: " + seats);

	        taxisForDisabledPeople(list);

	    }
	}

