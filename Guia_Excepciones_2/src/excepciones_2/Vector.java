/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
 */

package excepciones_2;

public class Vector {

    private int[] v;

    public Vector() {
    }

    public Vector(int[] v) {
        this.v = v;
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }


}
