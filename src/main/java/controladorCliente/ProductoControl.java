package controladorCliente;
//@michi y gaby

import java.time.LocalDate;
import java.util.List;
import modeloCliente.Producto;
import servicioCliente.ProductoServicio;

public class ProductoControl {
    private final ProductoServicio productoServicio = new ProductoServicio();
    public Producto crear(String [] params){
        var fechaDePedidos = LocalDate.of(Integer.valueOf(params[3]),
                Integer.valueOf(params[4]),
                Integer.valueOf(params[5]));
        var producto = new Producto(Integer.valueOf(params[0]),params[1],
                params[2],fechaDePedidos);
                
        this.productoServicio.crear(producto);
        return producto;
    }
    public List<Producto> listar(){
        return this.productoServicio.listar();
        
    }
    public Producto getByCodigo(Object i) {
        if((int)i>0)
            return this.productoServicio.getByCodigo((int)i);
        else
            return this.productoServicio.getByCodigo(0);
    }
}
