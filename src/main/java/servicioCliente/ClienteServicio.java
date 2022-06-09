package servicioCliente;
//@michi y gaby

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Cliente;

public class ClienteServicio implements IClienteServicio {
    private final List<Cliente> clienteList = new ArrayList<>();

    @Override
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> listar() {
        return this.clienteList;
    }

    @Override
    public Cliente getByCodigo(int i) {
        var cliente = new Cliente();
        for(Cliente cli:this.clienteList){
            if(cli.getCodigo()==i){
                cliente=cli;
                break;
            }
        }
        return cliente;
    }
    
}
