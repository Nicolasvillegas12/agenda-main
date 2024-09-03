package co.edu.uniquindio.poo;
import java.util.LinkedList;


import java.util.List;

public class Agenda {
    private String nombre;
    private List<Contacto> contactos;
    private List<Grupo> grupos;
    private List<Reunion> reuniones;

    public Agenda(String nombre, List<Contacto> contactos, List<Grupo> gruposContactos, List<Reunion> reuniones) {
        this.nombre = nombre;
        this.contactos = new LinkedList<>();
        this.grupos = new LinkedList<>();
        this.reuniones = new LinkedList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(List<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    @Override
    public String toString() {
        return "La agenda se llama" + nombre + ", los contactos son:" + contactos + ", el grupo es: " + grupos + " y la reunion es: "+ reuniones;
    }
    
    
}
