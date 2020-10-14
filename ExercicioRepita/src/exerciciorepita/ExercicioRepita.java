/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Abner
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int n, valores = 0, pares = 0, impares = 0, acima100 = 0, media = 0, soma = 0;
            do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um número: <br> (Valor 0 interrompe) </html>"));   
            if (n!=0) valores++; // contador
            if (n % 2 == 0 && n != 0) { //Pares
                pares++;
            } else if (n != 0) { // Impares
                impares++;
            }
            if (n > 100) {
                acima100++;
            }
            soma += n;
            media = soma/valores;
        } while (n != 0);
            JOptionPane.showMessageDialog(null, "<html>Resultado final <br> <hr> Total de valores: " + valores + "<br> Total de pares: " + pares + "<br> Total de impares: " + impares + "<br> Acima de 100: " + acima100 + "<br> Média dos valores: " + media + "</html>");
    }
}
    
