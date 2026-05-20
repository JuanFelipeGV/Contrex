package seguridad;

public class Cifrador {

    public Cifrador() {
    }

    public String cifrar(String texto) {

        String cifrado = "";

        for (int i = 0; i < texto.length(); i++) {

            cifrado += (char)(texto.charAt(i) + 3);
        }

        return cifrado;
    }

    public String cifrar(String texto, int desplazamiento) {

        String cifrado = "";

        for (int i = 0; i < texto.length(); i++) {

            cifrado += (char)(texto.charAt(i) + desplazamiento);
        }

        return cifrado;
    }
}