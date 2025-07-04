package controllers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Sets {

    public Sets() {
    }

    public static Set<String> construirHashSet() {
       //vamos a crear una  variable de tipo Set//
        Set<String> palabra = new HashSet<>();
        palabra.add("Laptop");
        palabra.add("Manzana");
        palabra.add("Pera");
        palabra.add("celular"); 
        palabra.add("Laptop");
        palabra.add("Celular");
        return palabra;
    }

    public  static  Set<String> construirLinkedHashSet() {
      //lo mismo solo cambiamos la implementacion//
        Set<String> palabra = new LinkedHashSet<>();
        palabra.add("Laptop");
        palabra.add("Manzana");
        palabra.add("Pera");
        palabra.add("celular"); 
        palabra.add("Laptop");
        palabra.add("Celular");
        return palabra;
    }

    public static Set<String> construirTreeSet() {
        // una variable de tipo Set//
        Set<String> palabra = new TreeSet<>();
        palabra.add("Laptop");
        palabra.add("Manzana");
        palabra.add("Pera");
        palabra.add("celular"); 
        palabra.add("Laptop");
        palabra.add("Celular");
        return palabra;
    }

public static Set<String> construirTreeSetConComparador() {
    // una variable de tipo Set con un comparador//
    Comparator<String> comparador = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            int resultado = Integer.compare(s1.length(), s2.length());
            if (resultado == 0) {
                resultado = s1.compareTo(s2);
            }
            return resultado;
        }
    };

    Set<String> palabra = new TreeSet<>(comparador);
    palabra.add("Laptop");
    palabra.add("Manzana");
    palabra.add("Pera");
    palabra.add("Celular"); 
    palabra.add("laptop");
    palabra.add("celular");
    palabra.add("Celulas");
    return palabra;
}
// un quinto metodo donde el comparador sea diferente sea inverso
public static Set<String> construirTreeSetConComparadorInverso() {
    Comparator<String> comparadorInverso = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            int resultado = Integer.compare(s2.length(), s1.length()); 
            if (resultado == 0) {
                resultado = s2.compareTo(s1); 
            }
            return resultado;
        }
    };

    Set<String> palabra = new TreeSet<>(comparadorInverso);
    palabra.add("Laptop");
    palabra.add("Manzana");
    palabra.add("Pera");
    palabra.add("Celular"); 
    palabra.add("Laptop");
    palabra.add("celular");
    palabra.add("Celulas");
    return palabra;
}

public static void runTreeSetConComparadorInverso() {
    Set<String> palabra = Sets.construirTreeSetConComparadorInverso();
    System.out.println("|----TreeSet con Comparador Inverso--|");
    for (String p : palabra) {
        System.out.println(p);
    }
    System.out.println("-------------------------------------\n");
}

}