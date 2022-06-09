package modeloCliente;
//@michi

import java.time.LocalDate;

public class Producto {
   private int costoEnvio;
   private String direccionEnvio;
   private String reembolso;
   private LocalDate fechaDeEnvio;
   private String nombre;

    public Producto(int costoEnvio, String direccionEnvio, String reembolso, LocalDate fechaDeEnvio, 
            String nombre) {
        this.costoEnvio = costoEnvio;
        this.direccionEnvio = direccionEnvio;
        this.reembolso = reembolso;
        this.fechaDeEnvio = fechaDeEnvio;
        this.nombre = nombre;
    }
    
      public Producto(int costoEnvio, String nombre, String direccionEnvio, LocalDate fechaDeEnvio) {
        this.costoEnvio = costoEnvio;
        this.direccionEnvio = direccionEnvio;
        this.fechaDeEnvio = fechaDeEnvio;
        this.nombre = nombre;
    }
    public Producto(){
        
    }

    public int getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(int costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getReembolso() {
        return reembolso;
    }

    public void setReembolso(String reembolso) {
        this.reembolso = reembolso;
    }

    public LocalDate getFechaDeEnvio() {
        return fechaDeEnvio;
    }

    public void setFechaDeEnvio(LocalDate fechaDeEnvio) {
        this.fechaDeEnvio = fechaDeEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "Costo del envio=" + costoEnvio 
                + ", Direccion de envio=" + direccionEnvio 
                + ", Fecha de envio=" 
                + fechaDeEnvio + ", Nombre del producto=" + nombre + '}';
    }
   
}
