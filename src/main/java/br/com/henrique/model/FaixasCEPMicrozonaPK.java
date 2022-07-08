package br.com.henrique.model;

import java.io.Serializable;

public class FaixasCEPMicrozonaPK implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long codigoMicrozona;
    private Long codigoSequencial;
    
    // Construtor
    public FaixasCEPMicrozonaPK() {
        super();
    }
    
    public FaixasCEPMicrozonaPK(Long codigoMicrozona, Long codigoSequencial) {
        super();
        this.codigoMicrozona = codigoMicrozona;
        this.codigoSequencial = codigoSequencial;
    }

    public Long getCodigoMicrozona() {
        return codigoMicrozona;
    }

    public void setCodigoMicrozona(Long codigoMicrozona) {
        this.codigoMicrozona = codigoMicrozona;
    }

    public Long getCodigoSequencial() {
        return codigoSequencial;
    }

    public void setCodigoSequencial(Long codigoSequencial) {
        this.codigoSequencial = codigoSequencial;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoMicrozona == null) ? 0 : codigoMicrozona.hashCode());
        result = prime * result + ((codigoSequencial == null) ? 0 : codigoSequencial.hashCode());
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
        FaixasCEPMicrozonaPK other = (FaixasCEPMicrozonaPK) obj;
        if (codigoMicrozona == null) {
            if (other.codigoMicrozona != null)
                return false;
        } else if (!codigoMicrozona.equals(other.codigoMicrozona))
            return false;
        if (codigoSequencial == null) {
            if (other.codigoSequencial != null)
                return false;
        } else if (!codigoSequencial.equals(other.codigoSequencial))
            return false;
        return true;
    }
}
