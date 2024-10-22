package icc.ajedrez;
import java.util.LinkedList;
import java.util.List;

public class Reina extends Pieza{
    private Posicion posicion;
    private boolean color;

    /**Constructor para la Reina
     * @param posicionActual
     * @param color
     */
    public Reina(Posicion posicionActual, boolean color) {
        super(posicionActual);
        this.color = color;
    }

    /**Devuelve las distintas posibles posiciones de la reina deacuerdo a como funciona en el ajedrez
     * @return posibles posiciones de la Reina
     */
    @Override
    public List<Posicion> posiblesMovimientos(){
        int[] mRenglon = {1, 1, 1, 0, 0, -1, -1, -1};
        int[] mColumna = {0, 1, -1, 1, -1, 0, 1, -1};
        LinkedList<Posicion>posiciones = new LinkedList<>();
        for(int i = 0; i < mRenglon.length ; i++){
            for(int j = 1; j <= 8; j++){
                char newColumna = (char)(this.posicionAct.getColumna() + j * mColumna[i]);
                int newRenglon = this.posicionAct.getRenglon() + j * mRenglon[i];
                try {
                    Posicion posible = new Posicion(newColumna, newRenglon);
                    posiciones.add(posible);
                } catch (IllegalArgumentException e) {
                    System.out.println("Movimiento invalido");
                }
            }
        }
        return posiciones;
    }

    /**Verfica si la posicion de la Reina es valida
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

    /**Devuelve una cadena con informacion de la posicion de la reina
     * @return devuelve la cadena con la posicion
     */
    @Override
    public String toString(){
        return "Reina en: " + this.posicionAct.toString();
    }
}