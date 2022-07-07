package br.com.henrique.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(FaixasCEPMicrozonaId.class)
public class FaixasCEPMicrozona {
    
    @Id
    private Long codigoMicrozona;    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoSequencial;
    
    private int CEPinicial;
    private int CEPfinal;
    
    public FaixasCEPMicrozona() {
        super();
    }
    public FaixasCEPMicrozona(Long codigoMicrozona, Long codigoSequencial, int cEPinicial, int cEPfinal) {
        super();
        this.codigoMicrozona = codigoMicrozona;
        this.codigoSequencial = codigoSequencial;
        CEPinicial = cEPinicial;
        CEPfinal = cEPfinal;
    }
    
    // Método para identificar registro novo
    public boolean isNovo() {
        return codigoMicrozona == null;
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
    public int getCEPinicial() {
        return CEPinicial;
    }
    public void setCEPinicial(int cEPinicial) {
        CEPinicial = cEPinicial;
    }
    public int getCEPfinal() {
        return CEPfinal;
    }
    public void setCEPfinal(int cEPfinal) {
        CEPfinal = cEPfinal;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + CEPfinal;
        result = prime * result + CEPinicial;
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
        FaixasCEPMicrozona other = (FaixasCEPMicrozona) obj;
        if (CEPfinal != other.CEPfinal)
            return false;
        if (CEPinicial != other.CEPinicial)
            return false;
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
