package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Concesionario {

    private String nombre;
    private LinkedList<Usuario> listaUsuarios;
    private LinkedList<Vehiculo> listaVehiculos;

    public Concesionario(String nombre, LinkedList<Usuario> listaUsuarios, LinkedList<Vehiculo> listaVehiculos) {
        this.nombre = nombre;
        this.listaUsuarios = listaUsuarios;
        this.listaVehiculos = listaVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(LinkedList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

}
