/*
19. Leer una secuencia de numeros y mostrar la suma de los 30 numeros que ocupan 
posiciones de lectura par.
 */
package sumanumeroposicion;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SumaNumeroPosicion {

    public static void main(String[] args) {
        int num_operador = 0;
        int longitud;
        int pedir;
        int suma = 0;

        num_operador = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Numeros"));

        for (int i = 0; i < num_operador; i++) {
            pedir = Integer.parseInt(JOptionPane.showInputDialog("Dame numero"));
            if (pedir % 2 == 0) {
                suma = suma + pedir;

            }

        }
        System.out.println("Valor : " + suma);

    }

}
