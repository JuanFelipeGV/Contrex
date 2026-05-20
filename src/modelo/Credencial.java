package modelo;

public class Credencial {

    private String sitioWeb;
    private String usuario;
    private String contraseña;

    public Credencial() {
    }

    public Credencial(String sitioWeb,
                      String usuario,
                      String contraseña) {

        this.sitioWeb = sitioWeb;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public void mostrarCredencial() {

        System.out.println(this);
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Credencial { " +
                "sitioWeb = '" + sitioWeb + '\'' +
                ", usuario = '" + usuario + '\'' +
                ", contraseña = '" + contraseña + '\'' +
                '}';
    }
}