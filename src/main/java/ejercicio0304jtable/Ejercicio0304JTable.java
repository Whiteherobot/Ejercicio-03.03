
package ejercicio0304jtable;

import vistaCliente.VistaClienteA;
import vistaCliente.VistaFactura;
import vistaCliente.VistaProducto;

public class Ejercicio0304JTable {


    public static void main(String[] args) {
        
        var v1 = new VistaClienteA("Cliente");
        v1.setVisible(true);
        var v2 = new VistaProducto("Producto");
        v2.setVisible(true);
        var v3= new VistaFactura("Factura");
        v3.setVisible(true);

    }
}
