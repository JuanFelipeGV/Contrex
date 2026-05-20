package modelo;

public class Usuario {

    private int id;
    private String nombre;
    private String correo;
    private String contraseñaMaestra;

    public Usuario() {
    }

    public Usuario(int id, String nombre,
                   String correo,
                   String contraseñaMaestra) {

        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseñaMaestra = contraseñaMaestra;
    }

    public void iniciarSesion() {
        System.out.println(nombre + " inició sesión.");
    }

    public void cerrarSesion() {
        System.out.println(nombre + " cerró sesión.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseñaMaestra() {
        return contraseñaMaestra;
    }

    public void setContraseñaMaestra(String contraseñaMaestra) {
        this.contraseñaMaestra = contraseñaMaestra;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}