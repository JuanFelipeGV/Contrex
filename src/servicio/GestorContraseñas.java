package servicio;

import modelo.Credencial;

import java.util.ArrayList;

public class GestorContraseñas {

    private ArrayList<Credencial> listaCredenciales;

    public GestorContraseñas() {

        listaCredenciales = new ArrayList<>();
    }

    public void agregarCredencial(Credencial credencial) {

        listaCredenciales.add(credencial);

        System.out.println("Credencial agregada.");
    }

    public void mostrarCredenciales() {

        for (Credencial c : listaCredenciales) {

            System.out.println(c);
        }
    }

    public void eliminarCredencial(String sitioWeb) {

        listaCredenciales.removeIf(
                c -> c.getSitioWeb().equalsIgnoreCase(sitioWeb)
        );

        System.out.println("Credencial eliminada.");
    }

    public ArrayList<Credencial> getListaCredenciales() {

        return listaCredenciales;
    }

    @Override
    public String toString() {
        return "GestorContraseñas{" +
                "listaCredenciales=" + listaCredenciales +
                '}';
    }
}