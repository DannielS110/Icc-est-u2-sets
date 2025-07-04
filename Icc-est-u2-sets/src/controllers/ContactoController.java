package controllers;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorTelefono;
import utils.ContactoComparatorHash;

public class ContactoController {

    public void runTreeContacto() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
       agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("\nAgenda ordenada por Apellido - Nombre:");
        for (Contacto c : agenda) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
        }
    }

    public void runTreeContactoNumero() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorTelefono());
agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("\nAgenda ordenada por Apellido - Nombre - Telefono:");
        for (Contacto c : agenda) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
        }
    }

    public void runTreeContactoHash() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHash());
    agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("\nAgenda ordenada por HASHCODE:");
        for (Contacto c : agenda) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
        }
    }
}