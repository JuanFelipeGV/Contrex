package modelo;

public class Admin extends Usuario {

    private String nivelAcceso;

    public Admin() {
    }

    public Admin (int id,
                         String nombre,
                         String correo,
                         String contraseñaMaestra,
                         String nivelAcceso) {

        super(id, nombre, correo, contraseñaMaestra);

        this.nivelAcceso = nivelAcceso;
    }

    public void gestionarSistema() {

        System.out.println("Administrador gestionando el sistema...");
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nivelAcceso='" + nivelAcceso + '\'' +
                "} " + super.toString();
    }
}