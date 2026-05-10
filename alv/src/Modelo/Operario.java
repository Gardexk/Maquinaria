
package Modelo;

/**
 *
 * @author Danny
 */
public class Operario {
    private int idOperario;
    private String nomOperario;
    private String direccion;
    private String telefono;
    private String correo;

    public Operario() {
    }

    public Operario(int idOperario, String nomOperario, String direccion, String telefono, String correo) {
        this.idOperario = idOperario;
        this.nomOperario = nomOperario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdOperario() {
        return idOperario;
    }

    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public String getNomOperario() {
        return nomOperario;
    }

    public void setNomOperario(String nomOperario) {
        this.nomOperario = nomOperario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
