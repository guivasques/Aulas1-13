
package aula13;

public class VeiculoTansporte {
    
    private int peso;
    private int carga;

    public VeiculoTansporte(int vPeso) {
        if (vPeso >= 2 && vPeso <= 6) {
            peso = vPeso;
        } else {
            System.out.println("Veículo fora de padrão");
        }
        carga = 0;
    }
    
    public void setCarga(int newCarga){
        if(newCarga >= 1 && newCarga <= 8) {
             carga = newCarga;
            } else {System.out.println("Carga muito elevada");
        }
            
    }
    
    public int getCarga(){
        return carga;
    }
    
    void checkPesoTotal(){
        int pesoTotal = this.peso + this.carga;
        if (pesoTotal <= 10) {
            System.out.println("Veículo dentro da norma " +pesoTotal+" ton");
        } else {
            System.out.println("Veículo fora da norma " +pesoTotal+" ton");
        }        
    }  
    
    
}