/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author guiva
 */
public class Reptil extends Animal{
    
    private String corEscama;

    /**
     *
     */
    @Override
    public void emitirSom() {
            }

    @Override
    public void alimentar() {
      
    }

    @Override
    public void locomover() {
        System.out.println("Andando");
       
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
  
    
}
