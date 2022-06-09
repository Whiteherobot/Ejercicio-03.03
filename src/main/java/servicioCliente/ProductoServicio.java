package servicioCliente;
//@michi y gaby

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Producto;

public class ProductoServicio implements IProductoServicio{
    private final List<Producto> productoList = new ArrayList<>();

    @Override
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
        return producto;
        
    }

    @Override
    public List<Producto> listar() {
        return this.productoList;
    }

    @Override
    public Producto getByCodigo(int i) {
        var producto = new Producto();
        for(Producto pro:this.productoList){
            if(pro.getCostoEnvio()==i){
                producto=pro;
                break;
            }
        }
        return producto;
    }
}