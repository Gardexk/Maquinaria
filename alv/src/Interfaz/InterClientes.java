
package Interfaz;

import Visual.Clientes;
import java.util.List;


public interface InterClientes {
    public void registrar (Clientes clie) throws Exception;
    public void modificar (Clientes clie) throws Exception;
    public void eliminar (Clientes clie) throws Exception;
    public List<Clientes> listar() throws Exception;
}
