package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {

    private String nombre;
    private LinkedList<Contacto> contactos;
    private Categoria categoria;



    public Grupo(String nombre, LinkedList<Contacto> contactos, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "el curso se llama : " + nombre + "y la categoria es : "+categoria;
    }

     public LinkedList<Contacto> getContactos() {
        return contactos;
    }
    
    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(Contacto contacto) {
        if (validarContactoRepetido(contacto.getNombre(), contacto.getTelefono())) {
            mostrarMensaje("Error, el contacto " + contacto.getNombre() + " con numero de teléfono: " + contacto.getTelefono() + " ya existe en el grupo");
        } else {
            contactos.add(contacto);
        }
    }
    
    public boolean validarContactoRepetido(String nombre, String telefono) {
        boolean contactoRepetido = false;
        for (Contacto contacto: contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                contactoRepetido = true;
            }
        }
        return contactoRepetido;
    }

    public void actualizarContacto(String telefono, String alias, String direccion, String email) {
        for (Contacto contacto: contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                contacto.setAlias(alias);
                contacto.setDireccion(direccion);
                contacto.setEmail(email);
                break;
            }
        }
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    
        
}
    

    
    


