package tema4;

class Entrada {
	private String codigo;
	private String comprador;
	private Double precio;
	private String tipo;
	private Boolean vendida;
	public Entrada(String codigo, String comprador, String tipo) {
        this.codigo = codigo;
        this.comprador = comprador;
        this.tipo = tipo;
    }

	public String getCodigo() {
	        return codigo;
	}
    public Double getPrecio() {
		        return precio;
    }
    public String getTipo() {
			      return tipo;
    }
    public String getComprador() {
	      return comprador;
}
   public boolean isVendida = false;
    public void setTipo(String tipo) {
        this.tipo= tipo;
    }
    public void setVendida(Boolean isVendida) {
        this.isVendida= isVendida;
    }
    public String toString() {
        return "";
    }			
}
    



