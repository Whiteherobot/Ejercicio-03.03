package modeloCliente;
//@michi y gaby
import java.time.LocalDate;

public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private LocalDate fechaDePedidos;

    public Cliente(int codigo, String nombre, String apellido,
           LocalDate fechaDePedidos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDePedidos = fechaDePedidos;
    }
    public Cliente(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDePedidos() {
        return fechaDePedidos;
    }

    public void setFechaDePedidos(LocalDate fechaDePedidos) {
        this.fechaDePedidos = fechaDePedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo 
                + ", nombre=" + nombre + ", apellido=" 
                + apellido + ", fechaDePedidos=" + fechaDePedidos + '}';
    }
    
}
