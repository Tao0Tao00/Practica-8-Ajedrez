package icc.ajedrez;

public class Posicion{
    /**Inicializamos atributos para la columna y el renglon */
    private char columna;
    private int renglon;

/**Constructor de posicion ademas que verifica si el renglon o la columna es valida
 * @param columna
 * @param renglon
 */
public Posicion(char columna, int renglon){
    this.columna = columna;
    this.renglon = renglon;
    this.posicionValida();

    if(renglon < 1 || renglon > 8) throw new IllegalArgumentException("Renglon invalido");

    if(!(columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h')) throw new IllegalArgumentException("Columna invalida");
}

/**Metodo getter de columna
 * @return la columna
 */
public char getColumna(){
    return columna;
}

/**Metodo setter de columna y verifica si es valida o no la columna de a hasta h
 * @param columna
 * @throws IllegalArgumentException columna invalida
 */
public void setColumna(char columna){
    if(columna < 'a' || columna > 'h') 
    throw new IllegalArgumentException("Columna inválida");
    this.columna = columna;
}

/**Metodo getter de renglon
 * @return el renglon
 */
public int getRenglon(){
    return renglon;
}

/**Metodo setter de renglon y verifica si es valido entre 1 hasta 8
 * @param renglon
 * @throws IllegalArgumentException renglon invalido
 */
public void setRenglon(int renglon){
    if(renglon < 1 || renglon > 8) 
    throw new IllegalArgumentException("Renglón inválido");
    this.renglon = renglon;
}

/**Metodo para verificar la posicion es valida para renglon y columna
 * @return renglon 1 >= 8 y columna a hasta h
 */
public boolean posicionValida(){
    return this.renglon >=1 && this.renglon <= 8 && this.columna >= 'a' && this.columna <= 'h';
    }

/**
 * Metodo que nos sirve para obtener una cadena con la posicion de la pieza
 * @return cadena con la posicion 
 */
public String toString(){
    return "[" + columna + ", " + renglon + "]";
}
}