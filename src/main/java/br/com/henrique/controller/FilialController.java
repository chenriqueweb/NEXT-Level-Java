package br.com.henrique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.henrique.model.Filial;
import br.com.henrique.service.FilialService;

@RestController
@RequestMapping(path = "/filial")
public class FilialController {
    
    @Autowired
    private FilialService filialService;

    // Lista Filiais
    @GetMapping
    public List<Filial> findAll() {
        List<Filial> filiais = filialService.findAll();
        return filiais;
    }
//    
//    // Busca por Filial
//    @GetMapping(path = "{empresa}/{codigo}")
//    public Optional<Filial> findByAll(@PathVariable Long codigoEmpresa, @PathVariable Long codigoFilial) {
//        Optional<Filial> filial = filialService.findById(codigoEmpresa, codigoFilial);
//        return filial;
//    }
//   
    // Inclui Filial
    @PostMapping
    public void addFilial(@RequestBody Filial Filial) {
        filialService.addFilial(Filial);
    }
//    
//    // Altera Filial
////    @PutMapping(path =  "{empresa}/{codigo}")
////    public void updateFilial(@PathVariable Long codigoEmpresa, @PathVariable Long codigoFilial,
////                              @RequestBody Filial filial) {
////        filialService.updateFilial(codigoEmpresa, codigoFilial, filial);
////    }
//    
//    // Deleta Filial = method Delete
////    @DeleteMapping(path = "{empresa}/{codigo}")
////    public void deletaFilial(@PathVariable Long codigoEmpresa, @PathVariable Long codigoFilial) {
////       filialService.deletaFilial(codigoEmpresa, codigoFilial);
////    }    
}
