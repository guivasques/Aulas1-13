/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author guiva
 */
public final class Bolsista extends Aluno{
    
 private float bolsa;
 
 public void renovarBolsa(){
     System.out.println("Renovando bolsa de " + this.getNome());
     
 }
    @Override
 public void pagarMensalidade(){
        System.out.println(this.getNome() + "É bolsista! Pagamento Facilitado");
        
        
     
 }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
 
 
}
