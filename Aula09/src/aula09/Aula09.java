
package aula09;

public class Aula09 {

    public static void main(String[] args) {
        
        Pessoa p[];
        p = new Pessoa[2];
        
        p[0]= new Pessoa("Guilherme",24,"Masculino");
        p[1]= new Pessoa("Maria", 30, "Feminino");
                
        
       Livro l[];
       l = new Livro[3];
       
       l[0] = new Livro("O vento levou", "Faizano",230,p[0]);
       l[1] = new Livro("JavaScript","Dom Camilo", 100,p[1]);
       l[2] = new Livro("Conhecimento em HTML","Fernandinho", 200, p[0]);
       
      
       
      l[0].abrir();
      l[0].avancarPag();
     
      l[0].folhear(122);
        System.out.println(l[0].detalhes());
      
       
    }
    
}
