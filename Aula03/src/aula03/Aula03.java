/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author guiva
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5;
       // c1.tampada = true; Private 
       c1.destampar();
        c1.status();
        
        

    }
    
}
