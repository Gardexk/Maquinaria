
package Interfaz;

import Visual.Usuarios;
import java.util.List;


public interface InterUsuarios {
    public void registrar (Usuarios user) throws Exception;
    public void modificar (Usuarios user) throws Exception;
    public void eliminar (Usuarios user) throws Exception;
    public List<Usuarios> listar() throws Exception;
}
