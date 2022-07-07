package br.com.henrique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henrique.model.RotaEntrega;
import br.com.henrique.repository.RotaEntregaRepository;
import br.com.henrique.service.exception.ObjectNotFoundException;

@Service
public class RotaEntregaService {

    @Autowired
    private RotaEntregaRepository repositRotaEntrega;    
    
    // Lista de Rotas de Entrega
    public List<RotaEntrega> findAll() {
        List<RotaEntrega> rotasEntregas = new ArrayList<RotaEntrega>();
        rotasEntregas = repositRotaEntrega.findAll();        
        return rotasEntregas;
    }    
    
    // Busca pela Rota de Entrega
    public RotaEntrega findById(Integer codigo) {
        RotaEntrega rotaEntrega = repositRotaEntrega.findById(codigo).orElse(null);
        if (rotaEntrega == null) {
            throw new ObjectNotFoundException("Rota de Entrega nao encontrada !");
        }
        return rotaEntrega;
    }    
    
    // Inclui Rota de Entrega
    public RotaEntrega addRotaEntrega(RotaEntrega rotaEntrega) {
            return repositRotaEntrega.save(rotaEntrega);
    }    
    
    // Atualiza uma Rota de Entrega
    public void updateRotaEntrega(Integer codigo, RotaEntrega rotaEntrega) {
        RotaEntrega rotaEntregaAtualizado = this.findById(codigo);
        
        rotaEntregaAtualizado.setSiglaEstado(rotaEntrega.getSiglaEstado());
        rotaEntregaAtualizado.setNome(rotaEntrega.getNome());
        rotaEntregaAtualizado.setStatus(rotaEntrega.getStatus());
        rotaEntregaAtualizado.setCodigoEmpresa(rotaEntrega.getCodigoEmpresa());
        rotaEntregaAtualizado.setCodigoFilial(rotaEntrega.getCodigoFilial());
        rotaEntregaAtualizado.setPrazoExpedicao(rotaEntrega.getPrazoExpedicao());
        
        repositRotaEntrega.save(rotaEntregaAtualizado);
    }       
    
    
    // Exclusão da Rota de Entrega
    public void deletaRotaEntrega(Integer codigo) {
        this.findById(codigo);
        
        repositRotaEntrega.deleteById(codigo);
    }    
    
}
