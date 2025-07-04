package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";

        String textoLargo = """
        La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
        Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
        En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
        """;

        System.out.println("Ejercicios 1");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 3, 2, 45}));
        System.out.println("--------");

        System.out.println("Ejercicios 2");
        System.out.println(isograma("murcielago"));
        System.out.println("--------");
        System.out.println(isograma("camaleon"));
        System.out.println("--------");

        System.out.println("Ejercicios 3");
        System.out.println("El texto tiene " + contarPalabrasUnicasConSet(textoLargo) + " palabras unicas");
        System.out.println("--------");
        System.out.println(contarPalabrasUnicas(texto1));
        System.out.println("--------");
        System.out.println(contarPalabrasUnicas(texto2));
        System.out.println("--------");

        System.out.println("Ejercicios 4");
        System.out.println("Palabras únicas en el texto 1: " + obtenerPalabrasUnicas(texto1));
        System.out.println("Palabras únicas en el texto 2: " + obtenerPalabrasUnicas(texto2));
        System.out.println("--------");

        System.out.println("Ejercicios 5");
        compararTextos(texto1, texto2);
        System.out.println("--------");
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> conjunto = new HashSet<>();
        for (int numero : numeros) {
            if (!conjunto.add(numero)) {
                return true;
            }
        }
        return false;
    }

    public boolean isograma(String palabra) {
        Set<Character> conjunto = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!conjunto.add(c)) {
                return false;
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        String[] palabras = frase.split(" ");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            boolean esUnica = true;
            for (int j = 0; j < i; j++) {
                if (palabras[i].equals(palabras[j])) {
                    esUnica = false;
                    break;
                }
            }
            if (esUnica) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPalabrasUnicasConSet(String texto) {
        String[] palabras = texto.split("\\s+");
        Set<String> unicas = new HashSet<>();
        for (String palabra : palabras) {
            unicas.add(palabra);
        }
        return unicas.size();
    }

    public static Set<String> obtenerPalabrasUnicas(String frase) {
        Set<String> palabrasUnicas = new HashSet<>();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            palabrasUnicas.add(palabra);
        }
        return palabrasUnicas;
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabras1 = obtenerPalabrasUnicas(texto1);
        Set<String> palabras2 = obtenerPalabrasUnicas(texto2);

        Set<String> comunes = new HashSet<>(palabras1);
        comunes.retainAll(palabras2);

        Set<String> soloTexto1 = new HashSet<>(palabras1);
        soloTexto1.removeAll(palabras2);

        Set<String> soloTexto2 = new HashSet<>(palabras2);
        soloTexto2.removeAll(palabras1);

        System.out.println("Ejercicio");
        System.out.println("Texto 1: " + palabras1.size() + " palabras únicas");
        System.out.println("Texto 2: " + palabras2.size() + " palabras únicas");
        System.out.println("Cuantas Palabras comunes: " + comunes.size());

        int totalPalabras = palabras1.size() + palabras2.size();
        double porcentaje = (comunes.size() * 100.0) / totalPalabras;
        System.out.printf("Coincidencia léxica: %.2f%%\n", porcentaje);

        System.out.println("Solo en texto 1: " + soloTexto1);
        System.out.println("Solo en texto 2: " + soloTexto2);
    }
}
