package br.com.henrique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henrique.model.Filial;
import br.com.henrique.model.FilialChavePK;
import br.com.henrique.repository.FilialRepository;

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
//    
////    // Busca por Filial   ((( erro nao esta considenrando Empresa )))
////    public Optional<Filial> findById(Long codigoEmpresa, Long codigoFilial) {
////        Optional<Filial> filial = repositFilial.findById(codigoEmpresa, codigoFilial);    
////        return filial;
////    }
    
    // Inclui Filial
    public void addFilial(Filial filial) {
            repositFilial.save(filial);
    }
//    
//    // Atualiza Filial
////    public void updateFilial(Long empresa, Long codigo, Filial filial) {
////        Filial filialAtualizado = this.findById(empresa, codigo);
////        
////        if (filialAtualizado == null) {
////            throw new RuntimeException("Filial nao encontrada !");
////        }
////        filialAtualizado.setNome(filial.getNome());
////        filialAtualizado.setCNPJ(filial.getCNPJ());
////        filialAtualizado.setMunicipio(filial.getMunicipio());
////        
////        repositFilial.save(filialAtualizado);
////    }
//
//    // Exclusão de Filial
////    public void deletaFilial(Long empresa, Long codigo) {
////        Optional<Filial> filialExclusao = this.findById(empresa, codigo);
////        
////        if(filialExclusao == null) {
////            throw new RuntimeException("Filial nao encontrada !");
////        }
////        repositFilial.deleteById(empresa, codigo);
////    }
//    

}
