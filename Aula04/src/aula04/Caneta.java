/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;


public final class Caneta {
    private String modelo;
    private float ponta;
    private final String cor;
    private boolean tampada;
    
    /**
     *
     * @param m
     * @param c
     * @param p
     */
    public Caneta(String m, String c, float p) { // Método Construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
        
    }
    public float getPonta() {
        return this.ponta;
        
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta : " + this.getPonta());
        System.out.println("Cor: " +  this.cor);
        System.out.println("Tampada: " + this.tampada);
        
    }
}
