/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author guiva
 */
public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;
    private boolean statusmatricula;

    public Aluno() {
        this.matricula = 0;
        this.curso = "Sem curso";
       this.statusmatricula = false;
       
    }
    
 
public void cancelarMatricula(){
    this.statusmatricula = false;
    System.out.println("Matricula Cancelada");
    
}

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isStatusmatricula() {
        return statusmatricula;
    }

    public void setStatusmatricula(boolean statusmatricula) {
        this.statusmatricula = statusmatricula;
    }

    
}
