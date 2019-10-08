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
public class Caneta {
     public String modelo; //Atributos Publico
    public String cor;
    public double ponta; // Atributos Privado
    protected int carga; // Atributos Protegidos
    private boolean tampada;
    
    
    
   public void status() { //Metodos
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está Tampada? " + this.tampada);
        
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não Posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
