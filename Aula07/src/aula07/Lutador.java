/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author guiva
 */
public class Lutador {
   // Atributos 
   private String nome, nacionalidade, categoria;
   private int idade, vitorias, derrotas, empates;
   private float altura , peso;
   
   //Metodos Especiais
   public Lutador(String no,String na,int id,float alt,float peso,int vit,int der,int emp){
       this.nome = no;
       this.nacionalidade = na;
       this.idade = id;
       this.altura = alt;
       this.setPeso(peso);
       this.vitorias = vit;
       this.derrotas = der;
       this.empates = emp;      
        
       
   }
   
   // Métodos Publicos 
   
   public void apresentar(){
       System.out.println("---------------------------------------------------------");
       System.out.println("CHEGOU A HORA: APRESENTAMOS O LUTADOR " + this.getNome());
       System.out.println(" Diretamente de " + this.getNacionalidade());
       System.out.println(" com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
       System.out.println(" Pesando " + this.getPeso() + "KG");
       System.out.println(" com " + this.getVitorias() + " Vitórias " + " e " + this.getDerrotas() + " Derrotas" + " e " + this.getEmpates() + " Empates");
       
       
       
           
       System.out.println("");
   }
   
   public void status(){
       System.out.println(this.getNome() + " é um peso " + this.getCategoria());
       System.out.println(" Ganhou " + this.getVitorias());
       System.out.println(" Perdeu " + this.getDerrotas());
       System.out.println(" Empatou " + this.getEmpates());
       
       
   }
   
   public void ganharLuta(){
       this.setVitorias(this.getVitorias() +1);
       
               
   }
   
   public void perderLuta(){
       this.setDerrotas(this.getDerrotas() + 1);
       
   }
   
   public void empatarLuta(){
       this.setEmpates(this.getEmpates() + 1);
       
   }
   
   
   // Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.90) {
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2) {
            this.categoria = "Pesado"; 
        }
        else {
            this.categoria = "Inválido";
        }       
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float pes) {
        this.peso = pes;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vit;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int der) {
        this.derrotas = der;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int emp) {
        this.empates = emp;
    }
    
}





