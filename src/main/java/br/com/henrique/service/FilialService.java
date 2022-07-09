package br.com.henrique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henrique.model.Filial;
import br.com.henrique.model.FilialPK;
import br.com.henrique.repository.FilialRepository;
import br.com.henrique.service.exception.ObjectNotFoundException;

@Service
public class FilialService {

    @Autowired
    private FilialRepository repositFilial;
    
    // Lista Filiais
    public List<Filial> findAll() {
        List<Filial> filiais = new ArrayList<Filial>();
        filiais = repositFilial.findAll();                
        return filiais;
    }
    
    // Busca por Filial
//    public Filial findById(Integer codigoEmpresa, Integer codigoFilial) {
//        Filial filialBusca =  repositFilial.findById(filial.getFilialPK()).orElse(null);
//        
//        if (filialBusca == null) {
//            throw new ObjectNotFoundException("Filial nao encontrada !");
//        }
//        return filialBusca;
//    }
    
    public Filial findById(FilialPK filialPK) {
        Filial filialBusca2 = repositFilial.findById(filialPK).orElse(null);
        
        if (filialBusca2 == null) {
            throw new ObjectNotFoundException("Filial nao encontrada !");
        }
        return filialBusca2;
    }
    
    // Inclui Filial
    public Filial addFilial(Filial filial) {
            return repositFilial.save(filial);
    }
    
//    
//    // Atualiza Filial
//    public void updateFilial(Integer codigoEmpresa, Integer codigoFilial, 
//                             Filial filial) {
//        Filial filialAtualizado = repositFilial.findById(filial.getFilialPK()).orElse(null);
//        
//        filialAtualizado.setFilialPK(filial.getFilialPK());
//        
//        filialAtualizado.setNome(filial.getNome());
//        filialAtualizado.setCnpj(filial.getCnpj());
//        filialAtualizado.setMunicipio(filial.getMunicipio());
//        
//        repositFilial.save(filialAtualizado);
//    }
//    
//    // Exclusão de Filial
//    public void deletaFilial(Integer codigoEmpresa, Integer codigoFilial,
//                             Filial filial) {
//        repositFilial.findById(filial.getFilialPK());
//        
//        repositFilial.deleteById(filial.getFilialPK());
//    }

}
