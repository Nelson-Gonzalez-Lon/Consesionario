package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Concesionario {

    private String nombre;
    private LinkedList<Usuario> listaUsuarios;
    private LinkedList<Vehiculo> listaVehiculos;
    private LinkedList<Cliente> listaClientes;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.listaUsuarios = new LinkedList<>();
        this.listaVehiculos = new LinkedList<>();
        this.listaClientes = new LinkedList<>();
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

    // CRUD Administrador
    public Administrador buscarAdministrador(String id) {
        Administrador administradorEncontrado = null;
        for (Usuario usuarioTomado : listaUsuarios) {
            Administrador administradorTomado = (Administrador) usuarioTomado;
            if (administradorTomado.getId().equals(id)) {
                return administradorEncontrado;
            }
        }
        return administradorEncontrado;
    }

    public void guardarAdministrador(Administrador administrador) {
        Administrador administradorEncontrado = buscarAdministrador(administrador.getId());
        if (administradorEncontrado != null) {
            listaUsuarios.add(administradorEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra un administrador registrado con esta I.D.");
        }
    }

    public void eliminarAdministrador(Administrador administrador) {
        Administrador administradorEncontrado = buscarAdministrador(administrador.getId());
        if (administradorEncontrado != null) {
            listaUsuarios.remove(administradorEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra un administrador registrado con esta I.D.");
        }
    }

    public void actualizarAdministrador(Administrador administrador, String nombre, String clave, String correo,
            String preguntaRecuperación,
            String palabraRecuperación) {
        administrador.setClave(clave);
        administrador.setCorreo(correo);
        administrador.setNombre(nombre);
        administrador.setPreguntaRecuperación(preguntaRecuperación);
        administrador.setPalabraRecuperación(palabraRecuperación);
    }
    
    // CRUD Empleado
    public Empleado buscarEmpleado(String id) {
        Empleado empleadoEncontrado = null;
        for (Usuario usuarioTomado : listaUsuarios) {
            Empleado empleadoTomado = (Empleado) usuarioTomado;
            if (empleadoTomado.getId().equals(id)) {
                return empleadoEncontrado;
            }
        }
        return empleadoEncontrado;
    }

    public void guardarEmpleado(Empleado empleado) {
        Empleado empleadoEncontrado = buscarEmpleado(empleado.getId());
        if (empleadoEncontrado != null) {
            listaUsuarios.add(empleadoEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra un empleado registrado con esta I.D.");
        }
    }

    public void eliminarEmpleado(Empleado empleado) {
        Empleado empleadoEncontrado = buscarEmpleado(empleado.getId());
        if (empleadoEncontrado != null) {
            listaUsuarios.remove(empleadoEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra un empleado registrado con esta I.D.");
        }
    }

    public void actualizarEmpleado(Empleado empleado, String nombre, String clave, String correo,
            String preguntaRecuperación,
            String palabraRecuperación) {
        empleado.setClave(clave);
        empleado.setCorreo(correo);
        empleado.setNombre(nombre);
        empleado.setPreguntaRecuperación(preguntaRecuperación);
        empleado.setPalabraRecuperación(palabraRecuperación);
    }

    // CRUD Cliente
    public Cliente buscarCliente(String id) {
        Cliente clienteEncontrado = null;
        for (Cliente clienteTomado : listaClientes) {
            if (clienteTomado.getId().equals(id)) {
                return clienteEncontrado;
            }
        }
        return clienteEncontrado;
    }

    public void guardarCliente(Cliente cliente) {
        Cliente clienteEncontrado = buscarCliente(cliente.getId());
        if (clienteEncontrado != null) {
            listaClientes.add(clienteEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra un cliente registrado con esta I.D.");
        }
    }

    public void eliminarCliente(Cliente cliente) {
        Cliente clienteEncontrado = buscarCliente(cliente.getId());
        if (clienteEncontrado != null) {
            listaClientes.remove(clienteEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra un cliente registrado con esta I.D.");
        }
    }

    public void actualizarCliente(Cliente cliente, String nombre, String correo) {
        cliente.setCorreo(correo);
        cliente.setNombre(nombre);
    }

    // CRUD Vehiculo
    public Vehiculo buscarVehiculo(String codigo) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo vehiculoTomado : listaVehiculos) {
            if (vehiculoTomado.getCodigo().equals(codigo)) {
                return vehiculoEncontrado;
            }
        }
        return vehiculoEncontrado;
    }

    public void guardarVehiculo(Vehiculo vehiculo) {
        Vehiculo vehiculoEncontrado = buscarVehiculo(vehiculo.getCodigo());
        if (vehiculoEncontrado != null) {
            listaVehiculos.add(vehiculoEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra un vehiculo registrado con este código");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        Vehiculo vehiculoEncontrado = buscarVehiculo(vehiculo.getCodigo());
        if (vehiculoEncontrado != null) {
            listaVehiculos.remove(vehiculoEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra un vehiculo registrado con esta I.D.");
        }
    }

    //provando cosas

    
    public void actualizarVehiculo(Vehiculo vehiculoNuevo){
        Vehiculo vehiculoViejo = buscarVehiculo(vehiculoNuevo.getCodigo());
        listaVehiculos.remove(vehiculoViejo);
        listaVehiculos.add(vehiculoNuevo);
    }
}
