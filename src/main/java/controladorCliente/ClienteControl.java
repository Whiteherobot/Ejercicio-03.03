package controladorCliente;
//@michi y gaby

import java.time.LocalDate;
import java.util.List;
import modeloCliente.Cliente;
import servicioCliente.ClienteServicio;

public class ClienteControl {
    private final ClienteServicio clienteServicio = new ClienteServicio();
    public Cliente crear(String [] params){
        var fechaDePedidos = LocalDate.of(Integer.valueOf(params[3]),
                Integer.valueOf(params[4]),
                Integer.valueOf(params[5]));
                
        var cliente = new Cliente(Integer.valueOf(params[0]),params[1],
                params[2],fechaDePedidos);
        this.clienteServicio.crear(cliente);
        return cliente;
    }
    public List<Cliente> listar(){
        return this.clienteServicio.listar();
        
    }
    public Cliente getByCodigo(Object i) {
        if((int)i>0)
            return this.clienteServicio.getByCodigo((int)i);
        else
            return this.clienteServicio.getByCodigo(0);
    }
}
