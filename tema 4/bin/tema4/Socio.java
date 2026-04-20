package tema4;

import java.util.ArrayList;

public class Socio {
	private String nombre;
	private Double cuotaMensual;
	private Boolean activo;
	private int numSocio;
	private static Double totalCuotasSociosActivos;

public Socio(int numSocio, String nombre, double cuota) {
    this.nombre = nombre;
    this.numSocio = numSocio;
    this.cuotaMensual = cuota;
}
}
