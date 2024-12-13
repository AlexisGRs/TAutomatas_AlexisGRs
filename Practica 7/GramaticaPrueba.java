public class GramaticaPrueba {
    private String cadena;
    private int posicion;

    public GramaticaPrueba(String cadena) {
        this.cadena = cadena;
        this.posicion = 0; 
        
    }
    
    public boolean D() {
        if (posicion < cadena.length() && Character.isDigit(cadena.charAt(posicion))) {
            System.out.println("-> " + cadena.charAt(posicion));
            posicion++;
            return true;
        }
        return false;
    }
    
    public boolean R() {
        int temp = posicion;
        System.out.println("-> DR");
        if (D()) {
            R();
            return true;
        }
        System.out.println("vacio");
        posicion = temp;
        return true; // vacio
    }
    
    public boolean S() {
        if (posicion < cadena.length() && (cadena.charAt(posicion) == '+' || cadena.charAt(posicion) == '-')) {
            System.out.println("-> " + cadena.charAt(posicion));
            posicion++;
            return true;
        }
        System.out.println("-> vacio");
        return true; // vacio
    }
    
    public boolean EX() {
        int temp= posicion;
        if (E()) {
            System.out.println("-> E");
            return true;
        }
        posicion = temp;
        return true; // vacio
    }
    
     public boolean E() {
        if (posicion < cadena.length() && (cadena.charAt(posicion) == 'e' || cadena.charAt(posicion) == 'E')) {
            System.out.println("-> e");
            posicion++;
            return true;
        }
        return false;
    }
    
    public boolean EN() {
        int temp = posicion;
        System.out.println("-> DR");
        if (D()) {
            R();
            return true;
        }
        System.out.println("vacio");
        posicion = temp;
        return true; // vacio
    }
    
   public boolean ES() {
        System.out.println("-> S EN");
        int temp = posicion;
        if (S() && EN()) {
            return true;
        }
        posicion = temp;
        return false;
    }
    
    
    public boolean F() {
        int temp = posicion;
        System.out.println("-> Es");
        if (ES()) {
            if (posicion < cadena.length() && cadena.charAt(posicion) == '.') {
                System.out.println("-> ES . EN");
                posicion++;
                if (EN()) {
                    return true;
                }
            }
            // Si no hay punto se acepta solo ES
            posicion = temp;
            return true;
        }
        return false;
    }
    
    public  boolean C() {
        int temp = posicion;
        System.out.println("C-> F");
        if ( F() ) {
            System.out.println("-> Ex Es");
            if (EX() && ES()) {
                return true;
            }
            System.out.println("-> F");
            posicion = temp;
            return true; 
        }
        return false;
    }
    
    public boolean esValido() {
        boolean resultado = C() && posicion == cadena.length(); 
        if (resultado) {
            System.out.println("La cadena es valida.");
        } else {
            System.out.println("La cadena es invalida.");
        }
        return resultado;
    }


}