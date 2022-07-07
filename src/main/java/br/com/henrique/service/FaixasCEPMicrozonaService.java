package br.com.henrique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henrique.model.FaixasCEPMicrozona;
import br.com.henrique.repository.FaixasCEPMicrozonaRepository;

@Service
public class FaixasCEPMicrozonaService {

    @Autowired
    private FaixasCEPMicrozonaRepository repositFaixasCEPMicrozona;    
    
    // Lista Faixas de CEPs da Microzona
    public List<FaixasCEPMicrozona> findAll() {
        List<FaixasCEPMicrozona> faixasCEPMicrozona = new ArrayList<FaixasCEPMicrozona>();
        faixasCEPMicrozona = repositFaixasCEPMicrozona.findAll();        
        return faixasCEPMicrozona;
    }   
}
