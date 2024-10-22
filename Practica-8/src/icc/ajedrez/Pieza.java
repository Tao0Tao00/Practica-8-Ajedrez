package icc.ajedrez;
import java.util.List;
public abstract class Pieza{
    protected Posicion posicionAct;

    /**
     * Constructor de la pieza
     * @param posicionAct alguna posicion
     */
    public Pieza(Posicion posicionAct){
        this.posicionAct = posicionAct;
    }

    /**Metodo getter para la posicion actual
     * @return posicion actual
     */
    public Posicion getPosicionAct(){
        return posicionAct;
    }

    /**Metodo set de la posicion actual ademas de verificar si es valida
     * @param newPosicion la nueva posicion
     * @throws IllegalArgumentExepction si es falsa
     */
    public void setPosicionAct(Posicion newPosicion){
        if(newPosicion.posicionValida()){
            this.posicionAct = newPosicion;
        }else{
            throw new IllegalArgumentException("Fuera del tablero");
        }
    }

    /**Devuelve una lista de las posiciones posibles de alguna pieza
     * @return lista de las posiciones de alguna pieza seleccionada
     */
    public abstract List<Posicion> posiblesMovimientos();

    /**
     * Verifica si la posicion de la piesa es valida
     * @param posicion
     * @return si la posicion es valida o no
     */
    public abstract boolean esValida(Posicion posicion);

    /**
     * Devolvera una caddena en String y la posicion
     * @return cadena que tiene informacion de la pieza
     */
    public abstract String toString();
}