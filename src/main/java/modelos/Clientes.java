package modelos;

public class Clientes {
    // Definimos las variables del cliente
    private int idCliente;
    private String nombre;
    private String direccion;
    private String tipoDocumento;
    private String numeroDocumento;

    // Implementamos un constructor vacío
    public Clientes() {
    }

    // Implementamos un constructor con todos los atributos
    public Clientes(int idCliente, String nombre, String direccion, String tipoDocumento, String numeroDocumento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    // Métodos getter y setter para cada atributo

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
