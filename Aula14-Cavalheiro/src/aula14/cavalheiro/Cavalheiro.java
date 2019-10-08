/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14.cavalheiro;

import java.util.Date;

/**
 *
 * @author guiva
 */
public class Cavalheiro {
    
    private String Nome;
    private Date BirthDate;
    private String Team;
    private int Life;

    public Cavalheiro(String Nome, Date BirthDate, String Team) {
        this.Nome = Nome;
        this.BirthDate = BirthDate;
        this.setTeam(Team);
        this.setLife(300);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        if("Amarelo".equals(Team) || "Verde".equals(Team) )
        this.Team = Team;
        else{
            System.out.println("Sem Exercito valido");
        }
    }

    public int getLife() {
        return Life;
    }

    public void setLife(int Life) {
        if(Life<=300 && Life>=0){
        this.Life = Life;
    }
        else{
            System.out.println("Vida Inválida");
        }
    }
    
    
    public void status(){
        if(this.Life <50){
            System.out.println("Cavalheiro morto");
        }          
            else{
                    System.out.println("Cavalheiro Vivo");
                    }
        }
    }
    
