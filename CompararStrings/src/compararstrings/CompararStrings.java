/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararstrings;

/**
 *
 * @author Abner
 */
public class CompararStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1 = "Gustavo";
        String n2 = "Gustavo";
        String n3 = new String("Gustavo");
        String res = (n1.equals(n3))? "igual" : "diferente";
        System.out.println(res);        
    }
    
}
