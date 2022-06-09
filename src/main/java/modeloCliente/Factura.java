package modeloCliente;
//@michi y gaby
import java.time.LocalDate;
import java.time.LocalTime;

public class Factura {
    private int numeroProducto;
    private LocalDate fechaRegistro;
    private int precio;
    private LocalTime hora;
    private String direccion;
    private String numeroTelefono;

    public Factura(int numeroProducto, LocalDate fechaRegistro, int precio, LocalTime hora, long id, String direccion, String numeroTelefono) {
        this.numeroProducto = numeroProducto;
        this.fechaRegistro = fechaRegistro;
        this.precio = precio;
        this.hora = hora;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public Factura(int numeroProducto,String direccion,String numeroTelefono, LocalDate fechaRegistro){
        this.numeroProducto = numeroProducto;
        this.fechaRegistro = fechaRegistro;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }
    public Factura(){
        
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroProducto=" + numeroProducto + ", fechaRegistro=" + fechaRegistro + ", precio=" + precio + ", direccion=" + direccion + ", numeroTelefono=" + numeroTelefono + '}';
    }




    
}
