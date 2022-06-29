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
    
    // Inclui Filial
    @PostMapping
    public void addFilial(@RequestBody Filial filial) {
        filialService.addFilial(filial);
    }
}
