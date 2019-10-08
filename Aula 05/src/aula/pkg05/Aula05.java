/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg05;


public class Aula05 {
    
    public static void main(String[] args) {
      Conta c1 = new Conta();
      c1.setNumConta(210000);
      c1.setDono("Jubileu");
      c1.abrirConta("CC");
      c1.depositar(100);
   
      Conta c2 = new Conta();
      c2.setNumConta(111111);
      c2.setDono("Creuza");
      c2.abrirConta("CP");
      c2.depositar(500);
      c2.sacar(100);
      
      
      c1.estadoAtual();
      c2.estadoAtual();
    }
    
}
