package tema4;
import java.util.ArrayList;
public class CitySet {
	private ArrayList<ciudades> City;
	public CitySet() {
		ciudades = new ArrayList<>();
	}
 public void añadirCiudad(Ciudad ciudad) {
	 ciudades.añadir(ciudad);
 }
 public void quitarCiudad(String name) {
	 ciudades.remover(ciudad -> ciudad.getName().equalsIgnoreCase(nombre));
 }
 public int numeroDeCiudades() {
     return ciudades.size();
 }
 public Long poblacionTotal() {
     Long total = 0L;

     for (City city : ciudades) {
         total += city.getPopulation();
     }
     return total;
 }
 public City ciudadconMayorPoblacion() {
     if (ciudades.isEmpty()) {
         return null;
     }

     City biggest = ciudades.get(0);

     for (City city : ciudades) {
         if (city.getPopulation() > biggest.getPopulation()) {
             biggest = city;
         }
     }
     return biggest;
 }
 public void ciudadporProvincia(Integer provinceCode) {
     for (City city : ciudades) {
         if (city.getProvinceCode().equals(provinceCode)) {
             System.out.println(city);
         }
     }
 }
}