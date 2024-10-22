package icc.ajedrez;
import java.util.LinkedList;
import java.util.List;

public class Caballo extends Pieza{
    private Posicion posicion;
    private boolean color;

    /**
     * Constructor para el caballo
     * @param posicionActual alguna posicion
     * @param color color de la pieza
     */

    public Caballo(Posicion posicionActual, boolean color) {
        super(posicionActual);
        this.color = color;
    }

    /**
     * Debe volver las posibles posiciones deacuerdo al movimiento del caballo en el ajedrez
     * @return lista de las posibles posiciones del caballo
     */
    @Override
    public List<Posicion> posiblesMovimientos(){
        int[] nRenglon = {-2, -2, 1, 2, 2, 1, -1, -2};
        int[] nColumna = {1, 2, 2, 1, -1, -2, -2, -1};
        LinkedList<Posicion>posiciones = new LinkedList<>();
        for (int i = 0; i < nRenglon.length; i++){
            try{
                Posicion posible = new Posicion((char)(this.posicionAct.getColumna() + nColumna[i]),
                this.posicionAct.getRenglon() + nRenglon[i]);
            } catch (IllegalArgumentException e){
                System.out.println("Movimiento invalido");
            }
            posiciones.add(posicion);
        }
        return posiciones;
    }

    /**
     * Verifica si la posicion del caballo es valida
     * @param posicion
     * @return verdadera si es valida y falsa si no es valida
     */
    @Override
    public boolean esValida(Posicion posicion){
        if(posicion.posicionValida()){
            return true;
        }
        return false;
    }

    /**
     * Devuelve una representacion en String del caballo, ademas de su posicion
     * @return cadena que dice la posicion actual del caballo
     */
    @Override
    public String toString(){
       return "Caballo en: " + this.posicionAct.toString();
    }
}