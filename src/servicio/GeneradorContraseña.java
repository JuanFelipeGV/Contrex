package servicio;

import java.util.Random;

public class GeneradorContraseña {

    private final String caracteres =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";

    public GeneradorContraseña() {
    }

    public String generar() {

        return generar(8);
    }

    public String generar(int longitud) {

        Random random = new Random();

        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {

            int indice = random.nextInt(caracteres.length());

            contraseña.append(caracteres.charAt(indice));
        }

        return contraseña.toString();
    }

    @Override
    public String toString() {
        return "GeneradorContraseña{}";
    }
}