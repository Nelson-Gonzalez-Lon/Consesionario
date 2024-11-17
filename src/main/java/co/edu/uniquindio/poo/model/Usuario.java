package co.edu.uniquindio.poo.model;

public class Usuario {

    public String nombre;
    public String id;
    public String clave;
    public String correo;
    public String preguntaRecuperación;
    public String palabraRecuperación;

    public Usuario(String nombre, String id, String clave, String correo, String preguntaRecuperación,
            String palabraRecuperación) {
        this.nombre = nombre;
        this.id = id;
        this.clave = clave;
        this.correo = correo;
        this.preguntaRecuperación = preguntaRecuperación;
        this.palabraRecuperación = palabraRecuperación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPreguntaRecuperación() {
        return preguntaRecuperación;
    }

    public void setPreguntaRecuperación(String preguntaRecuperación) {
        this.preguntaRecuperación = preguntaRecuperación;
    }

    public String getPalabraRecuperación() {
        return palabraRecuperación;
    }

    public void setPalabraRecuperación(String palabraRecuperación) {
        this.palabraRecuperación = palabraRecuperación;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", id=" + id + ", clave=" + clave + ", correo=" + correo
                + ", preguntaRecuperación=" + preguntaRecuperación + ", palabraRecuperación=" + palabraRecuperación
                + "]";
    }

}
