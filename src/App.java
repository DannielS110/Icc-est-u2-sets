import controllers.ContactoController;
import controllers.Sets;

import java.util.Set;
import java.util.TreeSet;
public class App {
    public static void main(String[] args) {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
        runTreeSetConComparadorInverso();

        // Contactos
        ContactoController contactos = new ContactoController();
        contactos.runTreeContacto();         // Orden por Apellido y Nombre
        contactos.runTreeContactoNumero();   // Orden por Teléfono
        contactos.runTreeContactoHash();    // Orden por HashCode
    }

    public static void runHashSet() {
        Set<String> palabra = Sets.construirHashSet();
        System.out.println("|----------HashSet|----------------| ");
        for (String p : palabra) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------\n");
    }

    public static void runLinkedHashSet() {
        Set<String> palabra = Sets.construirLinkedHashSet();
        System.out.println("|----------LinkedHashSet|-----------|");
        for (String p : palabra) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------\n");
    }

    public static void runTreeSet() {
        Set<String> palabra = Sets.construirTreeSet();
        System.out.println("|----------TreeSet|-----------------|");
        for (String p : palabra) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------\n");
    }

    public static void runTreeSetConComparador() {
        Set<String> palabra = Sets.construirTreeSetConComparador();
        System.out.println("|------TreeSet con Comparador|------|");
        for (String p : palabra) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------\n");
    }

    public static void runTreeSetConComparadorInverso() {
        Set<String> palabra = Sets.construirTreeSetConComparadorInverso();
        System.out.println("|--TreeSet con Comparador Inverso--|");
        for (String p : palabra) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------\n");
    }
}