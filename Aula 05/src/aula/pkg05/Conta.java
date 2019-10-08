/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg05;

/**
 *
 * @author guiva
 */
public class Conta {
   
   private String dono;
   public int numConta; 
   private float saldo;
   protected String tipo;
   private boolean status;
   
   public Conta() {
   this.saldo = 0;
   this.status = false;
     
}
   
   public String getDono(){
      return this.dono;
   }
   
   public void setDono(String d){
       this.dono = d;
   }
   
   public int getNumConta(){
       return this.numConta;
   }
   
   public void setNumConta(int nc){
       this.numConta = nc;
      
   }
   
   public float  getSaldo(){
       return this.saldo;
   }
   
   public void setSaldo(float v){
       this.saldo = v;
   }
   
   public String getTipo(){
       return this.tipo;
      
   }
   
   public void setTipo(String t){
       this.tipo = t;
     
   }
   
   public boolean getStatus(){
       return this.status;
   }
   
   public void setStatus(boolean st){
       this.status = st;
   }

  public void estadoAtual(){
      System.out.println("-----------------------------");
      System.out.println("Numero de conta: " + this.getNumConta());
      System.out.print("Conta de " + this.getDono());
      System.out.println(" do tipo: " + this.getTipo());
      System.out.println("Saldo da Conta: " + this.getSaldo());
      
      
  }
  
  public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if (t == "CC"){
        this.setSaldo(50);      
    } else if (t == "CP") {
        this.setSaldo(150);
        
    }
      System.out.println("Conta aberta com sucesso!!");
  }

          
  
  public void fecharConta(){
      if (this.getSaldo() > 0){
          System.out.println("Conta com dinheiro");
      }
      
      else if (this.getSaldo() < 0){
      System.out.println("Conta em débito");
  }
      else {
              this.setStatus(false);
              System.out.println("Conta fecheda com sucesso");
              }
  }
  public void  depositar(float v){
      if (this.getStatus()){
          this.setSaldo(this.getSaldo() + v);
          System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
      }
      else {
          System.out.println("Impossivel de nao depositar");
      }
  }
  public void sacar(int v){
      if (this.getStatus() == true && this.saldo >= v){
          this.setSaldo(this.getSaldo() - v);
          System.out.println("Saque realizado na conta de " + this.getDono());
          
      }
      if (this.getStatus() == true && this.getSaldo() < v){
          System.out.println("Saldo Insuficiente");
      }
 
         
      
      
  }

  public void pagarMensal(){
      int v = 0;
      
          if ("CC".equals(this.getTipo())){
          v = 12; 
      }
      if ("CP".equals(this.getTipo())){
          v = 20;
      
  }    
          if (this.getStatus() && this.getSaldo() <= v){
              System.out.println("Impossivel Pagar");
          }
          else {
              this.setSaldo(this.getSaldo() - v);
              System.out.println("Mensalidade Paga com sucesso!");
          }
      
  }
  
}
  
   
   
   

