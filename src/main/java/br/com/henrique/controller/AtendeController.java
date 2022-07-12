package br.com.henrique.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

import br.com.henrique.model.FaixasCEPMicrozona;
import br.com.henrique.service.FaixasCEPMicrozonaService;

@RestController
@RequestMapping(path = "/atende")
public class AtendeController {
    
    @Autowired
    private FaixasCEPMicrozonaService faixasCEPMicrozonaService;
    
    @GetMapping(path = "{cepAtende}")    
    public ResponseEntity<JSONObject> cepAtende(@PathVariable Integer cepAtende) {
//      System.out.println(cepAtende);
        
        List<FaixasCEPMicrozona> faixasCEPMicrozona = faixasCEPMicrozonaService.findAll();
        JSONObject objetoJson = new JSONObject();
        
        
        for (int x = 0; x < faixasCEPMicrozona.size(); x++ ) {
          if (cepAtende >= faixasCEPMicrozona.get(x).getCEPinicial() & 
              cepAtende <= faixasCEPMicrozona.get(x).getCEPfinal()) {
//                System.out.println("--------------------------------------------------------------------------------------------");
//                System.out.println("== Faixa:");
//                System.out.println("Microzona: " + faixasCEPMicrozona.get(x).getFaixasCEPMicrozonaPK().getCodigoMicrozona());
//                System.out.println("Sequencial: " + faixasCEPMicrozona.get(x).getFaixasCEPMicrozonaPK().getCodigoSequencial());
//                System.out.println("CEPInicial:" + faixasCEPMicrozona.get(x).getCEPinicial());
//                System.out.println("CEPFinal:" + faixasCEPMicrozona.get(x).getCEPfinal());
                
//                objetoJson.put(faixasCEPMicrozona.get(x).getClass().getdeclaretion, faixasCEPMicrozona.get(x).getFaixasCEPMicrozonaPK().getCodigoMicrozona());
                                
                objetoJson.put("microzona", faixasCEPMicrozona.get(x).getFaixasCEPMicrozonaPK().getCodigoMicrozona());
                objetoJson.put("sequencial", faixasCEPMicrozona.get(x).getFaixasCEPMicrozonaPK().getCodigoSequencial());
                objetoJson.put("cepInicial", faixasCEPMicrozona.get(x).getCEPinicial());
                objetoJson.put("cepFinal", faixasCEPMicrozona.get(x).getCEPfinal());                
                
//                System.out.println(objetoJson.toJSONString());
            }
        }
        
        return ResponseEntity.ok().body(objetoJson);        
    }
    
}