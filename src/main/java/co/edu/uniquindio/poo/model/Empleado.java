package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Empleado extends Usuario {

    private LinkedList<Transaccion> listaTransacciones;
    private LinkedList<Cliente> listaClientes;
    private String numeroCuenta;

    public Empleado(String nombre, String id, String clave, String correo, String preguntaRecuperación,
            String palabraRecuperación, LinkedList<Transaccion> listaTransacciones, LinkedList<Cliente> listaClientes,
            String numeroCuenta) {
        super(nombre, id, clave, correo, preguntaRecuperación, palabraRecuperación);
        this.listaTransacciones = listaTransacciones;
        this.listaClientes = listaClientes;
        this.numeroCuenta = numeroCuenta;
    }

    public LinkedList<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(LinkedList<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public LinkedList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(LinkedList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
