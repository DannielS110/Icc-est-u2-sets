package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorTelefono implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // Por apellido
        int resultComparacionApellido=o1.getApellido().compareToIgnoreCase(o2.getApellido());
        int resultComparacionNombre=o1.getNombre().compareToIgnoreCase(o2.getNombre());
        //Si son iguales, por nombre
        if(resultComparacionApellido!=0){
            return resultComparacionApellido;
        }
       
        //Si nombre igual, por telefono
        if(resultComparacionNombre!=0){
            return resultComparacionNombre;
        }

        int resultComparacionTelefono=o2.getTelefono().compareToIgnoreCase(o1.getTelefono());
        return resultComparacionTelefono;
    }
    
}