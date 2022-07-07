package br.com.henrique.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Municipio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    public Municipio() {
        super();
    }

    public Municipio(Integer codigo, String nome, Estado estado) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
    }

    // Método para identificar registro novo
    public boolean isNovo() {
        return nome == null;
    }    
    
    private String nome;
    
    // FK com Estado
    @ManyToOne
    @JoinColumn(name="sigla")
    private Estado estado;
//    private String siglaEstado;
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
//    public String getSiglaEstado() {
//        return siglaEstado;
//    }
//    public void setSiglaEstado(String siglaEstado) {
//        this.siglaEstado = siglaEstado;
//    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Municipio other = (Municipio) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        return true;
    }

    public Estado getSiglaEstado() {
        return estado;
    }

    public void setSiglaEstado(Estado estado) {
        this.estado = estado;
    }

}
