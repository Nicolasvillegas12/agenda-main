package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private String fecha;
    private String hora;
    private LinkedList<Contacto> asistentes;

    

    public Reunion(String descripcion, String fecha, String hora, LinkedList<Contacto> asistentes) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new LinkedList<>();
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "la reunion es de:" + descripcion + ", la fecha es: " + fecha + "y la hora: " + hora;
    }


    public LinkedList<Contacto> getAsistentes() {
        return asistentes;
    }


    public void setAsistentes(LinkedList<Contacto> asistentes) {
        this.asistentes = asistentes;
    }
    public void agregarAsistente(Contacto asistente) {
        asistentes.add(asistente);
    }

    public void eliminarAsistente(Contacto asistente) {
        asistentes.remove(asistente);
    }
     
}
