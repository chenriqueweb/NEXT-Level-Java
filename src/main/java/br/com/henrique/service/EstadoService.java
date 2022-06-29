package br.com.henrique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henrique.model.Estado;
import br.com.henrique.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repositEstado;
    
    // Lista Estado
    public List<Estado> findAll() {
        List<Estado> estados = new ArrayList<Estado>();
        estados = repositEstado.findAll();
        
        return estados;
    }    
 
    // Busca por Estado
    public Estado findById(String sigla) {
        Estado estado = repositEstado.findById(sigla).orElse(null);
        return estado;
    }
    
    // Inclui Empresa
    public void addEstado(Estado estado) {
        repositEstado.save(estado);
    }
    
    // Altera Estado
    public void updateEstado(String sigla, Estado estado) {
        Estado estadoAtualizado = this.findById(sigla);
        
        if (estadoAtualizado == null) {
            throw new RuntimeException("Estado nao encontrado !");
        }
        estadoAtualizado.setNome(estado.getNome());
        
        repositEstado.save(estadoAtualizado);
    }
    
    // Excluir Estado
    public void deletaEstado(String sigla) {
        Estado estadoAtualizado = this.findById(sigla);
        
        if (estadoAtualizado == null) {
            throw new RuntimeException("Estado nao encontrado !");
        }
        repositEstado.deleteById(sigla);
    }
}
