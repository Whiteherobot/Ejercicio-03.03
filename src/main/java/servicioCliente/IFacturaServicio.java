package servicioCliente;
//@michi y gaby

import java.util.List;
import modeloCliente.Factura;

public interface IFacturaServicio {
    public Factura crear( Factura factura);
    public List<Factura> listar();
    public Factura getByCodigo( int i);
}
