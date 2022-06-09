package controladorCliente;
//@michi y gaby

import java.time.LocalDate;
import java.util.List;
import modeloCliente.Factura;
import servicioCliente.FacturaServicio;

public class FacturaControl {
    private final FacturaServicio facturaServicio = new FacturaServicio();
    public Factura crear(String[] params){
        var fechaRegistros = LocalDate.of(Integer.valueOf(params[3]),
                  Integer.valueOf(params[4]),
                  Integer.valueOf(params[5]));
        var factura = new Factura(Integer.valueOf(params[0]),params[1],
                params[2],fechaRegistros);
        this.facturaServicio.crear(factura);
        return factura;
    }
    public List<Factura>listar(){
        return this.facturaServicio.listar();
    }
    public Factura getByCodigo(Object i){
        if((int)i>0)
            return this.facturaServicio.getByCodigo((int)i);
        else
            return this.facturaServicio.getByCodigo(0);
    }

}
