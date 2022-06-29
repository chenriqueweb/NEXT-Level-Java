package br.com.henrique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henrique.model.Filial;
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
    
    // Inclui Filial
    public void addFilial(Filial filial) {
        repositFilial.save(filial);
    }
    
}
