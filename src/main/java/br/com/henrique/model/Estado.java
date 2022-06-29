package br.com.henrique.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {
    
    @Id
    private String sigla;
    
    private String nome;
    
    // Construtor da Classe
    public Estado() {
        super();
    }
    
    public Estado(String sigla, String nome) {
        super();
        this.nome = nome;
    }
        
    
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
