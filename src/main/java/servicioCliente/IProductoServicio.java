package servicioCliente;
//@michi y gaby 

import java.util.List;
import modeloCliente.Producto;

public interface IProductoServicio {
    public Producto crear(Producto producto);
    public List<Producto> listar();
    public Producto getByCodigo(int i);
}
