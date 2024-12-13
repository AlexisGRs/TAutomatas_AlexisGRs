

public class Gramatica {

    private String cadena;
    private int posicion;
    private String sucesion;

    public Gramatica(String cadena) {
        this.cadena = cadena;
        this.posicion = 0;
        this.sucesion = "";
    }

    private boolean D() {
        if (posicion < cadena.length() && Character.isDigit(cadena.charAt(posicion))) {
            sucesion += cadena.charAt(posicion);
            System.out.println(sucesion + " |R| ");
            posicion++;
            return true;
        }
        return false;
    }
    
    private boolean R() {
        if (posicion < cadena.length() && Character.isDigit(cadena.charAt(posicion))) {
            System.out.println(sucesion + " |D| R ");
            return D() && R(); 
        }
        return true; 
    }
    
    private boolean EN() {
        System.out.println("EN -> |D| R");
        return D() && R();
    }
    
 

    public boolean esValido() {
         boolean resultado = EN() && posicion == cadena.length();
        if (resultado) {
            System.out.println("La cadena es valida.");
        } else {
            System.out.println("La cadena es invalida.");
        }
        return resultado;
    }
    
}