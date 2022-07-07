package br.com.henrique.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(RotaEntregaId.class)
public class RotaEntrega {
    
    @Id
    private String siglaEstado;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    private String nome;
    private String status;
    private Integer codigoEmpresa;
    private Integer codigoFilial;
    private String prazoExpedicao;
    
    public RotaEntrega() {
        super();
    }
    
    public RotaEntrega(String siglaEstado, Integer codigo, String nome, String status, Integer codigoEmpresa, Integer codigoFilial,
                    String prazoExpedicao) {
        super();
        this.siglaEstado = siglaEstado;
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
        this.codigoEmpresa = codigoEmpresa;
        this.codigoFilial = codigoFilial;
        this.prazoExpedicao = prazoExpedicao;
    }

    // Método para identificar registro novo
    public boolean isNovo() {
        return nome == null;
    }         
    
    public String getSiglaEstado() {
        return siglaEstado;
    }
    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }
    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    public Integer getCodigoFilial() {
        return codigoFilial;
    }
    public void setCodigoFilial(Integer codigoFilial) {
        this.codigoFilial = codigoFilial;
    }
    public String getPrazoExpedicao() {
        return prazoExpedicao;
    }
    public void setPrazoExpedicao(String prazoExpedicao) {
        this.prazoExpedicao = prazoExpedicao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((codigoEmpresa == null) ? 0 : codigoEmpresa.hashCode());
        result = prime * result + ((codigoFilial == null) ? 0 : codigoFilial.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((prazoExpedicao == null) ? 0 : prazoExpedicao.hashCode());
        result = prime * result + ((siglaEstado == null) ? 0 : siglaEstado.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        RotaEntrega other = (RotaEntrega) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (codigoEmpresa == null) {
            if (other.codigoEmpresa != null)
                return false;
        } else if (!codigoEmpresa.equals(other.codigoEmpresa))
            return false;
        if (codigoFilial == null) {
            if (other.codigoFilial != null)
                return false;
        } else if (!codigoFilial.equals(other.codigoFilial))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (prazoExpedicao == null) {
            if (other.prazoExpedicao != null)
                return false;
        } else if (!prazoExpedicao.equals(other.prazoExpedicao))
            return false;
        if (siglaEstado == null) {
            if (other.siglaEstado != null)
                return false;
        } else if (!siglaEstado.equals(other.siglaEstado))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }
    

}
