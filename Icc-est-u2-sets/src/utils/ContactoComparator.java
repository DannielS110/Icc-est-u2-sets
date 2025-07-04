package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto o1, Contacto o2) {
         int resultComparacion = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (resultComparacion != 0) {
            return resultComparacion;
        }
        int resultComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resultComparacionNombre;
    }
}