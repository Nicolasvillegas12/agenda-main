package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan", "juanchos", "Calle 12453", "1234567890", "juan@example.com");
        Contacto contacto2 = new Contacto("Mariana", "ry", "Calle 45658", "9876543210", "maria@gmail.com");
        Contacto contacto3 = new Contacto("Pedro juan", "Peter albeiro", "Calle 78589", "5555555555", "pedro@gmail.com");

        // Crear grupo
        LinkedList<Contacto> contactosGrupo = new LinkedList<>();
        Grupo grupo = new Grupo("Amigos", contactosGrupo, Categoria.AMIGOS);
        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);

        // Crear reunión
        LinkedList<Contacto> asistentesReunion = new LinkedList<>();
        Reunion reunion = new Reunion("Reunión amigos", "2025-08-26", "18:70", asistentesReunion);
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto2);

        // Crear agenda
        List<Contacto> contactosAgenda = new LinkedList<>();
        List<Grupo> gruposAgenda = new LinkedList<>();
        List<Reunion> reunionesAgenda = new LinkedList<>();
        Agenda agenda = new Agenda("Mi Agenda", contactosAgenda, gruposAgenda, reunionesAgenda);
        agenda.getContactos().add(contacto1);
        agenda.getContactos().add(contacto2);
        agenda.getContactos().add(contacto3);
        agenda.getGrupos().add(grupo);
        agenda.getReuniones().add(reunion);

        // Imprimir información
        System.out.println("Contactos:");
        for (Contacto contacto : agenda.getContactos()) {
            System.out.println(contacto.toString());
        }

        System.out.println("\nGrupos:");
        for (Grupo grupoAgenda : agenda.getGrupos()) {
            System.out.println(grupoAgenda.toString());
            for (Contacto contactoGrupo : grupoAgenda.getContactos()) {
                System.out.println(contactoGrupo.toString());
            }
        }

        System.out.println("\nReuniones:");
        for (Reunion reunionAgenda : agenda.getReuniones()) {
            System.out.println(reunionAgenda.toString());
            for (Contacto asistenteReunion : reunionAgenda.getAsistentes()) {
                System.out.println(asistenteReunion.toString());
            }
        }
    }
}