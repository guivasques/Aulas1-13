/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author guiva
 */
public class Livro implements publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.setPagAtual(1);
        this.setAberto(false);
        
    }
    
    //Métodos 

    public String detalhes() {
        return "Livro - " + "\n Titulo do Livro: " + titulo + "\n Autor: " + autor + "\n Total de Paginas: " + totPaginas + "\n Pagina Atual: " + pagAtual + "\n Esta aberto :  " + aberto + "\n Leitor: " + leitor.getNome() + " Idade: " + leitor.getIdade() + " Sexo: " + leitor.getSexo();
    }
    


// Métodos Getters e Setters 


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    


    // Métodos Abstratos 
    
    
    @Override
    public void abrir() {
        if(this.aberto == false){
        this.setAberto(true);
        System.out.println("Você abriu o livro");}
        else{
            System.out.println("O Livro já está aberto");
        }
    }

    @Override
    public void fechar() {
       if(this.getAberto() == true){
        this.setAberto(false);
           System.out.println("Você fechou o livro");}
       else {
           System.out.println("O livro já está fechado");
       }
       
     }
        
   
    

    @Override
    public void avancarPag() {
         if (this.getAberto() && this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual()+1);
         }

        
   }


    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagAtual() > 1){
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }

    @Override
    public void folhear(int p) {
        if (p <= this.getTotPaginas()){
       this.pagAtual = p;
    }
        else {
            this.pagAtual = 0;
        }
    }

   
    
    
        
    
}

   
