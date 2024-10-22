package icc.ajedrez;
import java.util.LinkedList;
import java.util.List;

public class Rey extends Pieza{
    private Posicion posicion;
    private boolean color;

    /**
     * Constructor para el Rey
     * @param posicionActual
     * @param color
     */
    public Rey(Posicion posicionActual, boolean color) {
        super(posicionActual);
        this.color = color;
    }

    /**Devuelve una lista con las posibles posiciones del rey deacuerdo a como funciona en el ajedrez
     * @return las distintas posibles posiciones del rey
     */
    @Override
    public List<Posicion> posiblesMovimientos(){
        int[] hRenglon = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] hColumna = {-1, 0, 1, -1, 1, -1, 0, 1};
        LinkedList<Posicion>posiciones = new LinkedList<>();
        for(int i = 0; i < hRenglon.length ; i++){
            char newColumna = (char)(this.posicionAct.getColumna() + hColumna[i]);
            int newRenglon = this.posicionAct.getRenglon() + hRenglon[i];
            try {
                Posicion posible = new Posicion(newColumna, newRenglon);
                posiciones.add(posible);
            } catch (IllegalArgumentException e) {
                System.out.println("Movimiento invalido");
            }
            
        }
        return posiciones;
    }

    /**Verifica si la posicion del rey es valida
     * @param posicion
     * @return true si es valida y false si no lo es 
     */
    @Override
    public boolean esValida(Posicion posicion){
        if(posicion.posicionValida()){
            return true;
        }
        return false;
    }

    /**
     * Regresa una cadena en String con la posicion del rey
     * @return cadena con la posicion del rey
     */
    @Override
    public String toString(){
        return "Rey en: " + this.posicionAct.toString();
    }
}