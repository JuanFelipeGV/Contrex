package utilidades;

public class Validaciones {

    public static boolean validarCorreo(String correo) {

        return correo.contains("@");
    }

    public static boolean validarContraseña(String contraseña) {

        return contraseña.length() >= 8;
    }
}