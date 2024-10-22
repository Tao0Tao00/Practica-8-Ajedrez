package icc.ajedrez;

public class PruebaPosicion {
    public static void main(String[] args){

        Posicion pruebaUno = new Posicion('a', 1); //No lanza excepcion, por lo que es correcto
        System.out.println(pruebaUno);
        // Posicion pruebaUno = new Posición('c', -5); Lanza excepcion "Renglon invalido"
        // Posicion pruebaUno = new Posición('z', 2); Lanza excepcion "Columna invalida"
    }
}
