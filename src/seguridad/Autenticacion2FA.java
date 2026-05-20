package seguridad;

public class Autenticacion2FA implements Autenticable {

    private String codigo;

    public Autenticacion2FA() {
    }

    public Autenticacion2FA(String codigo) {

        this.codigo = codigo;
    }

    @Override
    public void autenticar() {

        System.out.println("Código 2FA enviado al usuario.");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Autenticacion2FA{" +
                "codigo='" + codigo + '\'' +
                '}';
    }
}