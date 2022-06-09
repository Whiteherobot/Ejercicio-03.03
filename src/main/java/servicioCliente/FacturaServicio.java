package servicioCliente;
//@michi y gaby

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Factura;

public class FacturaServicio implements IFacturaServicio{
    private final List<Factura> facturaList = new ArrayList<>();
    @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }

    @Override
    public Factura getByCodigo(int i) {
        var factura = new Factura();
        for(Factura fac:this.facturaList){
            if(fac.getNumeroProducto()==i){
                factura=fac;
                break;
            }
        }
        return factura;
    }
    
}
