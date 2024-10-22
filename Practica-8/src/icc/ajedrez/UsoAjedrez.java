package icc.ajedrez;
import java.util.List;

public class UsoAjedrez {
    /**
     * Metodo para mostrar los movimientos de las piezas
     * @param movimientos
     */
    public static void muestraMov(List<Posicion> movimientos){
      for(Posicion posible : movimientos){
        System.out.println(posible);
      }  
    }

    /**
     * Valida la posicion de la pieza
     * @param pieza
     * @param nuevaPosicion
     * @throws IllegalArgumentException posicion invalida con la nueva posicion
     */
    public static void valPosicion(Pieza pieza, Posicion nuevaPosicion){
        try {
            pieza.esValida(nuevaPosicion);
        } catch (IllegalArgumentException e) {
            System.out.println("Posicion invalida: " + nuevaPosicion);
        }
    }

    public static void main (String[] args){
        /**
         * Se crean nuevos bjetos de las distintas piezas, en este caso algunas estan en el lugar
         * que deberian estar en el tablero de ajedrez
         */
        Reina reina = new Reina(new Posicion('e', 1), true);
        Caballo caballo = new Caballo(new Posicion('b', 1), true);
        Caballo caballo2 = new Caballo(new Posicion('g', 8), true);
        Rey rey = new Rey(new Posicion('d', 8), true);

        /**Se crea un atributo para que sea el centro del tablero y se usara en las distintas piezas para 
         * mostrar sus distintos movimientos
         */
        Posicion centro = new Posicion('d', 4);

        reina.setPosicionAct(centro);
        caballo.setPosicionAct(centro);
        rey.setPosicionAct(centro);

        System.out.println("\nMovimientos posibles de la Reina desde la posicion del centro");
        muestraMov(reina.posiblesMovimientos());

        System.out.println("\nMovimientos posibles del Caballo desde la posicion del centro");
        muestraMov(caballo.posiblesMovimientos());

        System.out.println("\nMovimientos posibles del Caballo 2 desde la posicion del centro");
        muestraMov(caballo2.posiblesMovimientos());
        System.out.println("\nMovimientos posibles del Rey desde la posicion del centro");
        muestraMov(rey.posiblesMovimientos());

        System.out.println("\nAhora probaremos si la nueva posicion es valida o invalida");
        Posicion pruebaUno = new Posicion('e', 7);

        //Se valida la posicion en cierta cordenada valida
        System.out.println("\nPrueba Uno: Posicion valida (5,f)");
        valPosicion(reina, pruebaUno);
        valPosicion(caballo, pruebaUno);
        valPosicion(rey, pruebaUno);

        //SE valida la posicion en cierta coordenada invalida
        System.out.println("\nPrueba Dos: Posición invalida (-2,i)"); 

        Posicion pruebaDos =  new Posicion('c', 10); 
        valPosicion(reina, pruebaDos);
        valPosicion(caballo, pruebaDos);
        valPosicion(rey, pruebaDos);

    }
}
