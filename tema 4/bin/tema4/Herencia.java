package tema4;
public class Herencia {
class Person {
	private String name;
	private String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
	    public String getName() {
	        return name;
	    }

	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    public String toString() {
	        return name + " " + address + " ";
	    }
	    class Student2 {
	    	private int year;
	    	private String program;
	    	private double fee;
	    	public Student2(String name, String address, String program, int year, double fear) {
	    	this.year = year;	    		    		    			    		    			    			    	    			   	
	    }
	    public String getProgram() {
	        return program;
	    }
	    public int getYear() {
	        return year;
	    }
	    public double getFee() {
	    	return fee;
	    }
	    
	    }
}
}
