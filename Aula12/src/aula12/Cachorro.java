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
public class Cachorro extends Mamifero{
    
 public void enterrarOsso(){
     
 }
 
 public void abanarOsso(){
     
 }

    @Override
    public void alimentar() {
        if(this.getIdade() < 3) {
            System.out.println("Mamando");
        }
        else {
            System.out.println("Comendo ração");
        }
       
    }
 
 public void reagir(String frase){
     if("toma comida".equals(frase)||"Ola".equals(frase)){
     System.out.println("Abanar e latir");
 }
     else {
             System.out.println("Rosnar");
             }
     
 }
 
public void reagir(int hora, int minuto){
    if (hora < 12){
        System.out.println("Abanar");
    }
    else if (hora >=18){
    System.out.println("Ignorar");
}   else{
        System.out.println("Abanar e Latir");
    }
     
 }    
  
public void reagir(boolean dono){
    if(dono){
        System.out.println("Abanar o rabo");
        
    } else {
        System.out.println("Rosnar e Latir");
    }
     
 } 

public void reagir(int idade, float peso){
    if (idade < 5){
        if (peso>10f){
    System.out.println("Abanar");}
    }
    else {
        System.out.println("Latir");
        }
 
    if(peso<10f){
        System.out.println("Rosnar");
        
    } else{
        System.out.println("Ignorar");
    }
    }    
}
