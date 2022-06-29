package br.com.henrique.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Microzona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
        
    private String nome;
    private String status;
    private String atendimentoDiario;
    private String atendeSegunda;
    private String atendeTerca;
    private String atendeQuarta;
    private String atendeQuinta;
    private String atendeSexta;
    private String atendeSabado;
    private Long codigoMunicipio;
    private Long estadoRota;
    private Long codigoRota;
    
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
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
    public String getAtendimentoDiario() {
        return atendimentoDiario;
    }
    public void setAtendimentoDiario(String atendimentoDiario) {
        this.atendimentoDiario = atendimentoDiario;
    }
    public String getAtendeSegunda() {
        return atendeSegunda;
    }
    public void setAtendeSegunda(String atendeSegunda) {
        this.atendeSegunda = atendeSegunda;
    }
    public String getAtendeTerca() {
        return atendeTerca;
    }
    public void setAtendeTerca(String atendeTerca) {
        this.atendeTerca = atendeTerca;
    }
    public String getAtendeQuarta() {
        return atendeQuarta;
    }
    public void setAtendeQuarta(String atendeQuarta) {
        this.atendeQuarta = atendeQuarta;
    }
    public String getAtendeQuinta() {
        return atendeQuinta;
    }
    public void setAtendeQuinta(String atendeQuinta) {
        this.atendeQuinta = atendeQuinta;
    }
    public String getAtendeSexta() {
        return atendeSexta;
    }
    public void setAtendeSexta(String atendeSexta) {
        this.atendeSexta = atendeSexta;
    }
    public String getAtendeSabado() {
        return atendeSabado;
    }
    public void setAtendeSabado(String atendeSabado) {
        this.atendeSabado = atendeSabado;
    }
    public Long getCodigoMunicipio() {
        return codigoMunicipio;
    }
    public void setCodigoMunicipio(Long codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }
    public Long getEstadoRota() {
        return estadoRota;
    }
    public void setEstadoRota(Long estadoRota) {
        this.estadoRota = estadoRota;
    }
    public Long getCodigoRota() {
        return codigoRota;
    }
    public void setCodigoRota(Long codigoRota) {
        this.codigoRota = codigoRota;
    }
    
    

}
