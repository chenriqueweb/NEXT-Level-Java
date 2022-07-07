package br.com.henrique.model;

import java.io.Serializable;

public class RotaEntregaId  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Integer siglaEstado;
    private Integer codigo;
       
    public RotaEntregaId() {
        super();
    }
    
    public RotaEntregaId(Integer siglaEstado, Integer codigo) {
        super();
        this.siglaEstado = siglaEstado;
        this.codigo = codigo;
    }


    public Integer getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(Integer siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((siglaEstado == null) ? 0 : siglaEstado.hashCode());
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
        RotaEntregaId other = (RotaEntregaId) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (siglaEstado == null) {
            if (other.siglaEstado != null)
                return false;
        } else if (!siglaEstado.equals(other.siglaEstado))
            return false;
        return true;
    }
}       