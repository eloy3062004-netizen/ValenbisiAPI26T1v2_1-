package tema4;

public class Contacto {
    private String nombre;
    private String telefono;
    private String mail;
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = "";
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getMail() {
        return mail;
    }
    public String toString() {
        return "Nombre: " + nombre +
               ", Teléfono: " + telefono +
               ", Email: " + mail;
    }
}
