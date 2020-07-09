
package AngelicaZepeda;

import javax.swing.JOptionPane;

public class AngelicaDoloresZepedaLopez {
    public static void main(String[] args) {
        String primerNumero = JOptionPane.showInputDialog("Introduzaca el primer numero entero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo numero entero");
        
        //convertimos las entradas String a Int
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        
        int suma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null,"La suma es: " + suma, "Suma de Enteros", JOptionPane.PLAIN_MESSAGE);
    }
}
