package tema4;

public class ejercicio_3 {
		    private String name;
		    private String address;

		    public ejercicio_3(String name, String address) {
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
		        return "Person[name=" + name + ",address=" + address + "]";
		    }			
	}


