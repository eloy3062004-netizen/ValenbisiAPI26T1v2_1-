package tema4;

public class City {
        private String nombre;
        private Long poblacion;
        private Integer codigoProvincia;
    
	public City(String name, Long population, Integer provinceCode) {
		this.nombre = name;
		this.poblacion = population;
		this.codigoProvincia = provinceCode;
	}


public String nombre() {
	return nombre; 
}
public Long poblacion() {
	return poblacion;
}
public Integer codigoProvincia() {
	return codigoProvincia;
}
//public String toString() {
	//return "Ciudad: " + nombre + ", Población:" + poblacion + ", Provincia:" + codigoProvincia;
//}
}